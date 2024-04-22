package com.iesam.library.features.user.domain;
public class User {

    public final Integer id;
    public final String name;
    public final String surname;
    public final String dni;


    public User(Integer id, String dni, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "- Usuario: " +
                "id=" + id +
                ", nombre ='" + name + '\'' +
                ", apellido='" + surname + '\'' +
                ", dni ='" + dni + '\'' +
                '}';
    }
}
