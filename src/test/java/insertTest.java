import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class insertTest {

    public static void main(String args[]){

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("lab5");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();



    }

}
