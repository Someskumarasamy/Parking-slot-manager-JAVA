package com.somes.parking_slot_manager.automobiles;

import java.util.Scanner;

public class ChooseType {
	static String type;
	static Scanner sc = new Scanner(System.in);
			static public String setType(){
				boolean flag=true;
				System.out.println("Choose from below/n 1->Sedan 2->hatch 3->suv 4->bike 5->scooter");
				int ch = sc.nextInt();
			while(flag){
				if(ch>0 &&ch<6)
				{
					flag=false;}
				switch(ch){
					case 1:
						type="sedan";
						break;
					case 2:
						type="hatch";
						break;
					case 3:
						type="suv";
						break;
					case 4:
						type="bike";
						break;
					case 5:
						type="scooter";
						break;
					}}
					return type;
				}
			}
