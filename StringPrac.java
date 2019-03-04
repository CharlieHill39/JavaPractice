package less006;

public class StringPrac {
	public static void main(String[] args) {
		System.out.println("字符串连接符的练习");
		
		//两个字符串可以直接用连接符相连
		System.out.println("字符串1 " + "字符串2");
		
		System.out.println("刘大拿爱" + "王晓静");
		
		//字符串和数字的链接
		System.out.println("王晓静今年" + 23);
		
		//字符串和多个数字相连
		System.out.println("刘大拿今年" + 18 + 19);
		
		//多个数字在前和字符串相连
		System.out.println(18 + 19 + "岁的刘大拿还是很帅的嘛");
		
		System.out.println("" + 18 + 19 + "岁的刘大拿还是很帅的嘛");
		
		int b = -8;
		System.out.println(b >> 2);
		System.out.println(b >>> 2);
		
		b = 8;
		System.out.println(b << 33);
		
	}

}
