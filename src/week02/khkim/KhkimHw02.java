package week02.khkim;

public class KhkimHw02 {

	public static void main(String[] args) {
		System.out.println("201811962 김기현");

		int rgb = 0x88a5ff73;
		
//		int g   = 0x88a50073;
//		
//		int deleteGreen = rgb & g;
//	
//		String strRgb = Integer.toBinaryString(rgb);
//		System.out.println("현재 색상 : " +strRgb);
//		
//		String strDeleteGreen = Integer.toBinaryString(deleteGreen);
//		System.out.println("변경 색상 : " +strDeleteGreen);	

		System.out.println("현재 색상 : " +Integer.toBinaryString(rgb));

		int b = rgb << 24;
		System.out.println("b : " +Integer.toBinaryString(b));

		int c = b >>> 24;
		System.out.println("c : " +Integer.toBinaryString(c));

		int right_rgb = rgb >> 16;
		System.out.println("right_rgb : " +Integer.toBinaryString(right_rgb));

		int left_rgb = right_rgb << 16;
		System.out.println("left_rgb : " +Integer.toBinaryString(left_rgb));

		int target_rgb = c | left_rgb;
		
		System.out.println("변경 색상 : " +Integer.toBinaryString(target_rgb));

		
	
	}

}
