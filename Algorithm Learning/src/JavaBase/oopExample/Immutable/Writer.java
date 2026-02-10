package JavaBase.oopExample.Immutable;

public final class Writer {
    private final String name;
    private final int age;

    private final Book book;

    public Writer(String name, int age, Book book) {
        this.name = name;
        this.age = age;
        this.book = book;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public Book getBook(){
        Book clone = new Book();
        clone.setPrice(this.book.getPrice());
        clone.setName(this.book.getName());
        return clone;
    }
}
