
public class Exam01_Types {
   public static void main(String[] args) {
	   
	   //변수 선언 / 값 대입 int 정수를 대표하는 자료 = 자료형 데이터의 종류를 말해줌 a=변수,이름 공간
	   int a = 10; // 정수
	   // = 대입 이라는 뜻을 가짐 (a라는 공간에 10을 대입 담겠다.)
	   System.out.println( a );
	   
	   int b; //변수 선언 만 함 b라는 비어있는 공간 생성
	   //System.out.println( b ); 이렇게 하면 오류. 데이터가 없어서 출력할 수 없음 
	   //변수를 선언 해놓고 그 공간안에 값을 후에 넣어도 됨
	   b = 20; // b 앞에 자료형 int 생략 즉 자료형은 딱 한번만 붙여주면됨 처음 변수를 선언할때만 (공간을 만들때만 붙임) 
	   System.out.println( b );
	   //20을 담았다가 출력하고
	   //값을 언제든지 바꿀 수 있음 원래 있던 20이라는 값이 사라지고 30으로 덮어씌어짐
	   b = 30;
	   System.out.println("두번째 b: " + b);
	   //30을 담았다가 출력
	   
	   // 변수명 첫 글자는 숫자,특수문자로 시작하면 x
	   // int 40var = 40; , int %var = 40; : syntax error 자바문법에 맞지 않음
	   // 변수명의 길이에 제한은 없지만 보통은 짧게 / 의미있게 짓는다.
	   // int akldjlfkjaskglkjfksdjlfsdkj = 40; 변수명에 노란줄이 뜸 이건 경고창 에러는 아님
	   // 변수안에 들어있는 데이터의 성질에 맞게 이름을 정한다.
	   // int word = 40; 그닥 좋은 이름은 아님
	   
	   int numInt = 40; //정수형 숫자 데이터가 담겨있겠다 라는 추측 가능 number + int
	   // 이름에 두개 이상의 단어가 들어가면 두번째 단어 시작할때 첫 글자는 대문자로 (camel case 라고 함 낙타 등과 같이 생겼다)
	   
	   // boolean : 참(true) 혹은 거짓(false)을 저장하는 자료형 논리적 자료형
	   boolean t = true;
	   boolean f = false;
	   System.out.println("t : " + t);
	   System.out.println("f : " + f);
	   
	   // char : 문자를 저장하는 자료형 (''싱글 쿼테이션을 이용,한글자를 이용)
	   char c1 = 'a';
	   char c2 = '가';
	   char c3 = '5';
	   System.out.println("c1 : " + c1);
	   System.out.println("c2 : " + c2);
	   System.out.println("c3 : " + c3);
	   
	   // 숫자만 저장하는 자료형
	   // 정수형
	   byte b1 = -128; // 데이터 범위 -128 ~ 127 까지
	   byte b2 = 127;
	   System.out.println("b1 : " + b1);
	   System.out.println("b2 : "+ b2);
	   // byte b3 = true; 에러남 데이터 타입에 맞는 데이터만 대입 가능
	   
	   // byte 형 기준으로 byte형 변수에다가 양수인 128을 넣게 되면 무슨일이
	   byte b3 = (byte)128; //강제로 byte으로 함
	   System.out.println("b3 : " + b3); // 갑자기 -128으로 출력
	   byte b4 = (byte)129;
	   System.out.println("b4 : " + b4); //-127로 출력
	   // 본인이 표현할 수 있는 수의 범위를 벗어나서 자신이 표현할수 있는 가장 최소치로 돌아가서 거기서부터 다시 올라옴 오버플로우 현상
	   // -> 최대치 초과하면 최소치로
	   
	   short s1 = -32768; // 데이터 범위 -32768 ~ 32767 까지
	   short s2 = 32767;
	   System.out.println("s1 : " + s1);
	   System.out.println("s2 : " + s2);
	   
	   // int형 -> 정수의 대표타입
	   System.out.println(100); //100은 왜 int형? 명시적으로 자료형으로 제시하지 않고 하면 int 형으로 인식
	   
	   // long -> 데이터(숫자)의 끝에 L을 붙여줘서 long 형임을 명시
	   long l1 = 321321321;
	   System.out.println("l1 : " + l1);
	  // long l2 = 3133213212122; //에러남 숫자를 int 형으로(인트형으로 표현하는 범위 벗어남) 인식했기 때문에
	   long l2 = 3133213212122L;
	   System.out.println("l2 : " + l2);
	   
	   // 실수형
	   // float -> 데이터(숫자)의 끝에 f를 붙여줘 float 형임을 명시
	   float f1 = 3.14f;
	   System.out.println("f1 : " + f1);
	   
	   // double -> 실수의 대표 타입
	   double d1 = 3.14;
	   System.out.println("d1 : " + d1);
	   
	   // 8개의 데이터 타입 -> 자바 가장 기본 데이터 타입(primitive type) / 기본 자료형
	   
	   // String 형 - 참조 자료형 /" " 안에 들어있는 0 글자 이상 의 
	   String str = "가나다";
	   System.out.println("str: " + str);
	   //다른 자료형들과 다르게 대문자로 시작함 (String <-> int, long,...)
	   
	   
	   
   }
}
