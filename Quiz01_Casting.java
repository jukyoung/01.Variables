
public class Quiz01_Casting {
  public static void main(String[] args) {
	// ���� 1 : �־��� ���� ��� int ������ ��ȯ�ؼ� ��� ���� ���� rs�� ��� ���
	char a= '2';
	double b = 5.6;
	long c = 1250000L;
	int d = 10000;
	
	int rs;
	
	int i1 = a;
	int i2 = (int)b;
	int i3 = (int)c; //���� ������ int�� ǥ���� �� �ִ� ���� -> �� �ս� ���Ͼ
	rs = i1 + i2 + i3 + d; 
	
	rs = a + (int)b + (int)c + d; // ����� ���ÿ� ����ȯ �̷��� �ص� ��
	//rs = a + b + c + d -> ���� ū �ڷ����� ���� ���������� �ڵ������� ����ȯ �Ͼ
	rs = (int)(a + b + c + d); // �� ������ �����͸� ��Ʈ������ ���� ����ȯ ������
	
	System.out.println("a + b + c + d = " + rs);
	
	System.out.println("a : " + i1);
	System.out.println("b : " + i2);
	System.out.println("c : " + i3);
	
	
	
   }
}
