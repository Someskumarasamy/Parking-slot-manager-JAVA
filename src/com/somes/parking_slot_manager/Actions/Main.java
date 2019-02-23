package com.somes.parking_slot_manager.Actions;

public class Main {
	public static void main(String ards[]) {
		Admin am = new Admin();
		UserActions ua = new UserActions();

		while (true) {
			System.out.println("1)Admin 2)User 3)Exit");
			int ch = Ut.s.nextInt();
			if (ch == 1) {
				am.adminActions();
			} else if (ch == 2) {
				ua.userAction();
			} else {
				System.exit(0);
			}
		}

	}
}
/*
 * All concepts are implemented well
 */