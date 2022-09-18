package week01.khkim;

public class Khkim01Recap {

	public static final int COFFEE = 500;
	public static final int WATER = 500;
	public static final int MILK = 500;
	
	
	
	public static void main(String[] args) {	
		
		int coffee = 5;
		int water  = 2;
		int milk   = 2;
		
		Khkim01Recap davidStore1 = new Khkim01Recap(); // 첫번째 붕어빵
		Khkim01Recap davidStore2 = new Khkim01Recap(); // 첫번째 붕어빵
		
		int coffeeCost = getCost(COFFEE, coffee);              // 붕어빵 틀 없이 가져올 수 있다.
		int coffeeCost1 = getCost(davidStore1.COFFEE, coffee); // 붕어빵 틀로 가져올 수 있다. 

		System.out.println("coffeeCost : " + coffeeCost + " coffeeCost1 : " + coffeeCost1);
		

	}



	public static int getCost(int price, int count) {	
		return price * count;
	}

}
