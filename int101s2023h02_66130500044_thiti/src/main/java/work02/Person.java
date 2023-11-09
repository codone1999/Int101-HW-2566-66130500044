/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package work02;
import  work01Utilitor.Utilitor;

/**
 *
 * @author Codone
 */
public class Person {
    private static int nextID = 1;
    private final int id;
    private String firstname;
    private String lastname ;
    
    public Person(String firstname, String lastname){
       this.firstname= firstname;
       this.lastname = lastname;
        Utilitor.testString(firstname);
        Utilitor.testString(lastname);
        this.id=nextID;
        nextID++;

        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{");
        sb.append("id=").append(id);
        sb.append(", firstname=").append(firstname);
        sb.append(", lastname=").append(lastname);
        sb.append('}');
        return sb.toString();
        
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        Utilitor.testString(firstname);
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        Utilitor.testString(lastname);
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        else{
           return false;
        }
    }
}
 