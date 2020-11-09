/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualproject;

import java.util.Date;
import java.time.LocalDate;
import java.util.List;
/**
 *
 * @author kostis
 */
public class Course {
    String title; // CB11 Part Time Java
    String stream; //Java,Python,Javascript
    String type; // Part Time, Full Time
    LocalDate startDate; // 15/07/2020
    LocalDate endDate; // 31/01/2021
    
    Course(){
    
    }
    public Course(String title, String stream,String type,LocalDate startDate,LocalDate endDate){
     this.title = title;
     this.stream = stream;
     this.type = type;
     this.startDate = startDate;
     this.endDate = endDate;
    
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    

    
    @Override
    public String toString() {
        return "Course{" + "title=" + title + ", stream=" + stream + ", type=" + type + ", startDate=" + startDate + ", endDate=" + endDate + '}'+ "\n";
    }
    
    
}
