package ru.lernup.shopbooks.Db.model;



import lombok.Getter;
import lombok.Setter;



import jakarta.persistence.*;

import java.util.List;

@Setter
@Getter
@Entity
@Table


public class Consumer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column(name = "all_name_consumer")
    private String allNameConsumer;

    @Column(name = "birth_date")
    private String birthDate;
    @OneToOne(mappedBy = "consumer")
    private OrderConsumer orderConsumer;


}
