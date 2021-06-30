package com.info.armstrong;
import java.util.Scanner;
import java.lang.*;
public class ArmstrongNumber {
	public static void main(String[] args) 
    {
        int num;
        int power = 0, remainder, result = 0;
        int tempNum, originalNum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        num = sc.nextInt();
        tempNum = num;
        while(tempNum > 0)
        {
        	tempNum = tempNum / 10;
        	power++;
        }
        originalNum = num;
        while(num > 0)
        {
        	remainder = num % 10;
            result = (int)(result + Math.pow(remainder, power));
            num = num / 10;
        }
        if(result == originalNum)
        {
            System.out.println(result+" is Armstrong number");
        }
        else
        {
            System.out.println(result+" is not Armstrong number");
        }    
        sc.close();
    }
}