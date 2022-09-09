package week02.khkim;

import java.util.Scanner;

public class KhkimHw01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("학번:");
		int number = scanner.nextInt();

		System.out.print("이름:");
		String name = scanner.next();
		
		System.out.print("나이:");
		int age = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("주소:");
		String addr = scanner.nextLine();
		
		System.out.println("학번:"+number);
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("주소:"+addr);
		 
		scanner.close();

		
	}

}
