package com.self;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MySqlDao���� �˻�");
		
	}

	@Override
	public void insert() {
		System.out.println("MySqlDao���� ����");
		
	}

	@Override
	public void update() {
		System.out.println("MySqlDao���� ����");
		
	}

	@Override
	public void delete() {
		System.out.println("MySqlDao���� ����");
		
	}

}
