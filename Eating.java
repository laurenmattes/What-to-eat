package java3;

import java.util.Scanner;

public class Eating {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String eventType;
		String result;
		String partySize;
		String mealSuggestion = "";
		String prepSuggestion = "";

		// Take in user inout
		System.out.println("Welcome to the \"What to eat\" app!");
		System.out.println("please enter the event type:\n1)Casual\n2)Semi-formal\n3)Formal");
		eventType = scan.next();

		System.out.println("Please enter the size of your party: \n1) 1 \n2) 2-12 \n3) 13+");
		partySize = scan.next();
		// declare mealSuggestion and prepSuggestion from user input using if statements
		if (eventType.equalsIgnoreCase("casual") || eventType.equals("1")) {
			eventType = "casual";
			mealSuggestion = "sandwhiches";
		}
		if (eventType.equalsIgnoreCase("Semi-formal") || eventType.equals("2")) {
			eventType = "Semi-formal";
			mealSuggestion = "fried chicken";
		}
		if (eventType.equalsIgnoreCase("Formal") || eventType.equals("3")) {
			eventType = "Formal";
			mealSuggestion = "chicken parmesan";
		}

		if (partySize.equalsIgnoreCase("1") || eventType.equals("1")) {
			partySize = "1";
			prepSuggestion = "in the microwave";
		}
		if (partySize.equalsIgnoreCase("2") || eventType.equals("2-12")) {
			partySize = "2-12";
			prepSuggestion = "in your kitchen";
		}
		if (partySize.equalsIgnoreCase("3") || eventType.equals("13+")) {
			partySize = "13";
			prepSuggestion = "by caterer.";
		}

		result = "Since you're hosting a " + eventType + " event for " + partySize + " participants, you should serve "
				+ mealSuggestion + " prepared " + prepSuggestion;
		System.out.println(result);
	}
}