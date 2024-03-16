package car.model;

import java.util.LinkedHashMap;

public class CarModel {

	int carid;
	String carownname;
	String cnum;
	String carproblem;
	boolean car_status;
	LinkedHashMap<String,Integer>combill=new LinkedHashMap<String,Integer>();

	public LinkedHashMap<String, Integer> getBill() {
		return combill;
	}

	public void setBill(LinkedHashMap<String, Integer> bill) {
		this.combill = bill;
	}

	public boolean isCar_status() {
		return car_status;
	}

	public void setCar_status(boolean car_status) {
		this.car_status = car_status;
	}

	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public String getCarownname() {
		return carownname;
	}

	public void setCarownname(String carownname) {
		this.carownname = carownname;
	}

	public String getCnum() {
		return cnum;
	}

	public void setCnum(String cnum) {
		this.cnum = cnum;
	}

	public String getCarproblem() {
		return carproblem;
	}

	public void setCarproblem(String carproblem) {
		this.carproblem = carproblem;
	}

	public CarModel() {

	}

	public CarModel(String carownname, String cnum, String carproblem) {
		this.carownname = carownname;
		this.cnum = cnum;
		this.carproblem = carproblem;
	}

}
