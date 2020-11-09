/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
 */
package individualproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author kostis
 */
public class IndividualProject {
//StringBuilder message for the menu of the program

    private static final StringBuilder MESSAGE = new StringBuilder().append("Please choose one of the options below:\n")
            .append("To Register a Course -(1)\n").append("To Register a Trainer -(2)\n").append("To Register a Student -(3)\n")
            .append("To Register an Assignment -(4) \n").append("To show list of Courses-(5)\n").append("To Show list of Trainers-(6)\n")
            .append("To show list of Students-(7)\n").append("To show list of Assignments-(8)\n")
            .append("To show Trainers per Course-(9)\n").append("To show Students per Course-(10)\n").append("To show Students per Assignment-(11)\n")
            .append("To show Assignments per Course-(12)\n").append("To exit program press (0)\n").append("Enter your choice here");
//StringBuilder message for the menu with synthetic data of the program
    private static final StringBuilder MESSAGE2 = new StringBuilder().append("Please choose one of the options below:\n").append("To show list of Trainers-(1)\n").append("To show list of Students-(2)\n").append("To show list of Courses-(3)\n")
            .append("To show list of Assignments-(4)\n").append("To show Trainers per Course-(5)\n").append("To show Students per Course-(6)\n").append("To show Students per Assignment-(7)\n")
            .append("To show Assignments per Course-(8)\n").append("To show Students with more than one courses-(9) \n").append("To show the students who need to submit assignments on the same calendar week.(10) \n").append("To exit program press (0)\n").append("Enter your choice here");
//
    public static List<Student> students = new ArrayList();
    public static List<Trainer> trainers = new ArrayList();
    public static List<Course> courses = new ArrayList();
    public static List<Assignment> assignments = new ArrayList();
// list of students , variables are the 4 courses
    public static List<Student> Java = new ArrayList();
    public static List<Student> csharp = new ArrayList();
    public static List<Student> javaScript = new ArrayList();
    public static List<Student> Python = new ArrayList();

//list for the trainers for the 4 courses
    public static List<Trainer> javaTrainer = new ArrayList();
    public static List<Trainer> cSharpTrainer = new ArrayList();
    public static List<Trainer> javaScriptTrainer = new ArrayList();
    public static List<Trainer> pythonTrainer = new ArrayList();
//list for the assignments for the 4 courses
    public static List<Assignment> JavaAssignments = new ArrayList();
    public static List<Assignment> cSharpAssignments = new ArrayList();
    public static List<Assignment> javaScriptAssignments = new ArrayList();
    public static List<Assignment> pythonAssignments = new ArrayList();

    //Students per assignment
    public static List<Student> JavaStudent = new ArrayList();
    public static List<Student> cSharpStudent = new ArrayList();
    public static List<Student> JavaScriptStudent = new ArrayList();
    public static List<Student> PythonStudent = new ArrayList();

    public static void main(String[] args) {
        System.out.println("Private School's Management System\n" + "To Start Registration Process Press-(1)\n"
                + "To Use Synthetic Data Press-(2) \n" + "Enter your choice here:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        HardcodedData hardcodedData = new HardcodedData();   //Creates a new object from Hardcoded class   
        Registration registration = new Registration(); //Creates a new Registration object
        while (num == 1) {

            System.out.println(MESSAGE);
            int num2 = sc.nextInt();
            if (num2 == 1) {
                registration.registerCourse();
            } else if (num2 == 2) {
                registration.registerTrainer();
            } else if (num2 == 3) {
                registration.registerStudent();
            } else if (num2 == 4) {
                registration.registerAssignment();
            } else if (num2 == 5) {
                System.out.println("Courses' List:\n" + courses);
            } else if (num2 == 6) {
                System.out.println("Trainers List:\n" + trainers);
            } else if (num2 == 7) {
                System.out.println("Students' List:\n" + students);
            } else if (num2 == 8) {
                System.out.println("Assignments' List: \n" + assignments);

            } else if (num2 == 9) {
                System.out.println("Please give a course. 1.Java, 2.CSharp, 3.Javascript,4.Python:\n");
                int num5 = sc.nextInt();
                if (num5 == 1) {
                    for (int i = 0; i < javaTrainer.size(); i++) {
                        System.out.print(javaTrainer.get(i).getFirstName() + " ");
                        System.out.println(javaTrainer.get(i).getLastName());
                    }

                } else if (num == 2) {
                    for (int i = 0; i < cSharpTrainer.size(); i++) {
                        System.out.print(cSharpTrainer.get(i).getFirstName() + " ");
                        System.out.println(cSharpTrainer.get(i).getLastName());
                    }

                } else if (num == 3) {
                    for (int i = 0; i < javaScriptTrainer.size(); i++) {
                        System.out.print(javaScriptTrainer.get(i).getFirstName() + " ");
                        System.out.println(javaScriptTrainer.get(i).getLastName());
                    }
                } else if (num == 4) {
                    for (int i = 0; i < pythonTrainer.size(); i++) {
                        System.out.print(pythonTrainer.get(i).getFirstName() + " ");
                        System.out.println(pythonTrainer.get(i).getLastName());
                    }
                }

            } else if (num2 == 10) {
                System.out.println("Please give a course 1.Java,2.CSharp,3.Javascript,4.Python:\n");
                int num4 = sc.nextInt();
                if (num4 == 1) {
                    for (int i = 0; i < Java.size(); i++) {
                        System.out.print(Java.get(i).getFirstName() + " ");
                        System.out.println(Java.get(i).getLastName());
                    }
                } else if (num4 == 2) {

                    for (int i = 0; i < csharp.size(); i++) {
                        System.out.print(csharp.get(i).getFirstName() + " ");

                        System.out.println(csharp.get(i).getLastName() + " ");
                    }

                } else if (num4 == 3) {
                    for (int i = 0; i < javaScript.size(); i++) {
                        System.out.println(" " + javaScript.get(i).getFirstName() + " ");
                        System.out.println(javaScript.get(i).getLastName());
                    }
                } else if (num4 == 4) {
                    for (int i = 0; i < Python.size(); i++) {
                        System.out.println(Python.get(i).getFirstName());
                        System.out.println(Python.get(i).getLastName());
                    }
                }
                //it shows student list for assignments of the 4 courses
            } else if (num2 == 11) {
                System.out.println("Please give an assignment 1.for Java,2.for CSharp,3.for Javascript,4.for Python and show Students\n");
                int num7 = sc.nextInt();
                if (num7 == 1) {
                    for (int i = 0; i < JavaStudent.size(); i++) {
                        System.out.println(JavaStudent.get(i).getFirstName());
                        System.out.println(JavaStudent.get(i).getLastName());
                    }

                } else if (num7 == 2) {
                    for (int i = 0; i < cSharpStudent.size(); i++) {
                        System.out.println(cSharpStudent.get(i).getFirstName());
                        System.out.println(cSharpStudent.get(i).getLastName());
                    }
                } else if (num7 == 3) {
                    for (int i = 0; i < JavaScriptStudent.size(); i++) {
                        System.out.println(JavaScriptStudent.get(i).getFirstName());
                        System.out.println(JavaScriptStudent.get(i).getLastName());
                    }
                } else if (num7 == 4) {
                    for (int i = 0; i < PythonStudent.size(); i++) {
                        System.out.println(PythonStudent.get(i).getFirstName());
                        System.out.println(PythonStudent.get(i).getLastName());
                    }
                }

            } else if (num2 == 12) {
                System.out.println("Please give a course 1.Java,2.CSharp,3.Javascript,4.Python:\n");
                int num6 = sc.nextInt();
                if (num6 == 1) {
                    for (int i = 0; i < JavaAssignments.size(); i++) {
                        System.out.println(JavaAssignments.get(i).getTitle());

                    }

                } else if (num6 == 2) {
                    for (int i = 0; i < cSharpAssignments.size(); i++) {
                        System.out.println(cSharpAssignments.get(i).getTitle());

                    }
                } else if (num6 == 3) {
                    for (int i = 0; i < javaScriptAssignments.size(); i++) {
                        System.out.println(javaScriptAssignments.get(i).getTitle());

                    }
                } else if (num6 == 4) {
                    for (int i = 0; i < pythonAssignments.size(); i++) {
                        System.out.println(pythonAssignments.get(i).getTitle());

                    }

                }
            } else if (num2 == 0) {
                System.exit(0);
            }

            System.out.println("Do you wish to return to main menu? (1.Yes -2.No)");
            num = sc.nextInt();
            if (num == 2) {
                System.exit(0);
            }
        }
        while (num == 2) {
            System.out.println(MESSAGE2);
            int num3 = sc.nextInt();
            if (num3 == 1) {
                hardcodedData.listOfTrainers();
                System.out.println("List of Trainers:\n" + trainers);
            } else if (num3 == 2) {
                hardcodedData.listOfStudents();
                System.out.println("List of Students:\n" + students);
            } else if (num3 == 3) {
                hardcodedData.listOfCourses();
                System.out.println("List of Courses:\n" + courses);
            } else if (num3 == 4) {
                hardcodedData.listOfAssignments();
                System.out.println("List of Assignments:\n" + assignments);
            } else if (num3 == 5) {
                hardcodedData.insertTrainersPerCourse();
                System.out.println("Trainers for Java are:\n" + javaTrainer + "\nTrainers for CSharp' are:\n" + cSharpTrainer + "\nTrainers for Javascript are:\n" + javaScriptTrainer
                        + "\nTrainers for Python are:\n" + pythonTrainer);
            } else if (num3 == 6) {

                hardcodedData.insertStudentsPerCourse();
                System.out.println("Students for Java are:\n" + Java + "\nStudents for CSharp are:\n" + csharp
                        + "\nStudents for javaScript are:\n" + javaScript + "\nStudents for Python are:\n" + Python);

            } else if (num3 == 8) {
                hardcodedData.insertAssignmentsPerCourse();
                System.out.println("Assignments for Java are:\n" + JavaAssignments + "\nAssignments for CSharp are:\n" + cSharpAssignments
                        + "\nAssignments for JavaScript are:\n" + javaScriptAssignments + "\nAssignments for Python are:\n" + pythonAssignments);
            } else if (num3 == 7) {
                hardcodedData.insertStudentsPerAssignments();
                System.out.println("Students for Java Assignment are:\n" + JavaStudent + "\nStudents for CSharp Assignment are:\n" + cSharpStudent
                        + "\nStudents for javaScript Assignment are:\n" + JavaScriptStudent + "\nStudents for Python Assignment are:\n" + PythonStudent);

            } else if (num3 == 9) {
                hardcodedData.coursesPerStudentHD();
            } else if (num3 == 10) {
                hardcodedData.assignmentDate();
            } else if (num3 == 0) {
                System.exit(0);
            }

            System.out.println("Do you wish to return to main menu? (1.No -2.Yes)");
            num = sc.nextInt();
        }
    }
}
