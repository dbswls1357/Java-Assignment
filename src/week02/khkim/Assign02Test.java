package week02.khkim;

public class Assign02Test {


	public static void main(String[] args) {
		System.out.println("201811962 김기현");

		int rgb = 0x88a5ff73;		
		// 1000,1000,  1010,0101,  1111,1111,  0111,0011
		// 1000,1000,  1010,0101,  0000,0000,  0111,0011
	
		String strRgb = Integer.toBinaryString(rgb);
		System.out.println("현재 색상 : " +strRgb);
		
		int rightRgb = rgb >> 8;
		System.out.println("오밀 색상 : "+Integer.toBinaryString(rightRgb));

		int leftRgb = rightRgb << 24;
		System.out.println("왼밀 색상 : "+Integer.toBinaryString(leftRgb));
		
		int blockRight = (leftRgb >>> 16);
		System.out.println("블럭 색상 : "+Integer.toBinaryString(blockRight));

		
		
		//String strDeleteGreen = Integer.toBinaryString(deleteGreen);
		//System.out.println("변경 색상 : " +strDeleteGreen);	
	}

}
