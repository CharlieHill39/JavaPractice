package less04_type;

import java.util.Scanner;

/*
 * 
 * �������������˶���ϰ�⣺
 * ��ʽ�� 0.5 * g * t^2
 *  g: 9.8
 *  t: ʱ�䣬������д10s
 * 
 */
public class Fallen {
	public static void main(String[] args)
	{
		//��ʼ���ǵı���
		
		/*
		 //ʱ���ǹ̶�ֵ
		double g = 9.8;
		int t = 10;
		
		double dis = g * t * t;
		
		System.out.println("���ߵľ����ǣ� " + dis);
		
		*/
		
		
		//ʱ�䲻�ǹ̶�ֵ
		double g = 9.8;
		int t = 10;
		
		Scanner sc = new Scanner(System.in);

		t = sc.nextInt();
		
		
		double dis = g * t * t;
		
		System.out.println("���ߵľ����ǣ� " + dis);
	}
}
