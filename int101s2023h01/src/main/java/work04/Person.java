/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work04;

/**
 *
 * @author Codone
 */
public class Person {
    private int id;
    public int Personid(int id){
         this.id=id;
         return id;
    }
        
    
    public int getid(){
        return id;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + '}';
    }
     
    
        
    
    
}
