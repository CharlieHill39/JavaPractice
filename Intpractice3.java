package less04_type;

public class MyChar {
	public static void main(String[] args)
	{
		System.out.println("Lessen 05 variable type:");
		
		char c = 'A';
		//print打印不自动换行
		System.out.print(c);
		
		int n = c + 2;
		System.out.println(n);
		
		//java是强类型检查语言，安全型语言，所以自动转换失败
		//char d = c + 5;
		//System.out.println(d);
		
		
		//转义字符
		//不能正常或者很难正常表示的，或者不可见的字符
		// 我想打印  -- 我跑百米的时间是12'12" 
		System.out.println("我跑百米的时间是12\'12\"");
		System.out.println("我写一首诗  \n 诗的名字是秋天 \n 秋天的风  \n秋天的雨\n 秋天发浪的我和你");
	
	
		System.out.println("下面是类型转换");
		byte b1 = 10;
		short s2 = 200;
		System.out.println("b1 = " + b1);
		System.out.println("s2 = " + s2);
		System.out.println("------------");
		
		s2 = b1;
		System.out.println("b1 = " + b1);
		System.out.println("s2 = " + s2);
		System.out.println("------------");
		
		//强转有可能会出错，或者精度损失
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
