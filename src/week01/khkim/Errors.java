
//package week01.jhchi; // 패키지 변경 
package week01.khkim; 					   
//public class errors // 클래스 이름 변경(파일이름과 클래스 이름 동일화)
enum Weekday { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};


public class Errors  					     
{
  //  public Static main(string[] args) { // main 형식 변경, 대소문자 구분 및 void 추가 
  public static void main(String[] args) {  
    // System.out.println(“이 프로그램은 많은 오류를 가지고 있다.”); // 따옴표 변경(인코딩 문제) 
    System.out.println("이 프로그램은 많은 오류를 가지고 있다.");
    // System.0ut.println(“그러나 프로그램이 이 문장을 출력된다면”) // 대소문자 구분, 구문 맨 끝에 ';' 붙이기, 따옴표 변경(인코딩 문제)   
    System.out.println("그러나 프로그램이 이 문장을 출력된다면");  
    // System.out.Println(“모든 오류를 고친 것이다.); // 대소문자 구분, 따옴표 변경(인코딩 문제)  
    System.out.println("모든 오류를 고친 것이다.");    
    
    //Enum을 외부에 정의하고 내부에서 사용한다.
    Weekday startDay = Weekday.THURSDAY;
    System.out.println(startDay);
  }


}

