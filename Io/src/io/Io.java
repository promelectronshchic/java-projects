package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Io {

	public static void main(String[] args) throws Exception {
		String firstName;
		String lastName;

		InputStreamReader thread = new InputStreamReader(System.in);
		BufferedReader keyboard = new BufferedReader(thread);

		System.out.println("What is first your name ?");
		firstName = keyboard.readLine();

		System.out.println("What is your last name ?");
		lastName = keyboard.readLine();

		System.out.print("Now I know who you are, you are " + firstName + " " + lastName);
	}
}
