package less04_type;

public class MyChar {
	public static void main(String[] args)
	{
		System.out.println("Lessen 05 variable type:");
		
		char c = 'A';
		//print��ӡ���Զ�����
		System.out.print(c);
		
		int n = c + 2;
		System.out.println(n);
		
		//java��ǿ���ͼ�����ԣ���ȫ�����ԣ������Զ�ת��ʧ��
		//char d = c + 5;
		//System.out.println(d);
		
		
		//ת���ַ�
		//�����������ߺ���������ʾ�ģ����߲��ɼ����ַ�
		// �����ӡ  -- ���ܰ��׵�ʱ����12'12" 
		System.out.println("���ܰ��׵�ʱ����12\'12\"");
		System.out.println("��дһ��ʫ  \n ʫ������������ \n ����ķ�  \n�������\n ���췢�˵��Һ���");
	
	
		System.out.println("����������ת��");
		byte b1 = 10;
		short s2 = 200;
		System.out.println("b1 = " + b1);
		System.out.println("s2 = " + s2);
		System.out.println("------------");
		
		s2 = b1;
		System.out.println("b1 = " + b1);
		System.out.println("s2 = " + s2);
		System.out.println("------------");
		
		//ǿת�п��ܻ�������߾�����ʧ
		s2 = 128;
		b1 = (byte)s2;
		System.out.println("b1 = " + b1);
		System.out.println("s2 = " + s2);
		System.out.println("------------");
		
		double pi = 3.1415926535897932384;
		float f = (float) pi;
		System.out.print(f);
	}
}
