//package week04.khkim;
////for Khkim0920_0 test
//
//public class TV { // package 내부에 동일한 클래스가 2개이상 있을 수 없음 
//	
//
//}

package week04.khkim;
public class TV  { // package 내부에 동일한 클래스가 2개이상 있을 수 없음 

		TV tv1 = new TV();
		tv1.powerOnOff();
		tv1.channelUP();
		tv1.channelUP();
		
		
		TV tv2 = new TV();
		tv2.powerOnOff();
		tv2.channelUP();
		tv2.channelUP();
		
		tv1.show();
		
		tv1 =tv2; // 객체 대입 
		tv1.show();
	}
}
//
//
//class TV{
//	public boolean power; 
//	public int channel;
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
//	
//
