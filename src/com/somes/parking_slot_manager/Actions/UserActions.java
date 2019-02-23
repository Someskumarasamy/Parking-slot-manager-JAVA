package com.somes.parking_slot_manager.Actions;

import com.somes.parking_slot_manager.automobiles.*;

public class UserActions {
	void parkcar() {
		System.out.println("Enter Your Name");
		String uname = Ut.s.next();
		System.out.println("Enter Your Vehicle Number");
		String carno = Ut.s.next().toLowerCase();
		System.out.println("Choose your Vehicle Type");
		String type = ChooseType.setType();
		String Loc = Admin.getSpace(type);
		int sl = Admin.getSlot();
		System.out.println("Curr SLot" + sl);
		if (Loc.equals("nospace")) {
			System.out.println("No Space Available");
		}//
		else if (Loc.equals("closed")) {
			System.out.println("Parking is closed");
		}//
		else {
			Admin.usercaradd(carno, uname, Loc, sl, type);
			System.out.println("Slot Booked Sucessfully @ " + Loc);
		}

	}

	void searchcar() {
		System.out.println("Enter Your Vehicle Number");
		String key = Ut.s.next().toLowerCase();
		String loc = Admin.searchCar(key);
		System.out.println("Your Vehicle Is Parked AT " + loc);
		System.out.println("Are taking your vehicle out?/n1->Yes  2->No");
		int op = Ut.s.nextInt();
		if (op == 1) {
			if (Admin.deleteCar(key)) {
				System.out.println("Thank You Visit Again!");
			} else {
				System.out.println("Oops Error Occured..Try Again");
			}
		} else if (op == 2) {
			System.out.println("Your Beast sleeps at location " + loc);
		}
	}

	void removecar() {
		System.out.println("Enter Your Vehicle Number");
		String key = Ut.s.next().toLowerCase();
		if (Admin.deleteCar(key)) {
			System.out.println("Thank You Visit Again!");
		} else {
			System.out.println("Oops Error Occured..Try Again");
		}
	}

	void userAction() {
		System.out.println("1) parkCar  2)Search_Car 3) Take Your Car");
		int ch = Ut.s.nextInt();
		if (ch == 1)
			parkcar();
		else if (ch == 2)
			searchcar();
		else if (ch == 3)
			removecar();
	}
}
