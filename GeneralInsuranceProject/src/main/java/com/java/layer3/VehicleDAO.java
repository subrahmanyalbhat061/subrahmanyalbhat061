package com.java.layer3;

import com.java.layer2.Vehicle;

import java.util.List;



public interface VehicleDAO { //Vehicle Repository

	Vehicle selectVehicle(String rcNumber);
	List<Vehicle> selectAllVehicles();
	void insertVehicle(Vehicle vehicle);
	void updateVehicle(Vehicle vehicle);
	void deleteVehicle(String rcNumber);
	
}