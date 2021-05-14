package com.test.workshop3;

public class ArrayDivideTest {
	
	public static void main( String[] args ) {
    	ArrayCompare();
    }
	
	static void ArrayCompare() {
		int[] arrayOne = { 10, 20, 13, 25 };
		int[] arrayTwo = { 2, 5, 0, 3, 1, 7 };
		for(int i = 0 ; i < arrayTwo.length; i ++) {
			try {
				int a = arrayOne[i]/arrayTwo[i];
	    		System.out.printf("%d / %d = %d\n",arrayOne[i],arrayTwo[i],a);
			} catch(ArithmeticException e) {
	    		System.out.println("나누기 연산 시 에러가 발생하였습니다.");
	    	} catch(ArrayIndexOutOfBoundsException e) {
	        	System.out.println("인덱스 범위를 벗어나는 값에 접근하였습니다.");
	        }	catch(Exception e) {
	    		System.out.println("종료");
	    	}
		}
	}
}
