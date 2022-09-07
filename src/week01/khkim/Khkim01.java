////예시 
//package week01.khkim;
//
//public class Khkim01 {
//	
//	final int COFFEE = 500;  // static이 없으면 꼭 main클래스에 객체 'david'를 생성하고 사용 .
//	final int WATER  = 200;  // static이 없다면 객체말고 여기에다가 저장됨.
//	final int MILK   = 100;
//	//	final int MILK = 100; // 붕어빵이 필요함, 앙꼬에 해당하는 것이 필요 
//
//	public static int getCost(int price, int num) { // static이 붙어있으므로 클래스만 해당 정보를 가짐, 객체 없어도 됨,
//		return price * num;
//	}
//	
//	public static void main(String[] args) {
//		// static final int COFFEE = 100;
//		// static final int WATER = 50;
//		// 다음의 에러 발생 : Illegal modifier for parameter COFFEE; only final is permitted
////		final int COFFEE = 500; // 지역 상수 선언 
////		final int WATER = 200;
////		final int MILK = 100;
//		
//		Khkim01 david  = new Khkim01();  // 첫번째 붕어빵  
//		Khkim01 david2 = new Khkim01(); // 두번째 붕어빵  
//		
//		int coffee = 5;
//		int water  = 2;
//		int milk   = 2;
//	
//	
//		int coffeeCost = getCost(david.COFFEE, coffee); // getCost 함수 호출
//		int waterCost  = getCost(david2.WATER, water); // 객체를 통해 정보 접근  
//		int milkCost   =  getCost(david.MILK, milk);
//		//int milkCost =  MILK * milk;
//
//		
//		int totalCost = coffeeCost + waterCost + milkCost;
//		System.out.print("총지불금액 : "+ totalCost);
//	
//	}
//
//}

//예시 
package week01.khkim;

public class Khkim01 {
	
	public static final int COFFEE = 500;  // static이 없으면 꼭 main클래스에 객체 david를 생성하고 사용 .
	public static final int WATER  = 200;  //static이 있으면 객체에 값이 저장됨 
	public static final int MILK   = 100;
	//	final int MILK = 100; // 붕어빵이 필요함, 앙꼬에 해당하는 것이 필요 

	public static int getCost(int price, int num) { // static이 붙어있으므로 클래스만 해당 정보를 가짐, 객체 없어도 됨,static이 빠지면 객체를 통해서만 접근 가능 
		return price * num;		 //static이 없다면 getCost(COFFEE, coffee)
	}
	
	public static void main(String[] args) {
		// static final int COFFEE = 100;
		// static final int WATER = 50;
		// 다음의 에러 발생 : Illegal modifier for parameter COFFEE; only final is permitted
//		final int COFFEE = 500; // 지역 상수 선언 
//		final int WATER = 200;
//		final int MILK = 100;
		
		Khkim01 david  = new Khkim01();  // 첫번째 붕어빵  
		Khkim01 david2 = new Khkim01(); // 두번째 붕어빵  
		
		int coffee = 5;
		int water  = 2;
		int milk   = 2;
	
	
		int coffeeCost = getCost(david.COFFEE, coffee); // getCost 함수 호출
		int waterCost  = getCost(david2.WATER, water); // 객체를 통해 정보 접근  => 경고가 뜸.
		//int milkCost   =  getCost(david.MILK, milk);
		int milkCost   =  getCost(MILK, milk); // 객체를 통한 접근이 아닌 그냥 접근이 가능함.
		//int milkCost =  MILK * milk;

		
		int totalCost = coffeeCost + waterCost + milkCost;
		System.out.print("총지불금액 : "+ totalCost);
	
	}

}

