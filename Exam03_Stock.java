
public class Exam03_Stock {
   public static void main(String[] args) {
	 System.out.println("========== �ֽ� ���� ==========");
	 System.out.println("1. �Ｚ���� (1��: " + 50000 + ")" );
	 System.out.println("2. �׽��� (1��: " + 50000 + ")");
	 System.out.println("3. īī�� (1��: " + 30000 + ")");
	 System.out.println("�ܰ� : " + 200000 + "��" );
	 System.out.println("============================");
	   
	 System.out.println("�Ｚ���� 1�� �ż�");
	 System.out.println("�ܰ� : " + (200000 - 50000) + "��");
	 //���ڿ����� ���� ���°��� x ��: ("�ܰ� : " + 200 - 40 + "��")
	 //���� ���� �ϴ°� : �Ұ���
	 
	 System.out.println("�׽��� 2�� �ż�");
	 System.out.println("�ܰ� : " + (200000 - 50000 - 100000) + "��");
	 
	 System.out.println("īī�� 1�� �ż�");
	 System.out.println("�ܰ� : " + (200000 - 50000 -100000 - 30000) + "��");
	 
	 System.out.println("�׽��� 1�� �ŵ�");
	 System.out.println("�ܰ� : " + (200000-50000-100000-30000+50000) + "��");
	 // ������ ���������� ���� �� �ڵ� �ٲٴ°� ���� �ϴ°� "����" 
  
   //���� ����ؼ� �ѹ��غ���
	int hyndae = 40000;
	int dragon = 30000;
	 System.out.println("\n1. �����ڵ��� (1�� : " + hyndae + "��)");
	 System.out.println("2. ��Ʃ����巡�� (1��: " + dragon + "��)" );
	 System.out.println("�ܰ� : " + 250000 + "��");
	 
	 System.out.println("\n�����ڵ��� 1��, ��Ʃ����巡�� 1�� �ż�");
	 System.out.println("�ܰ� : " + (250000 - hyndae - dragon) + "��");
	 
	
   
   }
}
