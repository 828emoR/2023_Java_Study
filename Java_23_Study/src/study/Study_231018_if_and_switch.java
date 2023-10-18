package study;


import java.util.Scanner;
public class Study_231018_if_and_switch {
	public static void main (String[]args) {
		//이번에 복습할건 if 문과 if-else, else 문, 그리고 switch-case 문이다. 각각의 사용법을 익히자.
		
		//Scanner 는 어디서든 쓰이니 다시 써보자.
		Scanner word = new Scanner(System.in);
		//변수 설정은 언제든 해야한다.
		String wad;
		double inte;
		double inte2;
		
//		System.out.println("수를 입력하세요");
//		inte = word.nextDouble();
//		if(inte % 2 != 0) {
//			System.out.println(inte + "\s 는 짝수가 아닙니다.");
//		}else {
//			System.out.println(inte +  "\s 는 짝수가 맞습니다");
//		}
		
		//여기까지는 단순한 비교. 
		//조금 복잡하게 들어가보자.
		
		System.out.println("나누어질 수를 입력해주세요");
		inte = word.nextDouble();
		
		System.out.println("나눌 수를 입력해주세요");
		inte2 = word.nextDouble();
		
		//여기서 1차 예외사항을 두자. 나눌 수 보다 나누어질 수가 작을 경우에는 팅궈버리자.
		if(inte <= inte2) {
			System.out.println("나눌 수가 나누어질 수보다 큽니다.");
		}else{
			System.out.println(inte +"\s 와 \s" + inte2 + "를 나눈 값은" + inte / inte2 + "입니다.");
		}
		
		
	}
}
