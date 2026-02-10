package JavaBase.oopExample.Immutable;

public class WriterDemo {
    public static void main(String[] args) {
        Book DonQuixote = new Book();
        DonQuixote.setName("堂吉诃德");
        DonQuixote.setPrice(79);

        Writer writer = new Writer("塞万提斯",40,DonQuixote);
        System.out.println("price is :"+writer.getBook());

        writer.getBook().setPrice(59);
        System.out.println("The promotional price is : " + writer.getBook());
    }
}
