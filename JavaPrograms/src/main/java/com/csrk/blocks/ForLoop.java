package com.csrk.blocks;


public class ForLoop {
	
	public static void main(String args[]) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" " + j);
			}
			System.out.println("");
		}
		System.out.println("Reverse order");
		for (int a = 5; a > 0; a--) {
			for (int b = 0; b <= a; b++) {
				System.out.print(" " + b);
			}
			System.out.println();
		}
		System.out.println("back order");
		for (int c = 0; c < 5; c++) {
			for (int d = 5; d > c; d--) {
				System.out.print(" " + d);
			}
			System.out.println();
		}
		System.out.println("Square");

		for (int x = 1; x <= 4; x++) {
			for (int y = 1; y <= 4; y++) {
				if (x == 1 || y == 1 || x == 4 || y == 4) {
					System.out.print(y);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("triangle 1");
		for (int k = 1; k <= 5; k++) {
			for (int m = 1; m <= 5 - k; m++) {
				System.out.print(" ");
			}
			for (int l = 1; l <= k; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
