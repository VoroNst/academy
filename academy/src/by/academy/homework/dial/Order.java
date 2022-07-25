package by.academy.homework.dial;

//import src.constants.Constants;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Order {
    Map<Integer, Product> _basket;

    public Order (){
        _basket = new HashMap<>();
    }

    public Date getDeadlineDate(){
        LocalDate localDate = LocalDate.now().plusDays(10);
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public double getBasketPrice(){
        return _basket.entrySet().stream().mapToDouble(x->x.getValue().getFullPrice()).sum();
    }

    public boolean basketIsEmpty(){
        return  _basket.entrySet().isEmpty();
    }
    public boolean basketContaintsKey(int key){
        return _basket.containsKey(key);
    }

    public Product getProduct(int key){
        return _basket.containsKey(key)
                ? _basket.get(key)
                : null;
    }
    public void putProduct(Product product, int key){

        _basket.put(key, product);
        //basket recalculate
        _basket.entrySet().removeIf(x->x.getValue().getFullPrice() <= 0);
    }
    public String printReceipt(){

        StringBuilder builder = new StringBuilder();
        //print a receipt
        for (var entry : _basket.entrySet()) {
            builder.append(entry.getValue().getProductInfo());
            builder.append(System.lineSeparator());
        }

        String totalPriceMaessage = MessageFormat.format(Constants.Message.TotalPriceTextFormat,getBasketPrice());
        builder.append(totalPriceMaessage);
        return builder.toString();
    }

    public String getBasketInfo(){

        if(basketIsEmpty())
            return Constants.Message.EmptyBasketText;

        String mapAsString = _basket.keySet().stream()
                .map(key ->  _basket.get(key).getShortInfo())
                .collect(Collectors.joining("; ", "[", "]"));
        return mapAsString;
    }
}
