package weel04_1.khkim;
public class TV  { // package 내부에 동일한 클래스가 2개이상 있을 수 없음 
	boolean power = true;  
	int channel = 10;
	int volume = 2;
	//int volume = 1;

	public TV(TV tv) {
		this.power = tv.power;
		this.channel = tv.channel;
		this.volume = tv.volume;
	}

	public TV() {
	} // 디폴트

	public void show() { 
	// public static void show() //: power를 사용할 수 없음 
		if(power) {
			System.out.println("channel " + channel+"번 시청중입니다. ");
			System.out.println("volume 크기는 " + volume+"입니다. ");
		}else {
			System.out.println("전원이 꺼져있습니다.  ");
		}
	}

	public void powerOnOff() {
		power = !power;
		show(); // 메서드 실행 
	}
	
	public void channelUP() {
		if(power) { // 전원이 켜져있을 때만 실행 
			channel++;
		}
		show();
	}
	
	public void channelDown() {
		if(power) {
			channel--;
		}
		show();
	}
	
	public void volumeUp() {
		if(power) {
			volume++;
			if(volume > 20) {
				volume = 20;
			}
		}
		show();
	}
	
	public void volumeDown() {
		if(power) {
			volume--;
			if(volume <0) {
				volume = 0;
			}
		}
		show();
	}
}


