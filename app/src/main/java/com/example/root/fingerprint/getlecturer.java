package com.example.root.fingerprint;

public class getlecturer {
    String lecturer_id;
    String lecturer_name;
    String lecturer_phone;
    String lecturer_address;

    public getlecturer(String lecturer_id, String lecturer_name, String lecturer_phone, String lecturer_address) {
        this.lecturer_id = lecturer_id;
        this.lecturer_name = lecturer_name;
        this.lecturer_phone = lecturer_phone;
        this.lecturer_address = lecturer_address;
    }

    public String getLecturer_id() {
        return lecturer_id;
    }

    public void setLecturer_id(String lecturer_id) {
        this.lecturer_id = lecturer_id;
    }

    public String getLecturer_name() {
        return lecturer_name;
    }

    public void setLecturer_name(String lecturer_name) {
        this.lecturer_name = lecturer_name;
    }

    public String getLecturer_phone() {
        return lecturer_phone;
    }

    public void setLecturer_phone(String lecturer_phone) {
        this.lecturer_phone = lecturer_phone;
    }

    public String getLecturer_address() {
        return lecturer_address;
    }

    public void setLecturer_address(String lecturer_address) {
        this.lecturer_address = lecturer_address;
    }
}
