package com.example.root.fingerprint;

public class edtadd_course {
    String id;
    String course_name;
    String course_id;

    public edtadd_course(String id, String course_name, String course_id) {
        this.id = id;
        this.course_name = course_name;
        this.course_id = course_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }
}
