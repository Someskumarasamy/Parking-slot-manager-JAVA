package com.somes.parking_slot_manager.slotdetails;

public class SlotData {
	private int sedan, suv, hatch, scooter, bike, tot, slotno;
	public String vehid;

	public String getVehid() {
		return vehid;
	}

	public void setVehid(String vehid) {
		this.vehid = vehid;
	}

	public int getAll(String x) {
		if (x.equals("sedan"))
			return sedan;
		else if (x.equals("suv"))
			return suv;
		else if (x.equals("hatch"))
			return hatch;
		else if (x.equals("scooter"))
			return scooter;
		else if (x.equals("bike"))
			return bike;
		else
			return tot;

	}

	public void setAll(String x, int no) {
		if (x.equals("sedan"))
			setSedan(no);
		else if (x.equals("suv"))
			setSuv(no);
		else if (x.equals("hatch"))
			setHatch(no);
		else if (x.equals("scooter"))
			setScooter(no);
		else if (x.equals("bike"))
			setBike(no);
		else
			setTot(no);
	}

	public int getTot() {
		return tot;
	}

	public int getSlotno() {
		return slotno;
	}

	public void setSedan(int sedan) {
		this.sedan = sedan;
	}

	public void setSuv(int suv) {
		this.suv = suv;
	}

	public void setHatch(int hatch) {
		this.hatch = hatch;
	}

	public void setScooter(int scooter) {
		this.scooter = scooter;
	}

	public void setBike(int bike) {
		this.bike = bike;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public void setSlotno(int slotno) {
		this.slotno = slotno;
	}

	public SlotData(int a, int b, int c, int d, int e, int id) {
		sedan = a;
		suv = b;
		hatch = c;
		scooter = d;
		bike = e;
		tot = (a + b + c + d + e);
		slotno = id;
	}

	public void printData() {
		System.out.println("Total Space Avail :" + tot);
		System.out.println("\t sedan : " + sedan + "  SUV : " + suv
				+ "  Hatch : " + hatch + "  Scooter : " + scooter + "  Bike : "
				+ bike);
	}

}
