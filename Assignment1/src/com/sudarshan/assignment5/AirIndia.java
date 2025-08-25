package com.sudarshan.assignment5;

public class AirIndia implements Airfare {
	
	private int hours;
	private double costPerHour;
	//default constructor
	
	public AirIndia() {}
	
	//parameterized constructor
	public AirIndia(int hours, double costPerHour) {
		this.hours = hours;
        this.costPerHour = costPerHour;
	}

	//getter & setter
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getCostPerHour() {
		return costPerHour;
	}

	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}
	@Override
    public double calculateAmount() {
        return hours * costPerHour;
    }

    @Override
    public void display() {
        System.out.printf("%.2f%n", calculateAmount());
    }
}
