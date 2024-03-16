package car_garage_management.repo;

import java.util.*;
import car.model.*;

public class Car_Garage_Management_repo {

	static ArrayList al = new ArrayList();
	static int count = 1;

	public boolean isAddCar(CarModel car) {
		car.setCarid(count++);
		boolean b = al.add(car);

		return b;
	}

	public ArrayList getCars() {
		return al;
	}

}
