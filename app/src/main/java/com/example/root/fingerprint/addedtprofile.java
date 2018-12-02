package com.example.root.fingerprint;

public class addedtprofile {
String id;
String name;
String address;
String phone;
String course;

    public addedtprofile(String id, String name, String address, String phone, String course) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
