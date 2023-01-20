package ru.lernup.shopbooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.lernup.shopbooks.Db.DbHelper;
import ru.lernup.shopbooks.Db.model.Employee;

@SpringBootApplication
public class ShopBooksApplication {

    public static void main(String[] args) {

      DbHelper helper = new DbHelper();

//        helper.addBook("Forest",23,4,65,100,6);
        helper.putAllBookIntoOrder(6);
    }

}
