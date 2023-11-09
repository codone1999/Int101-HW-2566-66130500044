/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work01Utilitor;

/**
 *
 * @author Codone
 */
public class Utilitor {
    public static String testString(String value){
       if (value == null){
           throw new NullPointerException("value is null");
       }
       if(value.isBlank()){
           throw new IllegalArgumentException("value must not blank");
       }
       else{
           return value;
       }
    }
    public static double testPositive(double value){
        if (value>=0){
            return value;
        }
        throw new IllegalArgumentException("must be positive");
    }
    public static long computeIsbn10(long isbn10){
        int product=0;
        int isbn=(int)isbn10;
        int sumnum=2;
        while (isbn>0){
            int digit = isbn % 10;
            product+=(digit*sumnum);
            sumnum+=1;
            isbn/=10;
        }
        return product%11; 

    }
    
    
}
