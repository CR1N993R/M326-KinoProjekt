package ch.tbz.kinoverwaltung.server;

import ch.tbz.kinoverwaltung.server.backend.Cinema;
import ch.tbz.kinoverwaltung.server.backend.util.Hibernate;

public class Main {
    public static void main(String[] args) {
        Hibernate.init();
        Cinema.loadData();
    }
}
