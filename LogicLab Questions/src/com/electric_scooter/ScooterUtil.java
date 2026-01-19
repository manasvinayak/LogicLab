package com.electric_scooter;

public class ScooterUtil {
	public void validateModel(String model) throws InvalidScooterException{
		if(!"Bolt".equalsIgnoreCase(model) && !"Flash".equalsIgnoreCase(model) && !"ZoomX".equalsIgnoreCase(model) && !"EcoRide".equalsIgnoreCase(model)) {
			throw new InvalidScooterException("The scooter model " + model + " is invalid");
		}
	}
	
	public void validatePlan(String plan) throws InvalidScooterException{
		if(!"Hourly".equals(plan) && !"Daily".equals(plan) && !"Weekly".equals(plan)) {
			throw new InvalidScooterException("The rental plan " + plan + " is invalid");
		}
	}
	
	public void validateHelmet(String helmet) throws InvalidScooterException{
		if(!"Yes".equals(helmet) && !"No".equals(helmet)) {
			throw new InvalidScooterException("The helmet option " + helmet + " is invalid");
		}
	}
	
	public void validateDuration(String plan, int duration) throws InvalidScooterException{
		boolean valid = true;
		if("Hourly".equals(plan)) {
			valid = (duration>=1 && duration<=24)? true:false;
		}
		else if("Daily".equals(plan)) {
			valid = (duration>=1 && duration<=7)? true:false;
		}
		else if("Weekly".equals(plan)) {
			valid = (duration==1)? true:false;
		}
		if(!valid) {
			throw new InvalidScooterException("The duration " + duration + " is invalid for plan " + plan);
		}
	}
	
	public int calculateCost(String plan, int duration, String helmet) {
		int totalCost = 0;
		if("Hourly".equals(plan)) totalCost += (50*duration);
		else if("Daily".equals(plan)) totalCost += (300*duration);
		else if("Weekly".equals(plan)) totalCost += (1800*duration);
		if("Yes".equals(helmet)) totalCost += 20;
		return totalCost;
	}
}
