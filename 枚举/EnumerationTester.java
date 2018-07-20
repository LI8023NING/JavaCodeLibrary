//一列数的规则如下: 1、1、2、3、5、8、13、21、34…… 求第30位数是多少， 用递归算法实现

public class EnumerationTester {  
    public static void main (String []args) {
	    System.out.println("第30位数是:" + Test(40));
		
		String str = "你好ABC";
		
		System.out.println("str.size = :" + str.length());
		
		System.out.println("str.byte.size = :" + str.getBytes().length);
		
		int a = 20;
		float b = 20.56f;
		String d = "abcdef";
		
		System.out.printf("int %d" + "double :%f" + "string :%s", a, b, d);
		
		StringBuffer buffer = new StringBuffer("测试StringBuffer");
		
		for(int i = 0; i < 100; i++) {
			buffer.append("恩恩");
		}
		buffer.append("你好");
		buffer.append("李宁");
		buffer.append("哈哈");
		
		System.out.println(buffer);
		
		System.out.println(buffer.capacity());
	}

    public static int Test(int num) {
		if(num < 0)
			return 0;
		else if(num > 0 && num <= 2) 
			return 1;
		
		return Test(num - 1) + Test(num - 2);
	}	
}