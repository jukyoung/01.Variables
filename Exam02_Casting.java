
public class Exam02_Casting {
   public static void main(String[] args) {
	   /*
	    * 형변환(Casting) : 데이터의 자료형을 변환하는 것
	    * -> 개발자가 데이터의 타입의 범위를 예측하지 못했을 때 형변환
	    * -> 개발자가 원하는 대로 데이터 타입을 사용하기 위해서 강제적으로 형변환
	    * 
	    * 자동 형변환(promotion) : 작은 자료형에서 큰 자료형으로 변환이 이루어지는 경우
	    * 강제 형변환(down casting) : 큰 작료형에서 작은 자료형으로 변환이 이루어지는 경우
	    * (데이터의 손실이 일어날 수 있음)
	    * */
	   
	   byte b1 = 127;
	   System.out.println("b1 : " + b1);
	   //sysout 누르고 컨트롤 스페이스바 누르면 자동완성
	   short s1 = b1;
	   System.out.println("s1 : " + s1);
	   int i1 = s1;
	   System.out.println("i1 : " + i1);
	   long l1 = i1;
	   System.out.println("l1 : " + l1);
	   // 알아서 자동 형변환 일어남
	   
	   long l2 = 123456789123456789L;
	   System.out.println("l2 : " + l2);
	  // int i2 = l2; 자료형이 맞지 않는다는 에러 뜸 자동적으로 되는것이 아님
	   int i2 = (int)l2; // long형을 int로 변환한다는 소가로를 붙여주기 -> 강제형변환
	   System.out.println("i2 : " + i2); 
	   // 값의 일부가 손실이 일어나게 되면 숫자 조합 자체가 달라지게 됨
	   short s2 = (short)i2;
	   System.out.println("s2 : " + s2);
	   byte b2 =(byte)s2;
	   System.out.println("b2 : " + b2);
	   
	   //정수 -> 실수로 형변환
	   int i3 = 50;
	   float f3 = i3;
	   //강제형변환 하지 않아도 잘 됨 -> 자바에서는 정수가 실수보다 항상 작기 때문에 
	   System.out.println("f3 : " +f3);
	   // 실수 -> 정수로 형변환
	   double d4 = 3.14; // 실수가 정수보다 크기 때문에 강제형변환 필요
	   int i4 = (int)d4;
	   System.out.println("i4 : " + i4);
	   
	   //char -> 문자이지만 실제로 저장되는건 숫자 (예: a 라고 인식할수 있는 숫자 데이터를 의미)
	   // -> 실제로는 내부적으로 문자와 매칭되는 숫자(코드)가 들어있음
	   char c5 = 'a';
	   System.out.println("c5 : " + c5);
	   int i5 = c5; // 문자를 숫자로 저장함에도 에러가 발생하지 않음 
	   //-> a 라는 문자 자체가 저장되는것이 아님
	   System.out.println("i5 : " + i5); // 97 이라는 숫자가 나타남
	   
	   
	   
   }
}
