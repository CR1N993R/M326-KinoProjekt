package ch.tbz.kinoverwaltung.server.backend.util;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class Hibernate {
    private static EntityManager manager;

    public static <T> List<T> getAllObjectsFrom(Class<T> type){
        TypedQuery<T> tq = manager.createQuery("from " + type.getSimpleName(), type);
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
