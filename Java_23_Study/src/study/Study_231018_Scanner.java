package study;

import java.util.Scanner;

public class Study_231018_Scanner {
	public static void main (String[]args) {
		
//		자 이번엔 계속 정해진 출력만 나오면 꼬우니까 한번 다른걸 만들어보자.
//		
//		"이번에 배워볼건 입력을 받고 그 입력을 이용해 출력을 해볼거다."
//		"그 출력이 무엇이냐 하니 바로 스캐너(Scanner)이다. 얘는 어떻게 쓰는걸까?
//		지금 우리가 사용하는 .java 파일을 보면 최상단에 package 가 보이는가? 해당 구문 아래에 불러올 클래스를 다시 적어줘야 한다.
//		당장 요 위쪽에 적어보자. 방법은 이렇다. import java.utill.scanner;");
//		뭔가 이상하지 않나? 분명 적긴 적었는데 불안한 노란줄이 뜬다. 해당 줄은 적어놓고 사용하지 않아서 나온 것이니 무시하고 적어주자.
		
		Scanner info = new Scanner(System.in);
		//"자 여기서도 불안한 노란줄이 떴다. 하지만 우린 알고있지? 안써서 그런거다 안써서."
		//"위에 쓴 첫번째 Scanner 는  타입이다. 그 후에 들어온 "info" 는 내가 임의로 설정한 입력값의 이름이다. 뭘 붙여도 상관은 없지만 이왕이면 하려고 하는 행동을 구분 할 수 있는 이름이면 좋겠지?
		//"= 은 그냥 = 이다. C나, C++에서 배웠듯이 =의 오른쪽의 값을 왼쪽에 대입한다는 소리다. 그럼 당연히 다음 문장이 이해가 가게된다. \n new 는 당연히 새로 만들었단 소리고, Scanner는 새로 받아올 녀석이 Scanner을 통해 받아왔단거다.
		//"자 그럼 먼저 숫자를 받아와보자. 간단하게 내 생년월일을 적어볼까? 물론 특수문자는 제외하고 순수하게 숫자만 적어보자.
		String name; // String 타입이다. 어디서 많이 봤지 않나? 바로 문자열을 받아오는 메소드이다.
		int age; // int 타입이다. 이 또한 어디서 봣을것이다. 숫자를 받아오는 메소드이다.
		double height; //double타입이다. 뭐 말 안해도 알거다.;
		String buffer;
		String Intro;
		
		
		System.out.println("마 이름 뭐꼬 함 적어봐라 \n ->");
		name = info.next();//String 으로 불러올 입력값이다. 여기에는 숫자가 들어가지 못한다.
		
		System.out.println("나이도 함 적어봐라 \n ->");
		age = info.nextInt(); // int 로 불러올 입력값이니 당연히 문자는 못 들어간다.
		
		System.out.println("좋다 키도 함 적어봐라 소수점도 포함해서 \n ->");
		height = info.nextDouble(); // double다. 이젠 특문도 들어간다.
		
		Intro = info.nextLine();
		System.out.println("자, 니 이름은 \s" + name + " \s \n" + "나이는 \s"+ age + "살 \s \n" + "키는 \s" + height +"cm, 맞나?");
		System.out.println(Intro);
		
	}
}
