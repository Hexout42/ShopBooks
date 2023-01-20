package ru.lernup.shopbooks.Db.model;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;



import java.util.List;
@Setter
@Getter
@Entity
@Table(name = "book_house")

public class BookHouse {
    @Id
    @OneToOne
    @JoinColumn(name = "id")
    private Book book;


    @Column(name = "quantity")
    private int quantity;
}
