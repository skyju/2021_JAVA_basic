package com.test.workshop3.account;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.test.workshop3.exception.AccountNotFoundException;
import com.test.workshop3.exception.InvalidValueException;

public class AccountTest {    
    public static void main( String[] args ) {        
        int menu  = 0;
        Account acc = null;
        while ( menu != 9 ) {            
            printMenu();            
            try {
            	String account;
            	String name;
            	int balance;
                menu = Integer.parseInt(getUserInput());           
                switch ( menu ) {
                case 1:     // 계좌 생성
                    System.out.print( "\n계좌번호 : " );
                    account = getUserInput();
                    System.out.print( "예금주 : " );
                    name = getUserInput();
                    System.out.print( "최초 입금 : " );
                    balance = Integer.parseInt(getUserInput());
                    acc = new Account(account, name, balance);
                    break;
                case 2:     // 계좌 정보 출력
                	checkAccount(acc);
                	System.out.println(acc.toString());
                    break;
                case 3:     // 입금
                	checkAccount(acc);
                    System.out.print( "입금할 금액 : " );
                    int input4 = Integer.parseInt(getUserInput());
                    acc.deposit(input4);
                    break;
                case 4:     // 출금
                	checkAccount(acc);
                    System.out.print( "출금할 금액 : " );
                    int input5 = Integer.parseInt(getUserInput());
                    acc.withdraw(input5);
                    break;
                case 9:     // 종료
                    System.out.println( "종료합니다." );
                    break;
                default:
                    System.out.println( "[에러] 메뉴를 잘못 입력하였습니다." );
                    break;
                }
            } catch (InvalidValueException e) {
            	System.out.println(e.getMessage());
            } catch (AccountNotFoundException e) {
            	System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
            	System.out.println("[에러] 메뉴는 숫자로 입력해야 합니다.");
            } catch (Exception e) {
            	System.out.println(e.getStackTrace());
            }
        }//while문 종료
    }//main method
    
    public static void checkAccount(Account acc) throws AccountNotFoundException {
    	if(acc == null) {
    		throw new AccountNotFoundException("[에러] 계좌가 없습니다.");
    	}
    }
    private static void printMenu() {
        System.out.println( "\n===== < 메뉴 > =====" );
        System.out.println( " 1. 계좌 생성" );
        System.out.println( " 2. 계좌 정보 출력" );
        System.out.println( " 3. 입금" );
        System.out.println( " 4. 출금" );
        System.out.println( " 9. 종료" );
        System.out.println( "===================" );
        System.out.print( ">> 메뉴 : " );
    }
    public static String getUserInput() {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = null;
        try {
            inputString = br.readLine();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        return inputString;
    }
}