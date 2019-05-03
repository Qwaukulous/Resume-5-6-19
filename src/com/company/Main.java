package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Resume resume = new Resume();

        Scanner scanner = new Scanner(System.in);
        String name;
        String email;
        String addEduHistory;

        //ASK USER FOR NAME
        System.out.print("This is a resume builder, Please enter your name: ");

        name = scanner.nextLine();
        resume.setName(name);

        //ASK USER FOR EMAIL
        System.out.print("Please enter your email: ");

        email = scanner.nextLine();
        resume.setEmailAddress(email);

        //ASK IF USER HAS EDUCATION HISTORY
        System.out.print("Would you like to provide Educational history? Please enter y(Yes) or n(No): ");
    }
}
