/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualproject;

/**
 *
 * @author kostis
 */
public class Trainer {
    String firstName;
    String lastName;
    String subject;

    public Trainer() {
    }
    
    public Trainer(String firstName, String lastName, String subject){
    
    this.firstName = firstName;
    this.lastName = lastName;
    this.subject = subject;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Trainer{" + "firstName=" + firstName + ", lastName=" + lastName + ", subject=" + subject + '}'+ "\n";
    }
    
    
}

