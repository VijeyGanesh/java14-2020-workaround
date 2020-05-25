package com.application.workaround;

import java.util.Scanner;

public class SwitchCaseExpression {

	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		String month=input.nextLine();
		String result = switch (month) {
        case "Jan", "Mar", "May","Jul","Aug","Oct","Dec" -> "Months with 31 Days";
        case "Feb", "Apr", "Jun","Sep","Nov" -> "Months with 30 Days";
        default -> {
            if(month.isEmpty())
                yield "Month cannot be null";
            else
                yield "Enter a Valid Month";
        }

    };
    System.out.println(result);
    input.close();
	}
}
