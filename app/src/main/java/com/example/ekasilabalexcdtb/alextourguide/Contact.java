package com.example.ekasilabalexcdtb.alextourguide;

/**
 * Created by eKasiLab Alex CDTB on 19 Jul 2017.
 */

public class Contact {
    private String title;
    private String Name;
    private String Surname;
    private String email;



    public void setTitle(String title) {
        this.title = title;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;

    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getEmail() {
        return email;
    }
}
