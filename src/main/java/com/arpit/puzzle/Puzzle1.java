package com.arpit.puzzle;

public class Puzzle1 {

	static int[] people = new int[100];

	static {
		for (int i = 0; i < 100; i++) {
			people[i] = 1;
		}
	}

	public static void main(String[] args) {
		int index = lastSurvivor(people);
		
		System.out.println("The last man standing is at "+index+" position");
	}

	private static int lastSurvivor(int[] people2) {

		int count = 100;
		int lastIndex = 0;
		boolean shoot = false;

		while (count != 1) {
			count = 0;
			for (int i = 0; i < 100; i++) {
				if (people2[i] == 1 && !shoot) {
					count++;
					lastIndex = i+1;
					shoot = true;
				} else if (people2[i] == 1 && shoot) {
					people2[i] = 0;
					shoot = false;
				}
			}
		}

		return lastIndex;
	}

}
