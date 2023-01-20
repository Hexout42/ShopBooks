package ru.lernup.shopbooks.Db;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import ru.lernup.shopbooks.Db.model.*;

import java.util.List;
import java.util.Scanner;

public class DbHelper {

    private final SessionFactory sessionFactory;
    public DbHelper(){
        Configuration configuration = new Configuration().configure();
        this.sessionFactory = configuration.buildSessionFactory();
    }

    public void addBook(String name,int age, int idAuthor, int price, int numberOfPages,int quantity){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee = new Employee();
        employee.setName("Steve");
        Consumer consumer = new Consumer();
        consumer.setAllNameConsumer("GreedOFRath");
        consumer.setBirthDate("24.05.1999");
        OrderConsumer orderConsumer = new OrderConsumer();
        orderConsumer.setConsumer(consumer);
        orderConsumer.setCost(56);
        Book book = new Book();
        book.setNameBook("Tree");
        book.setAgeBook(age);
        book.setNumberOfPages(numberOfPages);
        book.setPriceBook(price);
        Author author =new Author();
        author.setBooks(List.of(book));
        author.setAllNameAuthor(name);
        BookHouse bookHouse = new BookHouse();
        bookHouse.setBook(book);
        bookHouse.setQuantity(10);
        book.setBookHouse(bookHouse);
        book.setIdAuthor(author);
        DetailsOrder detailsOrder = new DetailsOrder();
        detailsOrder.setIdBook(book);
        detailsOrder.setIdOrder(orderConsumer);
        detailsOrder.setQuantity(10);
        detailsOrder.setIdEmployee(employee);
        book.setDetailsOrder(detailsOrder);
        employee.setDetailsOrders(List.of(detailsOrder));
        orderConsumer.setDetailsOrders(List.of(detailsOrder));
        consumer.setOrderConsumer(orderConsumer);



        session.save(author);
        session.save(book);
        session.save(consumer);
        session.save(bookHouse);
        session.save(employee);
        session.save(orderConsumer);
        session.save(detailsOrder);
        transaction.commit();
    }
    public void putAllBookIntoOrder(int idOrder){
        Session  session = sessionFactory.openSession();
        Query query = session.createQuery("from OrderConsumer t where t.id  = :tbleventId");
        query.setParameter("tbleventId", idOrder);
        List<OrderConsumer> list = query.getResultList();
        for(int i=0;i<list.size();i++){
        List<DetailsOrder> orders = list.get(i).getDetailsOrders();
            for(DetailsOrder order: orders){
            System.out.println(order.getIdBook().toString());
            }
        }
    }
}




