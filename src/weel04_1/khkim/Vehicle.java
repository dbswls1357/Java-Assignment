package weel04_1.khkim;

public class Vehicle {
	// 아래로 객체 생성시 무조건 다음의 객체로 생성됨 => 생성자 활용 // BUT 코드의 중복이 많다.
	public String color = "white"; //멤버변
	public int speed = 0;
	public int mileage = 100;
	public char gearStatus = 'P'; //P D N
	public TV tv; 
	
	
	public Vehicle(String color, int speed, int mileage, char gearStatus, TV tv) {
//		super();
//		this.color = color;
//		this.speed = speed;
//		this.mileage = mileage;
//		this.gearStatus = gearStatus;
		this(color,speed,mileage,gearStatus); // 이렇게도 쓸 수 있다. 
//		this.tv = tv;// 얕은 복사, 차는 2개인데 모니터는 1개인 상황
		this.tv = new TV(tv);
	}


	public Vehicle(String color, int speed, int mileage, char gearStatus) {
		super(); // 부모 생성자를 호출(상속의개념);
		this.color = color; // 클래스 내부에서 사용 
		this.speed = speed;
		this.mileage = mileage;
		this.gearStatus = gearStatus;
		System.out.println("this : "+ this);
		
		
	} // source 탭  < generate constructor using fields
	// 생성의 위치는 상관없음 
	

	public Vehicle(String color, int mileage) {
//		super();
		this(color,5, mileage, 'D'); // this() 생성자 쓰면 아래의 코드를 사용안 함.
//		this.color = color;
//		this.mileage = mileage;
//		this.speed = 5;        // 직접 초기화 
//		this.gearStatus = 'D'; // 직접 초기화
	}

	
	public Vehicle() {
		this("black",5,400, 'P'); 
//		this.color = "black";
//		this.mileage = 400;
//		this.speed = 5;        // 직접 초기화 
//		this.gearStatus = 'D'; // 직접 초기화
	}
// 직접 생성자 생성  => 멤버변수로 초기화 시켜줄필요가 없음 
//		public int speed = 0;         => public int speed
//		public int mileage = 100;     => public int mileage
//		public char gearStatus = 'P'; => public char gearStatus


	
		
	public Vehicle(Vehicle v1) {
//		this(v1.color, v1.speed, v1.mileage, v1.gearStatus); //v4에서 에러나는 이유  
		this(v1.color, v1.speed, v1.mileage, v1.gearStatus, v1.tv); //v4에서 에러나는 이유  
		
		// 얖은 복사 
	}// 복사 생성사 생성 


	public void accelerate(int s) {
		if(gearStatus == 'D') {
			speed += s;
			mileage += s;
		}
	}


	public void breaker(int b) {
		if(gearStatus == 'D') {
			speed -= b;
		}
	}

	public void showStatus() {
		System.out.println("color : " + color);
		System.out.println("speed : " + speed);
		System.out.println("mileage : " + mileage);
		System.out.print("gearStatus : ");
		
		switch(gearStatus) {
			case 'P':
				System.out.print("주차");
				break;

			case 'D' :
				System.out.print("주행");
				break;
				
			case 'N' :
				System.out.print("중립");
				break;
				
			default :
				System.out.println();
		}				
		System.out.println();

	}

	public void changeGear(char g) {
		gearStatus = g;
	}

	
	
}
