/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualproject;

import static individualproject.IndividualProject.Java;
import static individualproject.IndividualProject.JavaAssignments;
import static individualproject.IndividualProject.Python;
import static individualproject.IndividualProject.cSharpAssignments;
import static individualproject.IndividualProject.csharp;
import static individualproject.IndividualProject.javaScript;
import static individualproject.IndividualProject.pythonAssignments;
import static individualproject.IndividualProject.students;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author kostis
 */
public class HardcodedData {

// Creating objects of class Student using random names
    Student student1 = new Student("Nick", "Papadopoulos", LocalDate.parse("1985-01-02"), 800);
    Student student2 = new Student("Agnes ", "Michael", LocalDate.parse("1988-07-30"), 700);
    Student student3 = new Student("Blake", "Reese", LocalDate.parse("1988-07-30"), 700);
    Student student4 = new Student("Poppie", "Sykes", LocalDate.parse("1988-07-30"), 700);
    Student student5 = new Student("Ioana", "Rubio", LocalDate.parse("1988-07-30"), 700);
    Student student6 = new Student("Kate", "Roth", LocalDate.parse("1988-07-30"), 700);
    Student student7 = new Student("Xena", "Dolan", LocalDate.parse("1988-07-30"), 700);
    Student student8 = new Student("Iain", "Pacheco", LocalDate.parse("1988-07-30"), 700);

//
    public void listOfStudents() {
        IndividualProject.students.add(student1);
        IndividualProject.students.add(student2);
        IndividualProject.students.add(student3);
        IndividualProject.students.add(student4);
        IndividualProject.students.add(student5);
        IndividualProject.students.add(student6);
        IndividualProject.students.add(student7);
        IndividualProject.students.add(student8);
    }

    public void insertStudentsPerCourse() {
        IndividualProject.Java.add(student1);
        IndividualProject.Java.add(student2);
        IndividualProject.csharp.add(student1);
        IndividualProject.csharp.add(student4);
        IndividualProject.javaScript.add(student5);
        IndividualProject.javaScript.add(student6);
        IndividualProject.Python.add(student7);
        IndividualProject.Python.add(student8);
    }

    // Creating objects of class Trainer using random names
    Trainer trainer1 = new Trainer("Billie ", "Irving", "C#");
    Trainer trainer2 = new Trainer("Alexia", "Roberson", "Java");
    Trainer trainer3 = new Trainer("Franklyn", "Anderson", "Javascript");
    Trainer trainer4 = new Trainer("Ronan", "Delgado", "Python");

    public void listOfTrainers() {
        IndividualProject.trainers.add(trainer1);
        IndividualProject.trainers.add(trainer2);
        IndividualProject.trainers.add(trainer3);
        IndividualProject.trainers.add(trainer4);
    }

    public void insertTrainersPerCourse() {
        IndividualProject.cSharpTrainer.add(trainer1);
        IndividualProject.javaTrainer.add(trainer2);
        IndividualProject.javaScriptTrainer.add(trainer3);
        IndividualProject.pythonTrainer.add(trainer4);
    }

    // Creating objects of class Course using random names in general\
    Course java = new Course("Course 1 Java", "Java", "Full time", LocalDate.parse("2019-03-20"), LocalDate.parse("2019-08-10"));
    Course cSharp = new Course("Course 2 C#", "C#", "Part time", LocalDate.parse("2019-03-20"), LocalDate.parse("2019-08-10"));
    Course javaScript = new Course("Course 3 Javascript", "Javascript", "Full time", LocalDate.parse("2019-01-06"), LocalDate.parse("2019-05-18"));
    Course python = new Course("Course 4 Python", "Python", "Part time", LocalDate.parse("2019-03-30"), LocalDate.parse("2019-08-12"));

    public void listOfCourses() {
        IndividualProject.courses.add(java);
        IndividualProject.courses.add(cSharp);
        IndividualProject.courses.add(javaScript);
        IndividualProject.courses.add(python);
    }
    // Creating objects of class assignment using the 4 courses Java,CSharp,JavaScript,Python
    Assignment assignment1 = new Assignment("Java Exercises", " Solving math exercises", LocalDate.parse("2019-02-20"), 8, 3);
    Assignment assignment2 = new Assignment("CSharp exercises", "Laboratory on programming languages", LocalDate.parse("2019-02-20"), 4, 10);
    Assignment assignment3 = new Assignment("JavaScript exercises", "Designing and developing algorithms", LocalDate.parse("2019-03-10"), 6, 9);
    Assignment assignment4 = new Assignment("Python Exercises", "Developing data structures", LocalDate.parse("2019-04-06"), 3, 9);

    public void listOfAssignments() {
        IndividualProject.assignments.add(assignment1);
        IndividualProject.assignments.add(assignment2);
        IndividualProject.assignments.add(assignment3);
        IndividualProject.assignments.add(assignment4);
    }

    public void insertAssignmentsPerCourse() {
        IndividualProject.JavaAssignments.add(assignment1);
        IndividualProject.cSharpAssignments.add(assignment2);
        IndividualProject.javaScriptAssignments.add(assignment3);
        IndividualProject.pythonAssignments.add(assignment4);
    }

    public void insertStudentsPerAssignments() {
        IndividualProject.JavaStudent.add(student1);
        IndividualProject.JavaStudent.add(student2);
        IndividualProject.cSharpStudent.add(student3);
        IndividualProject.cSharpStudent.add(student4);
        IndividualProject.JavaScriptStudent.add(student5);
        IndividualProject.JavaScriptStudent.add(student6);
        IndividualProject.PythonStudent.add(student7);
        IndividualProject.PythonStudent.add(student8);

    }

    //it shows the student that have same courses from Hardcoded(Synthetic) Data
    public void coursesPerStudentHD() {
        HardcodedData hd = new HardcodedData();

        hd.listOfStudents();
        hd.insertStudentsPerCourse();
        List<Student> studentMoreCourses = new ArrayList<>();

        for (Student student : students) {
            int count = 0;
            if (Java.contains(student)) {
                count++;
            }
            if (csharp.contains(student)) {
                count++;
            }
            //if (javaScript.contains) {
            //  studentCount++;
            //}
            if (Python.contains(student)) {
                count++;
            }
            if (count > 1) {
                studentMoreCourses.add(student);
            }
        }
        System.out.println("Students with more than one courses are:\n" + studentMoreCourses);
    }

    //method that adds to an arraylist the students that have an assignment in the same week to submit from Synthetic data
    public void assignmentDate() {
        HardcodedData hd = new HardcodedData();
        Scanner input = new Scanner(System.in);
        System.out.println("Give submission date:");
        String date_input = input.next();
        LocalDate input_date = LocalDate.parse(date_input);

        LocalDate firstDayOfWeek = input_date.with(DayOfWeek.MONDAY);
        LocalDate lastDayOfWeek = input_date.with(DayOfWeek.FRIDAY);
        List<Student> sameWeekAssignStudent = new ArrayList();

        hd.listOfStudents();
        hd.insertStudentsPerCourse();
        hd.insertAssignmentsPerCourse();

        for (Student student : students) {
            if (Java.contains(student)) {
                for (Assignment assignment : JavaAssignments) {
                    if (!((assignment.getSubDateTime().isBefore(firstDayOfWeek)) || (assignment.getSubDateTime().isAfter(lastDayOfWeek)))) {
                        sameWeekAssignStudent.add(student);
                    }
                }

            }
            if (csharp.contains(student)) {
                for (Assignment assignment : cSharpAssignments) {
                    if (!((assignment.getSubDateTime().isBefore(firstDayOfWeek)) || (assignment.getSubDateTime().isAfter(lastDayOfWeek)))) {
                        sameWeekAssignStudent.add(student);
                    }
                }
            }
            if (Python.contains(student)) {
                for (Assignment assignment : pythonAssignments) {
                    if (!((assignment.getSubDateTime().isBefore(firstDayOfWeek)) || (assignment.getSubDateTime().isAfter(lastDayOfWeek)))) {
                        sameWeekAssignStudent.add(student);
                    }
                }

            }

        }
        if (sameWeekAssignStudent.isEmpty()) {
            System.out.println("There is no assignment to be submitted on the same calendar week as the given date.\n");
        } else {
            System.out.println("Students who need to submit one or more assignments on the same calendar week as the given date are:\n" + sameWeekAssignStudent);
        }
    }
}
