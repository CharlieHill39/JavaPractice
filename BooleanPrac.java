package less05_operator;

public class MyBool {
	
	public static void main(String[] args) {
		
		//定义两个布尔值
		boolean  a, b;
		a = true;
		b = false;
		
		System.out.println(a && b);
		
		System.out.println(a || b);
		
		System.out.println(!a);		
		
		
		int ia=10, ib=23;
		
		System.out.println( ia < ib);
		
		System.out.println( ia < ib && ia < 1 && ib > 100 );
	}

}
