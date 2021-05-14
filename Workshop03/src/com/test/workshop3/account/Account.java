package com.test.workshop3.account;
import com.test.workshop3.exception.InvalidValueException;

public class Account {
    
    private String account;
	private String name;
    private int    balance;
    public Account() {}
    public Account(String account, String name, int balance) throws InvalidValueException {
    	this.account = account;
        this.name    = name;
        this.balance = balance;
    	if (balance <= 0) {//���� �Ա� �ݾ��� 0�� ������ ��� ���� �߻�
    		throw new InvalidValueException("[����] ���� ���� ��, ���� �Ա� �ݾ��� �ʿ��մϴ�.");
    	}
    	if (this.account.equals("")) {
    		throw new InvalidValueException("[����] ���� ���� ��, ���� ��ȣ �Է��� �ʿ��մϴ�.");
    	}
    	if (this.name.equals("")) {
    		throw new InvalidValueException("[����] ���� ���� ��, ������ ���� �ʿ��մϴ�.");
    	}
    }
    
    public void deposit(int money) throws InvalidValueException {
        if (money <= 0) {//�Ա��� �ݾ��� 0�� ������ ��� ���� �߻�
        	throw new InvalidValueException("[����] �Ա��� �ݾ��� 0�� �ʰ��� ���ڷ� �Է��ϼ���.");
        }
        balance += money;
    }
    
    public void withdraw(int money) throws InvalidValueException {
        if (money <= 0) {//����� �ݾ��� 0�� ������ ��� ���� �߻�
        	throw new InvalidValueException("[����] ����� �ݾ��� 0�� �ʰ��� ���ڷ� �Է��ϼ���.");
        }
        if (this.balance < money) {//�ܾ��� ������ ��� ���� �߻�
        	throw new InvalidValueException("[����] �ܾ��̺����մϴ�.");
        }
        balance -= money;
    }
    
    @Override
    public String toString() {
    	return "[����] " + account + "\t[������] " + name + "\t[�ܾ�] " + balance;
    }
}