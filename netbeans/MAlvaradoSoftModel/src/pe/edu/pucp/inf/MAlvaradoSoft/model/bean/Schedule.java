/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.MAlvaradoSoft.model.bean;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author alulab14
 */
public class Schedule {
    private int idSchedule;
    private Classroom classroom;
    private ArrayList<Event> events;
    private ArrayList<Date> days;
    private Time startTime;
    private Time endTime;
    private int tableStatus;

    public Schedule() {
    }

    public Schedule(int idSchedule, Classroom classroom, ArrayList<Event> events, ArrayList<Date> days, Time startTime, Time endTime, int tableStatus) {
        this.idSchedule = idSchedule;
        this.classroom = classroom;
        this.events = events;
        this.days = days;
        this.startTime = startTime;
        this.endTime = endTime;
        this.tableStatus = tableStatus;
    }

    public int getIdSchedule() {
        return idSchedule;
    }

    public void setIdSchedule(int idSchedule) {
        this.idSchedule = idSchedule;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    public ArrayList<Date> getDays() {
        return days;
    }

    public void setDays(ArrayList<Date> days) {
        this.days = days;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public int getTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(int tableStatus) {
        this.tableStatus = tableStatus;
    }

    
}
