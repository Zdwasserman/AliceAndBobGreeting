package Wasserman.Zachary.AliceAndBobGreeting;

import java.util.Scanner;


public class AliceAndBobGreeting {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your name >>>");
            String name = input.nextLine();
            if (name == "Bob" || name == "Alice" || name == "alice" || name == "bob");{
                System.out.println("Hello " + name+".");
                System.out.println("End of program");
            }
        }
    }

