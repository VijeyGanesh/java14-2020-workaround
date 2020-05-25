package com.application.workaround;

public class TextBlocks {

	@SuppressWarnings("preview")
	public static void main(String args[]) {
		String text1 = """
                If you \
                want \
                to be happy,\
                be\
                """;
		System.out.println(text1);
 
String text2 = """
                if you
                want to be happy, \s
                be
                """;
System.out.println(text2);
 
 
String text3 = "Ifyouwant\ntobehappy \nbe\n";

System.out.println(text3);
	}
}
