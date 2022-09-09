package week02.khkim;

public class KhkimHw02 {

	public static void main(String[] args) {

		int rgb = 0x88a5ff73;
		int g   = 0x88a50073;
		
		int deleteGreen = rgb & g;
		
		// 1000,1000,  1010,0101,  1111,1111,  0111,0011
		// 1000,1000,  1010,0101,  0000,0000,  0111,0011
	
		String strRgb = Integer.toBinaryString(rgb);
		System.out.println("현재 색상 : " +strRgb);
		
		String strDeleteGreen = Integer.toBinaryString(deleteGreen);
		System.out.println("변경 색상 : " +strDeleteGreen);	
	}

}
