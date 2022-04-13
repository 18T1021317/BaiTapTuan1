/*
*
*
*@author TienTruong
*@date 06-02-2000
*@version 1.0
*/

package BaiTongHop4567;

import java.util.Scanner;

public class Assigiment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luaChon = 0;
		System.out.println("----------- LỰA CHỌN YÊU CẦU  -----------");
		do {
			System.out.println("Chọn (1) để tiếp tục.");
			System.out.println("Chọn số bất kỳ để thoát.");
			luaChon = sc.nextInt();
			if (luaChon == 1) {
				int luaChonYeuCau = 0;
				do {
					System.out.println("************LỰA CHỌN YÊU CẦU ĐỂ GIẢI PHƯƠNG TRÌNH************");
					System.out.println("Chọn (1) để Giải phương trình bậc 1.");
					System.out.println("Chọn (2) để Giải phương trình bậc 2.");
					luaChonYeuCau = sc.nextInt();
				} while (luaChonYeuCau != 1 && luaChonYeuCau != 2);

				if (luaChonYeuCau == 1) {
					// Bài 4
					double a, b, x;
					System.out.println("Nhập vào số a = ");
					a = sc.nextDouble();
					System.out.println("Nhập vào số b = ");
					b = sc.nextDouble();

					if (a == 0) {
						if (b == 0) {
							System.out.println("Phương trình có vô số nghiệm");
						} else {
							System.out.println("Phương trình vô nghiệm");
						}
					} else {
						x = -b / a;
						System.out.println("Phương trình có nghiệm x = " + x);
					}
				} else if (luaChonYeuCau == 2) {
					// Bài 5
					double a, b, c, x1, x2, delta;
					System.out.println("Nhập vào số a = ");
					a = sc.nextDouble();
					System.out.println("Nhập vào số b = ");
					b = sc.nextDouble();
					System.out.println("Nhập vào số c = ");
					c = sc.nextDouble();

					delta = Math.pow(b, 2) - 4 * a * c;

					if (a == 0) {
						System.out.println("Nhập dữ liệu sai");
					} else {

						if (delta < 0) {
							System.out.println("Phương trình vô nghiệm");
						} else if (delta == 0) {
							x1 = -b / 2 * a;
							System.out.println("Phương trình có nghiệm kép x1 = x2 = " + x1);
						} else {
							x1 = (-b + Math.sqrt(delta)) / (2 * a);
							x2 = (-b - Math.sqrt(delta)) / (2 * a);
							System.out.println("Phương trình có 2 nghiệm phân biệt");
							System.out.println("x1 = " + x1);
							System.out.println("x2 = " + x2);
						}
					}
				}

			}

		} while (luaChon == 1);
		sc.close();
	}
}
