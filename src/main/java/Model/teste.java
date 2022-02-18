package Model;

import org.hibernate.jpa.boot.spi.EntityManagerFactoryBuilder;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class teste {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("lab5");

        factory.close();

    }

}
