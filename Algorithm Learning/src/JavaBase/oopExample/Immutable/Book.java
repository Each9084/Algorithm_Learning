package JavaBase.oopExample.Immutable;

public class Book {
    private String name;
    private int price;


    public String getName(){
        return name;
    }

    public String setName(String name){
        return this.name = name;
    }
    public int getPrice(){
        return price;
    }

    public int setPrice(int price){
        return this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
