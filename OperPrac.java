package less05_operator;

public class MyOper {
	/*
	 * 快捷键： 
	 * 	main + alt_? = main函数
	 *  syso + alt_? = System.out.println
	 *  shift_enter = 自动换行
	 */
	public static void main(String[] args) {
		System.out.println("这是个输出案例");
		System.out.println("hahahhahaha");
		int a, b;
		a = 100;
		b = 10;
		
		System.out.println(a + b);
		System.out.println(a - b);
		
		//注意变量的声明和初始化
		int c = 5, d = 3;
		System.out.println(c/d);
		
		int e = 7;
		System.out.println(e/d);
		//注释快捷键：  ctr_?
		//0不能被整数除
//		System.out.println(e/0);
		
		// 如果c/d想得到一个准确的数字
		System.out.println(((double)c)/d);
		
		//浮点数可以除以0.0
		double f = 5.0;
		System.out.println(f / 0.0);//得到一个特殊值
		
		
		// 取余的例子
		int a1 = 5, b1 = 3;
		System.out.println(a1 % b1);
		
		//由结果可知， 负数取余是按照定义得来的
		int a2 = -5, b2 = 3;
		System.out.println(a2 % b2);
	}
	

}
