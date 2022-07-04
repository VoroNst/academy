package by.academy.dial;

public abstract class Product
{
    private String _name;
    private double _cost;
    private double _discount;
    private int _quantity;

    public Product(String name, double cost, double discount){
        _name = name;
        _cost = cost;
        _discount = discount;
        _quantity = 0;
    }
    public void setQuantity(int quantity){

        _quantity = (_quantity + quantity) < 0
                ? 0
                :  _quantity + quantity;
    }

    public String getName(){
        return _name;
    }
    public String getProductInfo(){
        return "Имя: "+ _name+ " Счет: "+ _quantity + " Цена за единицу: " + _cost + " Общая цена: "+ getFullPrice();
    }

    public String getShortInfo(){
        return "n: "+ _name+ " c: "+ _quantity +  " p: "+ getFullPrice();
    }
    public  double getFullPrice(){
        return _quantity * _cost;

    }
}
