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
    	if (balance <= 0) {//최초 입금 금액이 0원 이하인 경우 예외 발생
    		throw new InvalidValueException("[에러] 계좌 생성 시, 최초 입금 금액이 필요합니다.");
    	}
    	if (this.account.equals("")) {
    		throw new InvalidValueException("[에러] 계좌 생성 시, 계좌 번호 입력이 필요합니다.");
    	}
    	if (this.name.equals("")) {
    		throw new InvalidValueException("[에러] 계좌 생성 시, 예금주 명이 필요합니다.");
    	}
    }
    
    public void deposit(int money) throws InvalidValueException {
        if (money <= 0) {//입금할 금액이 0원 이하인 경우 예외 발생
        	throw new InvalidValueException("[에러] 입금할 금액은 0원 초과의 숫자로 입력하세요.");
        }
        balance += money;
    }
    
    public void withdraw(int money) throws InvalidValueException {
        if (money <= 0) {//출금할 금액이 0원 이하인 경우 예외 발생
        	throw new InvalidValueException("[에러] 출금할 금액은 0원 초과의 숫자로 입력하세요.");
        }
        if (this.balance < money) {//잔액이 부족한 경우 예외 발생
        	throw new InvalidValueException("[에러] 잔액이부족합니다.");
        }
        balance -= money;
    }
    
    @Override
    public String toString() {
    	return "[계좌] " + account + "\t[예금주] " + name + "\t[잔액] " + balance;
    }
}