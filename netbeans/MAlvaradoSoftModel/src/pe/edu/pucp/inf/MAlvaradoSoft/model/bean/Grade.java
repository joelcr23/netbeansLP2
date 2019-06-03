/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.MAlvaradoSoft.model.bean;

import java.util.Date;

/**
 *
 * @author alulab14
 */
public class Grade {
    private int idGrade;
    private Student student;
    private CourseXSchedule coursexschedule;
    private String description;
    private double weight;
    private int tableStatus;

    public Grade(int idGrade, Student student, CourseXSchedule coursexschedule, String description, double weight, int tableStatus) {
        this.idGrade = idGrade;
        this.student = student;
        this.coursexschedule = coursexschedule;
        this.description = description;
        this.weight = weight;
        this.tableStatus = tableStatus;
    }

    public Grade() {
    }
    
    public int getIdGrade() {
        return idGrade;
    }

    public void setIdGrade(int idGrade) {
        this.idGrade = idGrade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public CourseXSchedule getCoursexschedule() {
        return coursexschedule;
    }

    public void setCoursexschedule(CourseXSchedule coursexschedule) {
        this.coursexschedule = coursexschedule;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(int tableStatus) {
        this.tableStatus = tableStatus;
    }
    
    
    
}
