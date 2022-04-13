/*
*
*
*@author TienTruong
*@date 06-02-2000
*@version 1.0
*/

package Bai3;

import java.util.Scanner;

public class Bai3 {
	public static void getChuoi(String string) {
		System.out.println(string);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập số  n");
		// Nhập chuỗi parse sang số để lúc 
		String st = sc.nextLine();
		int n = Integer.parseInt(st);
		while (n <= 0) {
			System.out.println("Mời bạn nhập lại n");
			String st1 = sc.nextLine();
			n = Integer.parseInt(st1);
		}
		System.out.println("Mời bạn nhập chuỗi: ");
		String s = sc.nextLine();
		for (int i = 0; i < n; i++) {
			getChuoi(s);
		}
		sc.close();
	}
}
