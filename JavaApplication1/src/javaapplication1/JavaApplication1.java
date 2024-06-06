/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Priya
 */
/* 
  This is a simple class called 
  HelloWorld in a file HelloWorld.java 
*/
class Hello
{
	int a = 3;
	Hello()
	{
		System.out.println("in print class : "+a);
	}
}
class JavaApplication1
{
    static int b = 5;
    //This program starts with a call to "main" method
    public static void main(String args[])
    {
        //The below line prints a greeting on the console
        System.out.println("Hello! I'm a Try QA program");
	Hello p = new Hello();
        JavaApplication1 j = new JavaApplication1();
        System.out.println("static:::;"+b);
    }
}