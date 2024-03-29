/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.MAlvaradoSoft.model.bean;

import java.util.ArrayList;

/**
 *
 * @author alulab14
 */
public class CourseXSchedule {
    private int idCourseXSchedule;
    private ClassSection classSection;
    private Schedule schedule;
    private Teacher teacher;
    private Course course;
    private ArrayList<Grade> grades;
    private int tableStatus;
    
    public CourseXSchedule(Schedule schedule, ArrayList<Grade> grades, int codTeacher, Course course, char section) {
        this.schedule = schedule;
        this.grades = grades;
        this.codTeacher = codTeacher;
        this.course = course;
        this.section = section;
    }

    public int getIdCourseSchedule() {
        return idCourseSchedule;
    }

    public void setIdCourseSchedule(int idCourseSchedule) {
        this.idCourseSchedule = idCourseSchedule;
    }

    public int getIdClassSection() {
        return idClassSection;
    }

    public void setIdClassSection(int idClassSection) {
        this.idClassSection = idClassSection;
    }

    

    public CourseXSchedule() {
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }

    

    public int getCodTeacher() {
        return codTeacher;
    }

    public void setCodTeacher(int codTeacher) {
        this.codTeacher = codTeacher;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }
    
}
