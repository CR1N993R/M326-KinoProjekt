package ch.tbz.kinoverwaltung.server.backend;

import ch.tbz.kinoverwaltung.server.backend.util.Hibernate;

import java.util.ArrayList;

public class Cinema {
    private static ArrayList<CinemaHall> cinemaHalls = new ArrayList<>();
    private static ArrayList<Film> films = new ArrayList<>();
    private static ArrayList<User> users = new ArrayList<>();

    public static void loadData(){
        cinemaHalls.addAll(Hibernate.getAllObjectsFrom(CinemaHall.class));
        films.addAll(Hibernate.getAllObjectsFrom(Film.class));
        users.addAll(Hibernate.getAllObjectsFrom(User.class));
        System.out.println();
    }

    public static void createUser(String name, String password){
        users.add(new User());
    }

    public static void removeUser(User user){

    }
}
