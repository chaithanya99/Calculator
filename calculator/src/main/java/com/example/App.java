package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int add(int num1,int num2){
        return num1+num2;
    }
    public static int sub(int num1,int num2){
        return num1-num2;
    }
    public static int mul(int num1,int num2){
        return num1*num2;
    }
    public static int div(int num1,int num2){
        return num1/num2;
    }
    public static void main( String[] args )
    {   
        int operation=0;
        while (true) {
            System.out.println("choose the operations\n 1.Division\n 2.Multiplication\n 3.Addition\n 4.Subtraction\n 5.Exit\n");
            Scanner S=new Scanner(System.in);
            operation=S.nextInt();
            if(operation==5){
                System.exit(0);
            }

            System.out.println("Enter 1st number: ");
            int num1=S.nextInt();
            System.out.println("Enter 2nd number: ");
            int num2=S.nextInt();

            if(operation==1){
                int ans=div(num1,num2);
                System.out.println("Answer: "+ans);
            }
            else if (operation==2) {
                int ans=mul(num1, num2);
                System.out.println("Answer: "+ans);
            } 
            else if(operation==3) {
                int ans=add(num1, num2);
                System.out.println("Answer: "+ans);
            }
            else if(operation==4){
                int ans=sub(num1, num2);
                System.out.println("Answer: "+ans);
            }

        }
    }
}
