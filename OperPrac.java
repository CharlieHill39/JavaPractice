package less05_operator;

public class MyOper {
	/*
	 * ��ݼ��� 
	 * 	main + alt_? = main����
	 *  syso + alt_? = System.out.println
	 *  shift_enter = �Զ�����
	 */
	public static void main(String[] args) {
		System.out.println("���Ǹ��������");
		System.out.println("hahahhahaha");
		int a, b;
		a = 100;
		b = 10;
		
		System.out.println(a + b);
		System.out.println(a - b);
		
		//ע������������ͳ�ʼ��
		int c = 5, d = 3;
		System.out.println(c/d);
		
		int e = 7;
		System.out.println(e/d);
		//ע�Ϳ�ݼ���  ctr_?
		//0���ܱ�������
//		System.out.println(e/0);
		
		// ���c/d��õ�һ��׼ȷ������
		System.out.println(((double)c)/d);
		
		//���������Գ���0.0
		double f = 5.0;
		System.out.println(f / 0.0);//�õ�һ������ֵ
		
		
		// ȡ�������
		int a1 = 5, b1 = 3;
		System.out.println(a1 % b1);
		
		//�ɽ����֪�� ����ȡ���ǰ��ն��������
		int a2 = -5, b2 = 3;
		System.out.println(a2 % b2);
	}
	

}
