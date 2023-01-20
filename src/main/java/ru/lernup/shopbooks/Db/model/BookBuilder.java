package ru.lernup.shopbooks.Db.model;

import jakarta.persistence.Column;

public class BookBuilder {
    private long idBook;

    private String nameBook;


    private Author idAuthor;

    private int ageBook;

    private int numberOfPages;

    private int priceBook;
    private DetailsOrder detailsOrder;
    public BookBuilder withNameBook(String nameBook){
        this.nameBook=nameBook;
        return this;
    }
    public BookBuilder withIdAuthor(Author idAuthor){
    this.idAuthor=idAuthor;
    return this;
    }
    public BookBuilder withNumberOfPages(int numberOfPages){
    this.numberOfPages=numberOfPages;
    return this;
    }
    public BookBuilder withPriceBook(int priceBook){
    this.priceBook=priceBook;
    return this;
    }
    public BookBuilder withAgeBook(int ageBook){
     this.ageBook = ageBook;
     return this;
    }
    public Book build(){
        Book book = new Book();
        book.setAgeBook(ageBook);
        book.setNameBook(nameBook);
        book.setIdAuthor(idAuthor);
        book.setNumberOfPages(numberOfPages);
        book.setPriceBook(priceBook);
        return book;
    }


}
