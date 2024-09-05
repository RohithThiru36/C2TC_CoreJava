package com.tns.day2;
import java.util.*;

public class SecondProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String clr;
        
            System.out.print("Enter Signal Color: ");
            clr = sc.nextLine();

            do {
            if (clr == "Red") {
                System.out.println("You Can Wait For Sometimes");
            } 
            else if (clr == "Green") {
                System.out.println("You can Go Now!");
            } 
            else if (clr == "Yellow") {
                System.out.println("You can Wait and get ready for Going");
            } 
            else {
                System.out.println("Invalid Color");
                System.out.print("Enter Signal Color: ");
                clr = sc.nextLine();
                clr = clr.intern();
            }
        } while ((clr != "Red" && clr != "Green" || clr != "Yellow"));

    }
}
