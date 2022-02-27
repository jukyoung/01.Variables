
public class Quiz01_Casting {
  public static void main(String[] args) {
	// 퀴즈 1 : 주어진 값을 모두 int 형으로 변환해서 모두 더한 값을 rs에 담아 출력
	char a= '2';
	double b = 5.6;
	long c = 1250000L;
	int d = 10000;
	
	int rs;
	
	int i1 = a;
	int i2 = (int)b;
	int i3 = (int)c; //값의 범위가 int가 표현할 수 있는 범위 -> 값 손실 안일어남
	rs = i1 + i2 + i3 + d; 
	
	rs = a + (int)b + (int)c + d; // 연산과 동시에 형변환 이렇게 해도 됨
	//rs = a + b + c + d -> 가장 큰 자료형에 맞춰 더블형으로 자동적으로 형변환 일어남
	rs = (int)(a + b + c + d); // 즉 더블형 데이터를 인트형으로 강제 형변환 시켜줌
	
	System.out.println("a + b + c + d = " + rs);
	
	System.out.println("a : " + i1);
	System.out.println("b : " + i2);
	System.out.println("c : " + i3);
	
	
	
   }
}
