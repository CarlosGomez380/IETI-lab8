package com.eci.cosw.springbootsecureapi.model;

import java.util.Date;

public class Task {
    private Date date;
    private String status;
    private String description;
    private String responsable;

    public Task(Date date, String status, String description, String responsable){
        this.date=date;
        this.status=status;
        this.description=description;
        this.responsable=responsable;
    }

    public Date getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public String getResponsable() {
        return responsable;
    }
}
