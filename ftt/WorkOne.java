package ftt;

/*

	Compilar: javac ftt\WorkOne.java
	Executar: java -claspath . ftt.WorkOne

	Executar Jar: java -jar WorkOne.jar

    Para saber mais: https://docs.oracle.com/javase/tutorial/deployment/jar/index.html

*/

import java.util.Date;

public class WorkOne {

	public static final float PI = 3.14169f; //final estabelece constantes e por convenção se utiliza letras maiúculas para identificado de constantes

	public static void main (String args[]) {

		final float E = 2.718281828459045f;

		System.out.print(new Date());
		System.out.println(" - WorkOne...");

		System.out.println("Our Pi is: " + WorkOne.PI);
		System.out.println("Value of E is: " + E);

	} //main

} //WorkOne
