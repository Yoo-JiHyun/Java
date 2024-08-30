package Day01;

public class Ex01_기본구조 {
	
	// 기본구조 
	
	int age = 20;
	int level = 99;
	int energy; //int 자료형은 값을 입력하지 않았을 때,기본값 0으로 초기화
	// ** int는 정수형=기본자료형 (null을 가질 수 없음) 참조자료형은 null 가질 수 있음
	
	// 메소드
	// * 접근지정자 (static) 반환타입 메소드명( 매개변수 ) { 실행문; }
	public int sum( int x, int y) {
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		int result = x + y;
		// * return (값)
		// 1. 메소드 종료
		// 2. (값)을 메소드를 호출한 자리로 반환
		return result;
	}
	
	
	// main : ctrl + space = 프로그램 시작

	public static void main(String[] args) {
		// 객체 생성 : 클래스명 + 객체명 = new 클래스명();
		Ex01_기본구조 객체1 = new Ex01_기본구조();
		
		// 기본 출력sysout : ctrl + space
		System.out.println("나이 : " + 객체1.age);
		System.out.println("레벨 : " + 객체1.level);
		System.out.println("에너지 : " + 객체1.energy);
		
		// 메소드 호출(실행)
		// * 메소드명( 인수1, 인수2 );
		// - 인수(인자; argument) : 메소드로 전달해줄 값
	int answer = 객체1.sum(10, 20);
	System.out.println("answer : " + answer);
	}

}
