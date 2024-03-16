package car_garage_management.client;

import java.util.*;
import car.model.*;
import car_garage_management.services.*;

public class Car_Garage_Management_app {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Car_Garage_Management_services service = new Car_Garage_Management_services();

		ArrayList al;
		int flag = 0;
		do {
			System.out.println("------------------------------------------");
			System.out.println("1)Add car details");
			System.out.println("2)Show all car details");
			System.out.println("3)Search car by id");
			System.out.println("4)Change car status");
			System.out.println("5)Check car status");
			System.out.println("6)Set bill using car id");
			System.out.println("7)Get bill using car id");
			System.out.println("-------------------------------------------");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				sc.nextLine();
				System.out.println("Enter car Owner Name,Car Number and Car's problem");
				String name = sc.nextLine();
				String number = sc.nextLine();
				String problem = sc.nextLine();
				CarModel car = new CarModel(name, number, problem);
				boolean b = service.isAddCar(car);
				if (b) {
					System.out.println("Car added succesfully...");
				} else {
					System.out.println("Error while adding Car...");
				}

				break;

			case 2:

				al = service.getCars();

				System.out.println("cid\t" + "OName\t" + "CNum\t" + "Issue\t" + "Status");
				System.out.println("------------------------------------------");
				for (Object obj : al) {
					CarModel tempcar = (CarModel) obj;
					System.out.println(tempcar.getCarid() + "\t" + tempcar.getCarownname() + "\t" + tempcar.getCnum()
							+ "\t" + tempcar.getCarproblem() + "\t" + tempcar.isCar_status());
				}

				break;
			case 3:
				al = service.getCars();
				flag = 0;
				System.out.println("Enter a car id to search: ");
				int cid = sc.nextInt();
				sc.nextLine();
				for (Object obj : al) {
					CarModel tempcar = (CarModel) obj;
					if (tempcar.getCarid() == cid) {
						System.out.println(tempcar.getCarid() + "\t" + tempcar.getCarownname() + "\t"
								+ tempcar.getCnum() + "\t" + tempcar.getCarproblem() + "\t" + tempcar.isCar_status());
						flag = 1;
					}
				}
				if (flag == 0) {
					System.out.println("Car id not found.... ");
				}

				break;

			case 4:
				al = service.getCars();
				flag = 0;
				System.out.println("Enter a car id to search: ");
				int cid2 = sc.nextInt();
				sc.nextLine();
				for (Object obj : al) {
					CarModel tempcar = (CarModel) obj;
					if (tempcar.getCarid() == cid2) {
						System.out.println("Is car ready for delivery? (yes/no)");
						String ans = sc.nextLine();
						if (ans.equals("yes")) {
							tempcar.setCar_status(true);
						} else {
							break;
						}
						flag = 1;

					}
				}
				if (flag == 1) {
					System.out.println("Car status changed.... ");
				}

				break;
			case 5:
				al = service.getCars();
				flag = 0;
				System.out.println("Enter a car id to search: ");
				int cid3 = sc.nextInt();
				sc.nextLine();
				for (Object obj : al) {
					CarModel tempcar = (CarModel) obj;
					if (tempcar.getCarid() == cid3) {
						boolean b1 = tempcar.isCar_status();

						if (b1 == true) {
							System.out.println("Car is ready for delivery...");
						} else {
							System.out.println("Car is not ready for delivery...");
						}
						flag = 1;

					}
				}
				if (flag == 0) {
					System.out.println("Enter correct car id.... ");
				}

				break;
				
			case 6:
				al = service.getCars();
				flag = 0;
				System.out.println("Enter a car id to search: ");
				int cid4 = sc.nextInt();
				sc.nextLine();
				for (Object obj : al) {
					CarModel tempcar = (CarModel) obj;
					if (tempcar.getCarid() == cid4) {
						System.out.println("How many components you repared: ");
						int num= sc.nextInt();
						sc.nextLine();
						for(int i=0;i<num;i++)
						{
							System.out.println("Enter component name and its bill");
							String com=sc.nextLine();
							int combill=sc.nextInt();
							sc.nextLine();
							LinkedHashMap map=tempcar.getBill();
							map.put(com, combill);
						}
						flag = 1;

					}
				}
				if (flag == 0) {
					System.out.println("Enter correct car id.... ");
				}
				
				break;
				
			case 7:
				al = service.getCars();
				flag = 0;
				System.out.println("Enter a car id to search: ");
				int cid5 = sc.nextInt();
				sc.nextLine();
				for (Object obj : al) {
					CarModel tempcar = (CarModel) obj;
					if (tempcar.getCarid() == cid5) {
						LinkedHashMap map=tempcar.getBill();
						Float sumtotal=0f;
						Set<Map.Entry<String,Integer>>set=map.entrySet();
						
						for(Map.Entry<String,Integer>d:set)
						{
							sumtotal=sumtotal+(Integer)d.getValue();
						}
						
						System.out.println("Your total bill is  "+sumtotal);
						flag = 1;

					}
				}
				if (flag == 0) {
					System.out.println("Enter correct car id.... ");
				}
				break;
			default:
				System.out.println("Enter correct choice...");

			}

		} while (true);

	}

}
