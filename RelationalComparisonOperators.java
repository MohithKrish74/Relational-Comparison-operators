package com.keyword;

import java.util.Scanner;

public class RelationalComparisonOperators
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = in.nextInt();
        if (number>=10 && number<=20)
            System.out.println("Number is greater than or equal to 10 and less than equal to 20");
        else if (number>30)
            System.out.println("Number is greater than 30");
        else if (number<10)
            System.out.println("Number is less than 10 ");

    }
}
