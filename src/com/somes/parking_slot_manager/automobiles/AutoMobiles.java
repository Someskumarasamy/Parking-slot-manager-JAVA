package com.somes.parking_slot_manager.automobiles;

public class AutoMobiles {
	private String vehid, userid, slotloc;
	private int slot;
	public String type;

	protected String getVehid() {
		return vehid;
	}

	protected void setVehid(String vehid) {
		this.vehid = vehid;
	}

	protected String getUserid() {
		return userid;
	}

	protected void setUserid(String userid) {
		this.userid = userid;
	}

	protected String getSlotloc() {
		return slotloc;
	}

	protected void setSlotloc(String slotloc) {
		this.slotloc = slotloc;
	}

	public AutoMobiles(String a, String b, String c, int xb, String hy) {
		setVehid(a);
		setUserid(b);
		setSlotloc(c);
		slot = xb;
		type = hy;
	}

	public void printData() {
		System.out.println("\t Vehicle Id : " + getVehid());
		System.out.println("\t User name/Id : " + getUserid());
		System.out.println("\t Location : " + getSlotloc());
	}

	protected int getf() {
		return slot;
	}

	public int getFloor() {
		return getf();
	}

	public String getSlotLoc() {
		return getSlotloc();
	}
}
