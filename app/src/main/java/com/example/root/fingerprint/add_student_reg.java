package com.example.root.fingerprint;

public class add_student_reg {
    String id;
    String Student_regno;
    String Student_name;
    String Student_level;
    String Student_phone;
    String Student_address;
    String Student_email;

    public add_student_reg(String id, String student_regno, String student_name, String student_level, String student_phone, String student_address, String student_email) {
        this.id = id;
        Student_regno = student_regno;
        Student_name = student_name;
        Student_level = student_level;
        Student_phone = student_phone;
        Student_address = student_address;
        Student_email=student_email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudent_regno() {
        return Student_regno;
    }

    public void setStudent_regno(String student_regno) {
        Student_regno = student_regno;
    }

    public String getStudent_name() {
        return Student_name;
    }

    public void setStudent_name(String student_name) {
        Student_name = student_name;
    }

    public String getStudent_level() {
        return Student_level;
    }

    public void setStudent_level(String student_level) {
        Student_level = student_level;
    }

    public String getStudent_phone() {
        return Student_phone;
    }

    public void setStudent_phone(String student_phone) {
        Student_phone = student_phone;
    }

    public String getStudent_address() {
        return Student_address;
    }

    public void setStudent_address(String student_address) {
        Student_address = student_address;
    }
}
