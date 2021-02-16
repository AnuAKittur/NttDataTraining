package com.nttdata.collection;

import java.util.Scanner;
import java.util.TreeMap;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		TreeMap<Integer, String> vehicle = new TreeMap<Integer, String>();
		vehicle.put(101, "Hyundai Creta"); 
        vehicle.put(102, "Hyundai Verna"); 
        vehicle.put(103, "Hyundai Grand i10"); 
        System.out.println("Welcome to Hyundai car showroom \n");
        System.out.println("car models are: " +vehicle);
        System.out.println("please enter the car model number to get to know more details \n");
        int i=scan.nextInt();
        System.out.println("the car model is: "+vehicle.get(i));
	}

}
