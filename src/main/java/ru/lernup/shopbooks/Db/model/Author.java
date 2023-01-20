package ru.lernup.shopbooks.Db.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;


@Setter
@Getter
@Entity
@Table
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "all_name_author")
    private String allNameAuthor;
    @OneToMany(mappedBy = "idAuthor")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Book> books;

    @Override
    public String toString() {
        return "Author{ " +
                "allNameAuthor= " + allNameAuthor + " }";
    }
}
