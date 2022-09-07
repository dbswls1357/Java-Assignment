package week02.khkim;

import java.io.IOException;
import java.util.Scanner;

public class Khkim01 {

	public static void main(String[] args) throws IOException  {
		// week01
		// casting : 자동, 수동(명시적 타입변환)
	 	// short 타입 연산에서 오류난 이유는 int타입보다 작아서 int로 자동변환됨.
		// System.out.println(10/4); // 2
		
		// week02
		//printf("나이 : %d", 12);
		
//		// 예1	
//		int key = System.in.read(); // 1byte만 읽어냄, IOException가 필요
//		char ch = (char)System.in.read(); 
//		
//		System.out.printf("%d, %c", key, ch); // ac 이렇게 입력  a만 입력 : a, /r으로 인
//
//		//printf("나이 : %d", 12);
//		
//		
//		//int key = System.in.read(); // 1byte만 읽어냄, IOException가 필요
//		
		
		//예2
//		int key;
//		while((key = System.in.read())!=-1) {
//			System.out.printf("%d\n", key);  
//
//		}
//		key = System.in.read();
//		System.out.printf("%d\n", key); // ac 이렇게 입력  a만 입력 : a, /r으로 인식 
//		
//		key = System.in.read();
//		System.out.printf("%d\n", key); 
//		
//		key = System.in.read();
//		System.out.printf("%d\n", key); 	
//		왜 control + d가 안먹히지?	
		
		// 예3
//		Scanner scanner = new Scanner(System.in);
//		// 끊어내는 기준은 공백이다.
//		String name = scanner.next();
//		String city = scanner.next();
//		int age = scanner.nextInt(); // 20
//		double weight = scanner.nextDouble(); // 65.1
//		boolean single = scanner.nextBoolean(); // true
//		// nextLine() : \n을 구분자로 사용, 공백이 있는 문자열로 받음 <==>  next();  
//		System.out.println(name); 
//		System.out.println(city);  
//		// close() 키보드 사용을 완전히 끊어버림, 입력을 받을 수 없음

		// 예4
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		// scanner.nextLine(); // 입력 버퍼 초기화, 중간에 온다면 이 구문이 꼭 필요  
		String addr = scanner.nextLine();
		System.out.println("당신의 주소 " + addr + "입니다.");  // "중간"에 입력되면 엔터때문에 데이터가 있다고 판단해 읽고 끝냄 !주의!
		
		
		String name = scanner.next(); 
		System.out.println("당신의 이름은 " + name + "입니다."); 
		String city = scanner.next();
		System.out.println("당신이 사는 도시는 " + city + "입니다."); 
		int age = scanner.nextInt();
		System.out.println("당신의 나이는 " + age + "살입니다."); 
		double weight = scanner.nextDouble(); // 실수 토큰 읽기 
		System.out.println("당신의 체중은 " + weight + "kg입니다."); 
		boolean single = scanner.nextBoolean(); 
		System.out.println("당신은 독신 여부는 " + single + "입니다.");
		scanner.close();
	}

}
