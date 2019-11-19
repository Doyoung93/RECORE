package com.self;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		boolean run = true;

		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("----------------------------------------------");
			System.out.println("���� > ");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}

	private static void circlePrintln01() {

		System.out.println("-------------");
		System.out.println("���� ����");
		System.out.println("-------------");

	}

	private static void circlePrintln02() {
		System.out.println("-------------");
		System.out.println("���� ���");
		System.out.println("-------------");

	}

	private static void circlePrintln03() {
		System.out.println("-------------");
		System.out.println("����");
		System.out.println("-------------");
	}

	private static void circlePrintln04() {
		System.out.println("-------------");
		System.out.println("���");
		System.out.println("-------------");
	}

	// ���� �����ϱ�
	private static void createAccount() {

		circlePrintln01();

		System.out.println("���¹�ȣ(000-000����) : ");
		String accountNum = sc.next();
		System.out.println("������ : ");
		String accountOwner = sc.next();
		System.out.println("�ʱ� �Աݾ� : ");
		int accountBal = sc.nextInt();

		Account newAccount = new Account(accountNum, accountOwner, accountBal);

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("��� : ���°� �����Ǿ����ϴ�.");
				break;
			}
		}
	}

	// ���¸�� ����
	private static void accountList() {

		circlePrintln02();

		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if (accountArray[i] != null) {
				System.out.println(account.toString());
			}
		}

	}

	// �����ϱ�
	private static void deposit() {

		circlePrintln03();

		System.out.println("���� ��ȣ(000-000����) : ");
		String accountNum = sc.next();
		System.out.println("���ݾ� : ");
		int accountBal = sc.nextInt();

		Account account = findAccount(accountNum);

		if (account == null) {
			System.out.println("���°� �������� �ʽ��ϴ�.");
			return;
		}
		if (!account.getAno().equals(accountNum)) {
			System.out.println("���¹�ȣ�� �߸� �Է��ϼ̽��ϴ�.");
			return;
		}

		account.setBalance(account.getBalance() + accountBal);
		System.out.println("������ �����Ǿ����ϴ�.");

	}

	// ����ϱ�
	private static void withdraw() {

		circlePrintln04();

		System.out.println("���¹�ȣ(000-000����) : ");
		String accountNum = sc.next();
		System.out.println("��ݾ� : ");
		int accountBal = sc.nextInt();

		Account account = findAccount(accountNum);

		if (account == null) {
			System.out.println("���°� �������� �ʽ��ϴ�.");
			return;
		}
		if (!account.getAno().equals(accountNum)) {
			System.out.println("���¹�ȣ�� �߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		if (account.getBalance() == 0 || account.getBalance() < accountBal || account.getBalance() - accountBal < 0) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}

		account.setBalance(account.getBalance() - accountBal);
		System.out.println("����� �����Ǿ����ϴ�.");

	}

	private static Account findAccount(String ano) {

		Account account = null;

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				String accountNum = accountArray[i].getAno();
				if (accountNum.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}

		}
		return account;
	}

}
