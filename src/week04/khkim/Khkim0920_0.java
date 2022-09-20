package week04.khkim;

import java.util.Scanner;

//
//public class Khkim0920_0 {
//	//객체지향프로그래밍
//	//다형성 : 같은 이름의 메소드가 객체에 따라 다르게 구현
//	public static void main(String[] args) {
//		TV tv1 = new TV();
//		tv1.powerOnOff();
//		tv1.channelUP();
//		tv1.channelUP();
//		
//		
//		
//	}
//
//}

public class Khkim0920_0{
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = scan.nextLine();
		System.out.print("찾을 문자 입력 : ");
		String a = scan.nextLine();
		System.out.print("바꿀 문자 입력 : ");
		String b = scan.nextLine();
		
		changeCharacter change = new changeCharacter();
		char[] result = change.repalceChar(str, a.charAt(0), b.charAt(0));
		System.out.println(result);
	}
}
		//
//	public boolean power=true;  
//	public int channel=10;
//	
//	public void show() { 
//	// public static void show() //: power를 사용할 수 없음 
//		if(power) {
//			System.out.println("channel " + channel+"번 시청중입니다. ");
//		}else {
//			System.out.println("전원이 꺼져있습니다.  ");
//
//		}
//	}
//	
//	public void powerOnOff() {
//		power = !power;
//		show(); // 메서드 실행 
//	}
//	
//	public void channelUP() {
//		if(power) { // 전원이 켜져있을 때만 실행 
//			channel++;
//		}
//		show();
//	}
//	
//	public void channelDown() {
//		if(power) {
//			channel--;
//		}
//		show();
//	}
//	}
//	
