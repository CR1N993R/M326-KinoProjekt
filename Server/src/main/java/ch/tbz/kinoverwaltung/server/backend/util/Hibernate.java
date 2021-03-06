package ch.tbz.kinoverwaltung.server.backend.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Map;

public class Hibernate {
    private static EntityManager manager;

    public static <T> List<T> getAllObjectsFrom(String tableName, Class<T> type){
        TypedQuery<T> tq = manager.createQuery("SELECT * from " + tableName, type);
        return tq.getResultList();
    }

    public static synchronized void persistObject(Object o){
        manager.getTransaction().begin();
        manager.persist(o);
        manager.flush();
        manager.getTransaction().commit();
    }

    public static void init(){
        manager = Persistence.createEntityManagerFactory("ch.tbz.kinoverwaltung.server").createEntityManager();
    }
}
