package ru.lernup.shopbooks.Db.model;

import java.util.List;

public class ConsumerBuilder {
    private int id;
    private String allNameConsumer;
    private String birthDate;
    private OrderConsumer orderConsumers;
    public ConsumerBuilder withAllNameConsumer(String allNameConsumer){
        this.allNameConsumer = allNameConsumer;
        return this;
    }
    public ConsumerBuilder withBirthDate(String birthDate){
        this.birthDate = birthDate;
        return this;
    }
    public ConsumerBuilder withOrders(OrderConsumer orderConsumers){
        this.orderConsumers = orderConsumers;
        return  this;
    }
    public Consumer build(){
        Consumer consumer = new Consumer();
        consumer.setAllNameConsumer(allNameConsumer);
        consumer.setBirthDate(birthDate);
        consumer.setOrderConsumer(List.of(orderConsumers));
        return consumer;
    }
}
