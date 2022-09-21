package week04lab;

import java.util.Scanner;

public class TestMainLab02 {

	public static void main(String[] args) {
		System.out.println("201811962 김기현 ");
		Scanner scanner = new Scanner(System.in);

		TV tv1 = new TV();

		
		tv1.powerOnOff(); // 전원 끔 
		tv1.powerOnOff(); // 전원 킴 
		tv1.channelUp();
		tv1.channelDown();
		tv1.volumeUp();
		tv1.volumeDown();
		

		System.out.print("채널을 몇 번으로 변경하겠습니까? ");
		int changeChannel = scanner.nextInt();
		tv1.changeChannel(changeChannel);
		System.out.print("볼륨을 얼마로 변경하겠습니까? ");
		int changeVolume = scanner.nextInt();
		tv1.changeVolume(changeVolume);
		
	}

}
