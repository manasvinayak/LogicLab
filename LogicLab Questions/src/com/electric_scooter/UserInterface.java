package com.electric_scooter;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] details = input.split(":");
		if(details.length!=4) {
			System.out.println("Invalid input");
			return;
		}
		String model = details[0];
		String plan = details[1];
		String helmet = details[2];
		int duration = Integer.parseInt(details[3]);
		ScooterUtil scooter = new ScooterUtil();
		try {
			scooter.validateModel(model);
			scooter.validatePlan(plan);
			scooter.validateHelmet(helmet);
			scooter.validateDuration(plan, duration);
			int cost = scooter.calculateCost(plan, duration, helmet);
			System.out.println("Total rental cost: " + cost);
		}
		catch(InvalidScooterException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
