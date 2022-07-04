package by.academy.dial;


import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;


import by.academy.dial.validators.BelarusPhoneValidator;
import by.academy.dial.validators.DateValidator;
import by.academy.dial.validators.EmailValidator;
import by.academy.dial.validators.PhoneValidator;


public class Application {
    public static void main(String[] args) {

        User buyer = CreateUser("Покупателя ");
        User seller = CreateUser("Продавца ");
        double discount = 0.03;

        Product[] shopProducts = new Product[]{
                new Apple(10, discount),
                new Carrot(5, discount),
                new Potato(2, discount)
        };


        System.out.println(buyer.getName() + "\n" + buyer.getMoney());


        Order order = new Order();

        while (true) {
            String basketInfoMessage = MessageFormat.format(Constants.Message.BasketInfoTextFormat, order.getBasketInfo());
            String chooseProductMessage = MessageFormat.format(Constants.Message.ChooseProductTextFormat, printShopProducts(shopProducts));
            System.out.println(basketInfoMessage);
            int answer = getAnswerInt(chooseProductMessage);

            Product product = order.getProduct(answer) != null
                    ? order.getProduct(answer)
                    : getProduct(answer, shopProducts);

            if (product == null && buyer.getMoney() < order.getBasketPrice()) {

                System.out.println("Не хватает денег, чтобы создать покупку!. ");
                System.out.println("Если вы собираетесь уйти, вы должны удалить товар из корзины. ");
                System.out.println("Для удаления - пожалуйста, установите отрицательное количество товара (например -3). ");
                continue;
            }

            if (product == null)
                break;


            String enterQuantityMessage = MessageFormat.format(Constants.Message.EnterQuantityTextFormat, product.getName());
            int quantity = getAnswerInt(enterQuantityMessage);

            product.setQuantity(quantity);

            order.putProduct(product, answer);
        }

        if (order.basketIsEmpty()) {
            System.out.println(Constants.Message.ExitEmptyBasketText);
            return;
        }

        System.out.println(Constants.Message.SuccesfulText);
        String deadlineMessage = MessageFormat.format(Constants.Message.DeadlineOrderTextFormat, order.getDeadlineDate());
        System.out.println(deadlineMessage);
        System.out.println(order.printReceipt());

        double basketPrice = order.getBasketPrice();
        buyer.pay(basketPrice);
        seller.setMoney(basketPrice);

        printUserMoneyInfo(buyer);
        printUserMoneyInfo(seller);
    }

    public static void printUserMoneyInfo(User user) {
        System.out.println(user.getName() + " есть " + user.getMoney());
    }

    public static String printShopProducts(Product[] products) {
        String mapAsString = Arrays.stream(products)
                .map(product -> Arrays.asList(products).indexOf(product) + " - " + product.getName())
                .collect(Collectors.joining("; "));
        return mapAsString;
    }

    public static String getAnswerStrValidate(String message, IValidator validator) {
        String result = "";
        while (true) {
            System.out.println(message);
            try {
                result = new Scanner(System.in).nextLine();
                if (!validator.validate(result)) {
                    System.out.println(Constants.ExceptionMessage.InputStringNotValid);
                    continue;
                }
                break;

            } catch (Exception e) {
                System.out.println(Constants.ExceptionMessage.InputMismatchExceptionMessage);
            }
        }
        return result;
    }

    public static Date getAnswerDate(String message, DateValidator validator) {
        Date result = new Date();
        while (true) {
            System.out.println(message);
            try {
                String source = new Scanner(System.in).nextLine();
                if (!validator.validate(source)) {
                    System.out.println(Constants.ExceptionMessage.InputStringNotValid);
                    continue;
                }
                String pattern = source.indexOf("-") > -1 ? "dd-MM-yyyy" : "dd/MM/yyyy";
                SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
                result = dateFormat.parse(source);
                break;
            } catch (ParseException e) {
                System.out.println(Constants.ExceptionMessage.InputMismatchExceptionMessage);
            }
        }
        return result;
    }

    public static int getAnswerInt(String message) {
        int result = 0;
        while (true) {
            System.out.println(message);
            try {
                result = new Scanner(System.in).nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println(Constants.ExceptionMessage.InputMismatchExceptionMessage);
            }
        }
        return result;
    }

    public static double getAnswerDouble(String message) {
        double result = 0;
        while (true) {
            System.out.println(message);
            try {
                result = new Scanner(System.in).nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println(Constants.ExceptionMessage.InputMismatchExceptionMessage);
            }
        }
        return result;
    }

    public static Product getProduct(int code, Product[] shopProducts) {
        try {
            return shopProducts[code];
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public static User CreateUser(String str) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Имя " + str);
        String userName = scan.nextLine();
        double userMoney = getAnswerDouble("Деньги " + str);
        Date userDate = getAnswerDate("Формат даты [dd/MM/yyyy or dd-MM-yyyy] " + str, new DateValidator());
        String email = getAnswerStrValidate("Введите электронную почту " + str, new EmailValidator());
        String phone = getAnswerStrValidate("Введите телефон " + str, new PhoneValidator());
        //String
        return new User(userName, userMoney, email, phone, userDate);
    }
}
