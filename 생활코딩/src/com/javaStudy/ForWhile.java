package com.javaStudy;

import java.util.Scanner;

public class ForWhile {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForWhile fw = new ForWhile();
//		fw.printstar();
		fw.printstar2();

	}

	public void printstar() {

		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= num; j++) {
					if (i > j) {
						System.out.print("*");
					} else if (i == j) {
						System.out.println(j);
					}
				}
			}
		} else {
			System.out.println("����� �ƴմϴ�.");
		}
	}

	public void printstar2() {
		System.out.print("���� �ϳ� �Է�  : ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= num; j++) {
					if (i > j) {
						System.out.print("*");
					} else if (i == j) {
						System.out.println("*");
					}
				}
			}
		} else if (num < 0) {
			for (int i = num; i < 0; i++) {
				for (int j = num; j < 0; j++) {
					if (i <= j) {
						System.out.print("*");
					}
				}
				System.out.println();
			}

		} else if (num == 0) {
			System.out.println("��� ����� �����ϴ�.");
		}

	}

}
