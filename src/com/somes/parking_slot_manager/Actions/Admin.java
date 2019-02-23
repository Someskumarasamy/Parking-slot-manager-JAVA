package com.somes.parking_slot_manager.Actions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.somes.parking_slot_manager.automobiles.*;
import com.somes.parking_slot_manager.slotdetails.*;

public class Admin {
	static Admin adm = new Admin();
	private static HashMap<String, AutoMobiles> car = new HashMap<String, AutoMobiles>();
	private static HashMap<Integer, SlotData> slot = new HashMap<Integer, SlotData>();
	static HashMap<Integer, SlotData> hslot = new HashMap<Integer, SlotData>();
	static Scanner s = new Scanner(System.in);

	void addslot() {
		System.out.println("Enter Slot Id");
		int id = s.nextInt();
		System.out.println("Total space for sedan");
		int sed = s.nextInt();
		System.out.println("Total space for suv");
		int suv = s.nextInt();
		System.out.println("Total space for hatchback");
		int hb = s.nextInt();
		System.out.println("Total space for scooter");
		int sco = s.nextInt();
		System.out.println("Total space for bikes");
		int bik = s.nextInt();
		slot.put(id, new SlotData(sed, suv, hb, sco, bik, id));
	}

	void makeSlot() {
		hslot = slot;
	}

	private void addcar(String cid, String uid, String loc, int xp, String tp) {
		car.put(cid, new AutoMobiles(cid, uid, loc, xp, tp));
	}

	static int val = 0, vall = 0;

	static String getSpace(String s) {
		if (hslot == null) {
			System.out.println("Parking Not Started..Contact Admin");
			return "closed";
		} else {
			for (Map.Entry<Integer, SlotData> search : hslot.entrySet()) {
				val = 0;
				vall = 0;
				int key = search.getKey();
				vall = key;
				SlotData sd = search.getValue();// done
				val = sd.getTot();
				if (val > 0) {
					int y = sd.getAll(s);// done
					if (y > 0) {
						String pl = key + "F" + s + y;
						y--;
						val--;
						sd.setTot(val);
						sd.setAll(s, y);
						sd.vehid = pl;
						// hslot.replace(key,
						// sd);//--------------------------------------------------------------------no
						// need;
						System.out.println("Space Avail at " + pl
								+ "\n Request Slot...");
						return pl;
					}
				}
			}
			return "nospace";
		}
	}

	static int getSlot() {
		return vall;
	}

	static void usercaradd(String x, String y, String z, int p, String tp) {
		adm.addcar(x, y, z, p, tp);
	}

	void adminActions() {
		System.out.println("1 AddSlot 2 StartParking 3 Slot Stats");
		int ch = Ut.s.nextInt();
		if (ch == 1) {
			addslot();
		} else if (ch == 2) {
			makeSlot();
		} else {
			System.out.println("1) Full Stats 2) Space Stats");
			int cho = Ut.s.nextInt();
			switch (cho) {
			case 1:
				PrintDetails.printSlotData(car, hslot);
				break;
			case 2:
				PrintDetails.printSlotSpaceData(hslot);
				break;
			}
		}

	}

	static String searchCar(String key) {
		return car.get(key).getSlotLoc();

	}

	static boolean deleteCar(String key) {
		boolean st = false;
		for (Map.Entry<Integer, SlotData> search : hslot.entrySet()) {
			System.out.println("SearchVehid   " + search.getValue().vehid
					+ "   Location in hash car " + car.get(key).getSlotLoc());
			if ((search.getValue().vehid).equals(car.get(key).getSlotLoc())) {
				String ty = car.get(key).type;
				search.getValue().setTot((search.getValue().getTot()) + 1);
				search.getValue()
						.setAll(ty, (search.getValue().getAll(ty)) + 1);
				car.remove(key);
				st = true;
				break;
			}
		}
		return st;
	}
}
