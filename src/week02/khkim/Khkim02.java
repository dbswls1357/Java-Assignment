package week02.khkim;

import java.util.Random;

public class Khkim02 {

	public static void main(String[] args) {
		// 20220908 수업 
		// 연산자 
		// =>n의 배수인지 확인해라, 자리수를 뜯어라
		
		// 산술연산자 주의점 
		// short 타입으로 계산해도 형변환을 안해도 된다.
		// int type보다 작다면 int타입으로 계산됨.
		
		// 0으로 나누었을 때 ArithmeticException 주의하기
		// 0.0으로 나누면 Infinity or NaN(예외가 아님)
		// 왜냐하면 0.0은 0.000000000...1의 값이기 때문
		
		// 시프트 연산자 
		// >>> 논리연산자  : 최상위 비트에 0이 채워진다.
		// 0b00001010 => 8개 중 두개의 비트만 이상 정보를 가짐 
		
//		// 비트 연산 예1)
//		int a = 10;
//		int b = -8;
//		int c = a & b; // and 연산 
//		
//		System.out.println("a:"+Integer.toBinaryString(a));
//		System.out.println("b:"+Integer.toBinaryString(b));
//		System.out.println("c:" + Integer.toBinaryString(c));
//		
//		// 비트 연산 예2)
//		int a = 10;
//		int b = -8; // 32bit
//		int c = a & b;
//		
//		String str = "0"; // String 객체 생성 
//		str = str.repeat(32) + Integer.toBinaryString(a); // count만큼 반복해서 새로운 문자를 만들어 낸다. // 32비트로 생성 
//		String astr = str.substring(str.length()-32); // length()안에 아무것도 안나와도 되는구나! // 4번째부터 마지막까지 
//		String cstr = Integer.toBinaryString(c);
//		
//		System.out.println("a : " + astr);
//		System.out.println("b : " + Integer.toBinaryString(b));
//		System.out.println("c : " + "0".repeat(32-cstr.length()) + cstr); // '0' 28개 + cstr

		// 비트 연산 예3)
//		int a = 10;
//		int b = -8;
//		
//		// 잘못 생각한 코드 
//		int tmp = 0;
//		int tmp = a;
//		int a = b;
//		int b = b;
		
		// #1
//		int tmp = a;
//		a = b;
//		b = tmp;
//		
		// #2
//		int a = 10;
//		int b = -8;
//		
//		a = a^b;
//		b = a^b;
//		a = a^b;

//		
//		System.out.println(a);
//		System.out.println(b);
//		
	
//      과제 		
//		16진수니까 2개가 한바이트 88 : 투명도, a5 :red, ff : green, 73 : blue
//		비트 연산으로 계산하기!!!
//		출력값만 binary String으로 변환하기 
		
		
		// 예제 while문 대소문자 
		// 왜 이 방법을 생각못했을까?
//		Scanner scanner = new Scanner(System.in);
//		while(true) {
//			String str1 = scanner.next();
//			char a = str1.charAt(0);// Scanner에는 char이 없다. => String.charAt()사용 		
//			if(a >= 'A' && a < 'Z') {
//				System.out.print(a + ": 대문자");
//			}else if(a >= 'a' && a < 'z') {
//				System.out.print(a + ": 소문자");
//			}else if(a >= '0' && a < '9') {
//				System.out.print(a + ": 숫자");
//			}else {
//				System.out.print(a + ": 기타");
//			}
//		}
		
//		 switch 반드시 break 걸기!! case문에는 식이 오면 안됨 
		
		// 과제3 출력 : 형식 지킬 것 
		// 무승부, 패 사용자 패, 컴퓨터 패 등 결과 출력, 반복 필요 없음
		// if문을 9개 만들지 말고, 이기는 전략을 잘 분석 : 가위 바위 보 빼기 더하기 이런건가?
		
		// 가위 1    가위 - 바위 = -1 (패), 
		// 바위 2    바위 - 가위 = +1 (승)
		// 보   3    무승부 : 0
		
		Random r = new Random();
		while(true) {
			int num = r.nextInt(3);
			System.out.println(num);

		}
		   
		
	
	}

}
