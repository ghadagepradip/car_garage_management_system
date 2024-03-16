package car_garage_management.services;

import java.util.ArrayList;

import car.model.*;
import car_garage_management.repo.*;

public class Car_Garage_Management_services {

	Car_Garage_Management_repo repo = new Car_Garage_Management_repo();

	public boolean isAddCar(CarModel car) {
		return repo.isAddCar(car);
	}

	public ArrayList getCars() {
		return repo.getCars();
	}

}
