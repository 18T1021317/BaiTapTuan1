/*
*
*
*@author TienTruong
*@date 06-02-2000
*@version 1.0
*/
package Bai2;

import java.util.Scanner;

public class Bai2 {
	public static void getChuoi(String string) {
		System.out.println(string);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập chuỗi: ");
		String s = sc.nextLine();
		getChuoi(s);
		sc.close();
	}
}
