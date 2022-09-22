package week04.khkim;

import java.util.Scanner;

public class TestMain0920{
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



//public class Khkim0920_0 {
//	//객체지향프로그래밍
//	//다형성 : 같은 이름의 메소드가 객체에 따라 다르게 구현
//	public static void main(String[] args) {
//		TV tv1 = new TV();
//		tv1.powerOnOff();
//		tv1.channelUP();
//		tv1.channelUP();	
//	}
//
//}



//public class TestMain0920{
//	public static void main(String[] args) { 
//		System.out.println("201811962 김기현 ");
//		TV tv1 = new TV();
//		tv1.powerOnOff(); // 전원 끔 
//		tv1.powerOnOff(); // 전원 킴 
//		tv1.channelUP();
//		tv1.channelUP();
//		tv1.volumeUp();
//		tv1.volumeUp();
//		tv1.volumeUp();
//	
//		System.out.println();
//		System.out.println("++++++++++++++++");
//		System.out.println("201811962 김기현 ");
//
//		System.out.println();
//	
//	
//		TV tv2 = new TV();
//		tv2.powerOnOff(); // 전원 끔 
//		tv2.powerOnOff(); // 전원 킴 
//		tv2.channelUP();
//		tv2.channelUP();
//		tv2.volumeDown();
//		tv2.volumeDown();
//		tv2.volumeDown();
//		tv2.volumeDown();
//		
//	
//
//	}
//}