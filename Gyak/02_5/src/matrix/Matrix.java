package matrix;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[][] matrix = new int[5][5];
		feltolt(matrix);
		System.out.println(matrix.length + " " + matrix[0].length);
		kiir(matrix);

	}

	public static void feltolt(int[][] tomb) {
		for (int i = 0; i < tomb.length; i++) {
			for (int j = 0; j < tomb[0].length; j++) {
				tomb[i][j] = (int) (Math.random() * 50) + 1;
			}
		}
	}

	public static void kiir(int[][] tomb) {
		for (int i = 0; i < tomb.length; i++) {
			for (int j = 0; j < tomb[0].length; j++) {
				System.out.print(tomb[i][j] + " ");
			}
			System.out.println();
		}
	}

}
