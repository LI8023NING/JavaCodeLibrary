
import java.util.Arrays;
import java.util.Date;
import java.util.regex.*;

public class TestArray {
	public static void main(String[] args) {
		double[] myList = {1.9, 1.8, 1.7, 1.6, 1.3, 1.5};
		
		int[] myIntArray = new int[100];
		
		Arrays.fill(myIntArray, 100);
		
		//打印所有数组元素
		for(int i = 0; i < myList.length; i++) {
			System.out.println(myList[i] + "");
		}
		
		//foreach 循环
		for (double it : myIntArray) {
			System.out.println(it);
		}
		
		//计算所有元素总和
		double total = 0;
	    for(int i = 0; i < myList.length; i++) {
			total += myList[i];
		}
		System.out.println("Total is " + total);
		
		double max = myList[0];
		for(int i = 1; i < myList.length; i++) {
			if(myList[i] > max)
				max = myList[i];
		}
		System.out.println("max num is " + max);
		
		
		System.out.println("当前时间:" + new Date().toString());
		
		/*long firstTimeCounts = new Date().getTime();
		System.out.println("counts1 = " + firstTimeCounts);
		
		try {   
            Thread.currentThread().sleep(5000);//毫秒   
        } catch(Exception e){
			
		} 
		
		long secoundTimeCounts = new Date().getTime();
		System.out.println("counts2 = " + secoundTimeCounts);
		
		System.out.println("时间差为:" + (secoundTimeCounts - firstTimeCounts));
		*/
		
		//正则表达式相关
		String content = "192..168.156.23";
		
		String pattern = "^\\d+\\.\\d+\\.\\d+\\.\\d+";
		
		boolean isLawfulIP = Pattern.matches(pattern, content);
		
		System.out.println(content + ": 是合法IP地址 ：" + isLawfulIP);
		
		//可变参数相关
		printMax("34", "3", "2", "5", "59.6");
	}
	
	public static void printMax(String... numbers) {
		if(0 == numbers.length) {
			System.out.println("No argument passed");
			return;
		}
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("value is " + numbers[i]);
		}
		
		//System.out.println("Max value is " + result);
	}
}