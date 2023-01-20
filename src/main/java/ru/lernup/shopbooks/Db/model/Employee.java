package ru.lernup.shopbooks.Db.model;


import lombok.Getter;
import lombok.Setter;



import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;


@Entity
@Table
@Getter
@Setter
public class Employee {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column(name = "name")
    private  String name;

    @Override
    public String toString() {
        return name;
    }
    @OneToMany(mappedBy = "idEmployee")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<DetailsOrder> detailsOrders;
}
