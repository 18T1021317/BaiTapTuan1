/*
*
*
*@author TienTruong
*@date 06-02-2000
*@version 1.0
*/

package Bai4;

import java.util.Scanner;

public class Bai4 {
	public static void giaiPhuongTrinh(int a, int b) {
		if (a == 0 && b == 0) {
			System.out.println("Phương trình vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else if (a != 0) {
			System.out.println("Phương trình có nghiệm duy nhất x = " + (-b / a));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số a : ");
		int a = sc.nextInt();
		System.out.println("Nhập số b : ");
		int b = sc.nextInt();
		giaiPhuongTrinh(a, b);
		sc.close();
	}
}
