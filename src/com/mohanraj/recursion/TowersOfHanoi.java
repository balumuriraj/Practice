package com.mohanraj.recursion;

public class TowersOfHanoi {

	public void hanoi(int disks, int from, int to, int aux) {
		if (disks == 1) {
			System.out.println(from + " -> " + to);
		} else {
			TowersOfHanoi t = new TowersOfHanoi();
			t.hanoi(disks - 1, from, aux, to);
			System.out.println(from + " -> " + to);
			t.hanoi(disks - 1, aux, to, from);
		}
	}

	public static void main(String[] args) {
		int disks = 4;
		TowersOfHanoi t = new TowersOfHanoi();
		t.hanoi(disks, 1, 3, 2);
	}
}
