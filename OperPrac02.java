package less006;

public class OperPrac02 {
	public static void main(String[] args) {
		System.out.println("关于操作符的练习");
		
		int a =12, b = 32;
		
		int d;
		
		d = a<b ? a:b;
		
		System.out.println("比较小的数字是： " + d);
		
		int c = 10;
		c ++; // 相当于 c = c + 1;
		System.out.println("自增之后的值是：" + c);
		
		c --; //相当于 c = c -1;
		System.out.println("自减之后的值是：" + c);
		
		int e;
		c = 10;
		
		e = c ++; //两个赋值的先后顺序是： e=c; c = c+1;
		
		System.out.println("c自增后的值是： " + c);
		System.out.println("c赋值给e的值是：" + e);
		
		
		
	}

}
