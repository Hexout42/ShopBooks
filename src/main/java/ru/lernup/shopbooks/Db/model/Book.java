package ru.lernup.shopbooks.Db.model;

import lombok.Getter;
import lombok.Setter;



import jakarta.persistence.*;
@Setter
@Getter
@Entity
@Table(name = "book")

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    @Column(name = "name_book")
    private String nameBook;

    @JoinColumn(name = "id_author")
    @ManyToOne
    private Author idAuthor;
    @Column(name = "age_book")
    private int ageBook;
    @Column(name="number_of_pages")
    private int numberOfPages;
    @Column(name="price_book")
    private int priceBook;
    @OneToOne(mappedBy = "book")
    private BookHouse bookHouse;
    @OneToOne(mappedBy = "idBook")
    private DetailsOrder detailsOrder;

    @Override
    public String toString() {
        return  nameBook + " " + idAuthor.toString() + " Год выпуска " + ageBook + " колличество страниц "
        + numberOfPages + " стоимость " + priceBook;
    }
}
