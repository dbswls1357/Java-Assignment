package week04.khkim;

public class changeCharacter {
	public void repalceChar(char[] str, char a, char b) {
		//a를 찾아서 b로 변경
		for(int i = 0; i<str.length; i++) {
			if(str[i] == a) {
				str[i] = b;
			}
		}
	
	}
	
	public char[] repalceChar(String str, char a, char b) {
		char[] cstr = str.toCharArray(); // 객체를 생성해야 함.
		//repalceChar(str.toCharArray(), a, b); // 에러 발생, 익명 객체 생성  
		repalceChar(cstr, a, b);
		return cstr;
	}
}