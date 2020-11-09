/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualproject;

import static individualproject.IndividualProject.assignments;
import static individualproject.IndividualProject.Java;
import static individualproject.IndividualProject.JavaAssignments;
import static individualproject.IndividualProject.JavaScriptStudent;
import static individualproject.IndividualProject.JavaStudent;
import static individualproject.IndividualProject.csharp;
import static individualproject.IndividualProject.javaScript;
import static individualproject.IndividualProject.Python;
import static individualproject.IndividualProject.PythonStudent;
import static individualproject.IndividualProject.cSharpAssignments;
import static individualproject.IndividualProject.cSharpStudent;
import static individualproject.IndividualProject.cSharpTrainer;
import static individualproject.IndividualProject.courses;
import static individualproject.IndividualProject.javaScriptAssignments;
import static individualproject.IndividualProject.javaScriptTrainer;
import static individualproject.IndividualProject.javaTrainer;
import static individualproject.IndividualProject.pythonAssignments;
import static individualproject.IndividualProject.pythonTrainer;
import static individualproject.IndividualProject.students;
import static individualproject.IndividualProject.trainers;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author kostis
 */
public class Registration {

    //This is a method to register students from user's input 
    //and add them to the students list
    public void registerStudent() {
        System.out.println("Write Student's First Name: ");
        Scanner input_user = new Scanner(System.in);
        String studentFirstName = input_user.next();
        System.out.println("Write Student's Last Name: ");
        String studentLastName = input_user.next();

        int year, month, day;

        System.out.println("Write Student's Date of Birth: \n ");
        //it builds a wall for wrong answers and it prompts the user to enter the correct answer
        System.out.println("Write Day of Birth");
        do {
            while (!input_user.hasNextInt()) {
                System.out.println("Please give a number");
                input_user.next();
            }

            day = input_user.nextInt();
            if (day > 31 || day < 1) {
                System.out.println("Please give a number between 1-31!");
            }
        } while (day > 31 || day < 1);

        System.out.println("Enter Month of Birth : ");
        do {
            while (!input_user.hasNextInt()) {
                System.out.println("Please give a number");
                input_user.next();
            }
            month = input_user.nextInt();
            if (month > 12 || month < 1) {
                System.out.println("Please give a number between 1-12!");
            }
        } while (month > 12 || month < 1);
        System.out.println("Enter  Year of Birth : ");
        year = input_user.nextInt();
        LocalDate studentDateOfBirth = LocalDate.of(year, month, day);

        System.out.println("Write Student's Tuition Fees: ");
        int studentTuitionFees = Integer.valueOf(input_user.next());
        // Create a new object Student
        Student student = new Student(studentFirstName, studentLastName, studentDateOfBirth, studentTuitionFees);
        // Add student objects to the students list
        students.add(student);

        System.out.println("Please assign the student to a course,give a number from 1-4(1.Java,2.CSharp,3.Javascript,4.Python): ");
        int assign = input_user.nextInt();
        if (assign == 1) {
            Java.add(student);
        } else if (assign == 2) {
            csharp.add(student);
        } else if (assign == 3) {
            javaScript.add(student);
        } else if (assign == 4) {
            Python.add(student);
        }

        System.out.println("Please assign the student to an assignment,1.Java Assignment,2.CSharp Assignment,3.Javascript Assignment,4.Python Assignment): ");
        int assign2 = input_user.nextInt();
        if (assign2 == 1) {
            JavaStudent.add(student);
        } else if (assign2 == 2) {
            cSharpStudent.add(student);
        } else if (assign2 == 3) {
            JavaScriptStudent.add(student);
        } else if (assign2 == 4) {
            PythonStudent.add(student);
        }
    }

    // Method to create assignments from user's input and add them to the assignments list
    public void registerAssignment() {
        // Read data from user's input
        System.out.println("Write Assignment's Title: ");
        Scanner user_input = new Scanner(System.in);
        String assignmentTitle = user_input.next();
        System.out.println("Write Assignment's Description");
        String assignmentDescription = user_input.next();
        //it builds a wall for wrong answers and it prompts the user to enter the correct answer
        System.out.println("Write Assignment's Submision Date: ");
        int year, month, day;
        System.out.println("Write Day of Assignment");
        do {
            while (!user_input.hasNextInt()) {
                System.out.println("Please give a number");
                user_input.next();
            }

            day = user_input.nextInt();
            if (day > 31 || day < 1) {
                System.out.println("Please give a number between 1-31!");
            }
        } while (day > 31 || day < 1);

        System.out.println("Enter Month of Assignment : ");
        do {
            while (!user_input.hasNextInt()) {
                System.out.println("Please give a number");
                user_input.next();
            }
            month = user_input.nextInt();
            if (month > 12 || month < 1) {
                System.out.println("Please give a number between 1-12!");
            }
        } while (month > 12 || month < 1);
        System.out.println("Enter  Year of Assignment : ");
        year = user_input.nextInt();
        LocalDate assignmentSubDate = LocalDate.of(year, month, day);

        System.out.println("Write Assignment's Oral Mark: ");
        double assignmentOralMark = Double.valueOf(user_input.next());
        System.out.println("Write Assignment's total mark: ");
        double assignmentTotalMark = Double.valueOf(user_input.next());
        // Create Assignment
        Assignment assignment = new Assignment(assignmentTitle, assignmentDescription, assignmentSubDate, assignmentOralMark, assignmentTotalMark);
        // Add Assignment to the assignments list 
        assignments.add(assignment);

        //assign assignment to a course
        System.out.println("Please assign the assignment to a course(1.Java,2.CSharp,3.Javascript,4.Python): ");
        int assign = user_input.nextInt();
        if (assign == 1) {
            JavaAssignments.add(assignment);
        } else if (assign == 2) {
            cSharpAssignments.add(assignment);
        } else if (assign == 3) {
            javaScriptAssignments.add(assignment);
        } else if (assign == 4) {
            pythonAssignments.add(assignment);
        }

    }

    // Method to create courses from user's input and add them to the courses list    
    public void registerCourse() {
        // Read data from user's input
        int year, month, day;
        System.out.println("Write Course Title");
        Scanner input_user = new Scanner(System.in);
        String courseTitle = input_user.next();
        System.out.println("Write Course Stream");
        String courseStream = input_user.next();
        System.out.println("Write Course Type: ");
        String courseType = input_user.next();

        // Asks to add  Course start day
        //it builds a wall for wrong answers and it prompts the user to enter the correct answer
        System.out.println("Enter Course Start Day : ");
        do {
            while (!input_user.hasNextInt()) {
                System.out.println("Please give a number");
                input_user.next();
            }

            day = input_user.nextInt();
            if (day > 31 || day < 1) {
                System.out.println("Please give a number between 1-31!");
            }
        } while (day > 31 || day < 1);

        System.out.println("Enter Course Start Month : ");
        do {
            while (!input_user.hasNextInt()) {
                System.out.println("Please give a number");
                input_user.next();
            }
            month = input_user.nextInt();
            if (month > 12 || month < 1) {
                System.out.println("Please give a number between 1-12!");
            }
        } while (month > 12 || month < 1);

        System.out.println("Enter Course Start Year : ");
        year = input_user.nextInt();

        LocalDate courseStartDate = LocalDate.of(year, month, day);

        System.out.println("Write Course End Date: ");
        System.out.println("Enter Course End Day : ");
        do {
            while (!input_user.hasNextInt()) {
                System.out.println("Please give a number");
                input_user.next();
            }

            day = input_user.nextInt();
            if (day > 31 || day < 1) {
                System.out.println("Please give a number between 1-31!");
            }
        } while (day > 31 || day < 1);
        //day = input_user.nextInt();
        System.out.println("Enter Course End of Month : ");
        do {
            while (!input_user.hasNextInt()) {
                System.out.println("Please give a number");
                input_user.next();
            }
            month = input_user.nextInt();
            if (month > 12 || month < 1) {
                System.out.println("Please give a number between 1-12!");
            }
        } while (month > 12 || month < 1);
        //month = input_user.nextInt();
        System.out.println("Enter Course End of Year : ");
        year = input_user.nextInt();

        LocalDate courseEndDate = LocalDate.of(year, month, day);

        // Create Course
        Course course = new Course(courseTitle, courseStream, courseType, courseStartDate, courseEndDate);
        // Add Course to the courses list
        courses.add(course);
    }

    // This is a method to register trainers from user's input 
    //and add them to the trainers list
    public void registerTrainer() {
        // Read data from user's input
        System.out.println("Write Trainer's first Name: ");
        Scanner input_user = new Scanner(System.in);
        String trainerFirstName = input_user.next();
        System.out.println("Write Trainer's Last Name: ");
        String trainerLastName = input_user.next();

        System.out.println("Write Trainer's Subject");
        String trainerSubject = input_user.next();
        //Create a new object type Trainer
        Trainer trainer = new Trainer(trainerFirstName, trainerLastName, trainerSubject);

        //Assigns a trainer to a course
        System.out.println("Please assign the trainer to a course(1.Java,2.CSharp,3.Javascript,4.Python): ");
        int assign = input_user.nextInt();
        if (assign == 1) {
            javaTrainer.add(trainer);
        } else if (assign == 2) {
            cSharpTrainer.add(trainer);
        } else if (assign == 3) {
            javaScriptTrainer.add(trainer);
        } else if (assign == 4) {
            pythonTrainer.add(trainer);
        }

        //Adds Trainer objects to the trainers List
        trainers.add(trainer);
    }
}
