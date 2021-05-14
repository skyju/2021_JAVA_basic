package com.test.workshop3.account;
import com.test.workshop3.exception.InvalidValueException;

public class Account {
    
    private String account;
    public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	private String name;
    private int    balance;
    
    public Account() {
    }
    public Account(String account, String name, int balance) throws InvalidValueException {
        //TODO ���� �Ա� �ݾ��� 0�� ������ ���, ���� �߻�
    	this.account = account;
        this.name    = name;
        this.balance = balance;
    	if (balance <= 0) {
    		throw new InvalidValueException("[����] ���� ���� ��, ���� �Ա� �ݾ��� �ʿ��մϴ�.");
    	}
    }
    public void deposit(int money) throws InvalidValueException {
        //TODO �Ա��� �ݾ��� �߸� �Էµ� ���, ���� �߻�
        if (money <= 0) {
        	throw new InvalidValueException("[����] �Ա��� �ݾ��� 0�� �ʰ��� ���ڷ� �Է��ϼ���.");
        }
        balance += money;
    }
    public void withdraw(int money) throws InvalidValueException {
        //TODO ����� �ݾ��� �߸� �ԷµǾ��ų�, �ܾ��� ������ ��� ���� �߻�
        if (money <= 0) {
        	throw new InvalidValueException("[����] ����� �ݾ��� 0�� �ʰ��� ���ڷ� �Է��ϼ���.");
        }
        if (this.balance < money) {
        	throw new InvalidValueException("[����] �ܾ��̺����մϴ�.");
        }
        balance -= money;
    }
    @Override
    public String toString() {
    	return "[����] " + account + "\t[������] " + name + "\t[�ܾ�] " + balance;

    }
}