package ru.lernup.shopbooks.Db.model;



public class OrderConsumerBuilder {
    private int idConsumer;
    private Consumer consumer;

    private int cost;
    public OrderConsumerBuilder withCost(int cost){
        this.cost = cost;
        return this;
    }

    public OrderConsumerBuilder withConsumer(Consumer consumer){
        this.consumer = consumer;
        return this;
    }
    public OrderConsumer build(){
        OrderConsumer orderConsumer = new OrderConsumer();
        orderConsumer.setCost(cost);
        orderConsumer.setConsumer(consumer);
        return orderConsumer;
    }
}
