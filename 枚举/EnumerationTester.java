//һ�����Ĺ�������: 1��1��2��3��5��8��13��21��34���� ���30λ���Ƕ��٣� �õݹ��㷨ʵ��

public class EnumerationTester {  
    public static void main (String []args) {
	    System.out.println("��30λ����:" + Test(40));
		
		String str = "���ABC";
		
		System.out.println("str.size = :" + str.length());
		
		System.out.println("str.byte.size = :" + str.getBytes().length);
		
		int a = 20;
		float b = 20.56f;
		String d = "abcdef";
		
		System.out.printf("int %d" + "double :%f" + "string :%s", a, b, d);
		
		StringBuffer buffer = new StringBuffer("����StringBuffer");
		
		for(int i = 0; i < 100; i++) {
			buffer.append("����");
		}
		buffer.append("���");
		buffer.append("����");
		buffer.append("����");
		
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