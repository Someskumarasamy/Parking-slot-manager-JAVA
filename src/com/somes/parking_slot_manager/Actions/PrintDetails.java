package com.somes.parking_slot_manager.Actions;

import java.util.HashMap;
import java.util.Map;

import com.somes.parking_slot_manager.automobiles.AutoMobiles;
import com.somes.parking_slot_manager.slotdetails.SlotData;

public class PrintDetails extends Admin {

	static void printSlotData(HashMap<String, AutoMobiles> car,
			HashMap<Integer, SlotData> hm) {
		for (Map.Entry<Integer, SlotData> sh : hm.entrySet()) {
			System.out.println("Slot Number : " + sh.getKey());
			int kk = sh.getKey();
			hm.get(sh.getKey()).printData();
			for (Map.Entry<String, AutoMobiles> sh1 : car.entrySet()) {
				if ((int) (sh1.getValue().getFloor()) == kk) {
					car.get(sh1.getKey()).printData();
				}
			}
		}
	}

	static void printSlotSpaceData(HashMap<Integer, SlotData> hm) {
		for (Map.Entry<Integer, SlotData> sh : hm.entrySet()) {
			System.out.println("Slot Number : " + sh.getKey());
			hm.get(sh.getKey()).printData();
		}
	}

}
