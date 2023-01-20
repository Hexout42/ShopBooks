package ru.lernup.shopbooks.Db.model;

import lombok.Getter;
import lombok.Setter;



import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Table(name = "order_consumer")
@Setter
@Getter

public class OrderConsumer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne()
    @JoinColumn(name = "id_consumer")
    private Consumer consumer;

    @Column(name = "cost")
    private int cost;
    @OneToMany(mappedBy = "idOrder")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<DetailsOrder> detailsOrders;

    @Override
    public String toString() {
        return "I'm order" + id;
    }
}
