package weel04_1.khkim;

public class TestMain {

	public static void main(String[] args) {
//		Vehicle v1 = new Vehicle();
//		v1.showStatus();
//		System.out.println("------------------------");
//		v1.changeGear('D');
//		v1.accelerate(50);
//		v1.accelerate(100);
//		v1.showStatus();
		
		Vehicle v1 = new Vehicle("purple", 0, 1000, 'P', new TV());
//		Vehicle v1 = new Vehicle("purple", 0, 1000, 'P',);
		System.out.println("v1   : "  + v1);
		v1.tv.powerOnOff();
		v1.tv.channelUP();
		v1.showStatus();
		System.out.println("------------------------");
		
		Vehicle v2 = new Vehicle("red", 1000); // 생성자를 추가해야 사용할 수 있음 
		// 중간고사에 new 있으면 생성자를 추가하면 됨 
		v2.showStatus();
		System.out.println("------------------------");

		Vehicle v3 = new Vehicle(); // 에러 클릭해서 constructor 생성하기 누르기!
		v3.showStatus();
		System.out.println("------------------------");

		Vehicle v4 = new Vehicle(v1); // 복사 생성자 필요 
		v1.color = "pink";
		v4.tv.powerOnOff(); // 오류 => 복사 생성자에 tv 객체를 넘기지 x
		System.out.println("v4");
		v4.showStatus();
		System.out.println("v1");

		v1.showStatus();

		
	}

}

// 객체 : 생성자 개수만큼 생성할 수 있음. 
// 생성자를 생성하면 default 생성자 생성 x,매개변수 필요
// 객체 자신에 대한 레퍼런스 : this // 생성자 생성하면 보게 될 것 

//!!
// static 멤버수 : 객체 없이 사용.
// this : 객체가 꼭 있어야 사용 가능.
//!!
