package ru.lernup.shopbooks.Db.model;



public class AuthorBuilder {
    private long idAuthor;

    private String allNameAuthor;
    public AuthorBuilder withAllNameAuthor(String allNameAuthor){
        this.allNameAuthor=allNameAuthor;
        return this;
    }
    public Author build(){
        Author author=new Author();
        author.setAllNameAuthor(allNameAuthor);
        return author;
    }
}
