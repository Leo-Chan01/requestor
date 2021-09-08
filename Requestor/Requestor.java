package Requestor;

import java.util.Scanner;
 
class GetInputFromUser {
    public static void main(String args[])
    {
        System.out.println("Welcome \n Input your name");
        Scanner nameScanner = new Scanner(System.in);
        String name = nameScanner.nextLine();
        System.out.println("Your name is : " + name);

        System.out.println("Input your Reg No.");
        Scanner regNumberScanner = new Scanner(System.in);
        String regNumber =  regNumberScanner.nextLine();
        System.out.println("Your name is : " + name);

        System.out.println("Input your course");
        Scanner courseScanner = new Scanner(System.in);
        String course = courseScanner.nextLine();
        System.out.println("Your your course is : " + course);
          // closing scanner
          nameScanner.close();
    }
}