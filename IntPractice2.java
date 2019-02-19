package less04_type;

import java.util.Scanner;

/*
 * 
 * 关于自由落体运动的习题：
 * 公式： 0.5 * g * t^2
 *  g: 9.8
 *  t: 时间，我们先写10s
 * 
 */
public class Fallen {
	public static void main(String[] args)
	{
		//开始我们的表演
		
		/*
		 //时间是固定值
		double g = 9.8;
		int t = 10;
		
		double dis = g * t * t;
		
		System.out.println("所走的距离是： " + dis);
		
		*/
		
		
		//时间不是固定值
		double g = 9.8;
		int t = 10;
		
		Scanner sc = new Scanner(System.in);

		t = sc.nextInt();
		
		
		double dis = g * t * t;
		
		System.out.println("所走的距离是： " + dis);
	}
}
