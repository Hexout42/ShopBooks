package ru.lernup.shopbooks.Db.model;

public class BookHouseBuilder {
    private int quantity;
    private Book book;
    public  BookHouseBuilder withQuantity(int quantity){
        this.quantity = quantity;
        return this;
    }
    public  BookHouseBuilder withBook(Book book){
        this.book =book;
        return this;
    }
    public BookHouse build(){
        BookHouse bookHouse = new BookHouse();
        bookHouse.setQuantity(quantity);
        bookHouse.setBook(book);
        return bookHouse;
    }
}
