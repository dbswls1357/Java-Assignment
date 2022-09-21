package week04lab;

public class TV {
	boolean power = true;
	int channel = 10;
	int volume = 10;
	
	public void show() {
		if(power) {
			System.out.println("channel " + channel+"번 시청중입니다. ");
			System.out.println("volume 크기는 " + volume+"입니다. ");
		}else {
			System.out.println("전원이 꺼져있습니다.  ");
		}
	}
	
	public void powerOnOff() {
		power = !power;
		show();
	}
	
	public void channelUp() {
		if(power) {
			channel++;
		}
		show();
	}
	public void channelDown() {
		if(power){
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
			if(volume < 0) {
				volume = 0;
			}

		}
		show();
	}
	public void changeChannel(int ch) {
		channel = ch;
		show();
	}
	
	public void changeVolume(int vol) {
		volume = vol; //int 붙이지 말것. 왜냐 : 정의되어있으니까 
		if(volume < 0) {
			volume = 0;
		}else if(volume > 20) {
			volume = 20;
		}
		show();

	
	}
}
