package less006;

public class OperPrac02 {
	public static void main(String[] args) {
		System.out.println("���ڲ���������ϰ");
		
		int a =12, b = 32;
		
		int d;
		
		d = a<b ? a:b;
		
		System.out.println("�Ƚ�С�������ǣ� " + d);
		
		int c = 10;
		c ++; // �൱�� c = c + 1;
		System.out.println("����֮���ֵ�ǣ�" + c);
		
		c --; //�൱�� c = c -1;
		System.out.println("�Լ�֮���ֵ�ǣ�" + c);
		
		int e;
		c = 10;
		
		e = c ++; //������ֵ���Ⱥ�˳���ǣ� e=c; c = c+1;
		
		System.out.println("c�������ֵ�ǣ� " + c);
		System.out.println("c��ֵ��e��ֵ�ǣ�" + e);
		
		
		
	}

}
