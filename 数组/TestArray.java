
import java.util.Arrays;
import java.util.Date;
import java.util.regex.*;

public class TestArray {
	public static void main(String[] args) {
		double[] myList = {1.9, 1.8, 1.7, 1.6, 1.3, 1.5};
		
		int[] myIntArray = new int[100];
		
		Arrays.fill(myIntArray, 100);
		
		//��ӡ��������Ԫ��
		for(int i = 0; i < myList.length; i++) {
			System.out.println(myList[i] + "");
		}
		
		//foreach ѭ��
		for (double it : myIntArray) {
			System.out.println(it);
		}
		
		//��������Ԫ���ܺ�
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
		
		
		System.out.println("��ǰʱ��:" + new Date().toString());
		
		/*long firstTimeCounts = new Date().getTime();
		System.out.println("counts1 = " + firstTimeCounts);
		
		try {   
            Thread.currentThread().sleep(5000);//����   
        } catch(Exception e){
			
		} 
		
		long secoundTimeCounts = new Date().getTime();
		System.out.println("counts2 = " + secoundTimeCounts);
		
		System.out.println("ʱ���Ϊ:" + (secoundTimeCounts - firstTimeCounts));
		*/
		
		//������ʽ���
		String content = "192..168.156.23";
		
		String pattern = "^\\d+\\.\\d+\\.\\d+\\.\\d+";
		
		boolean isLawfulIP = Pattern.matches(pattern, content);
		
		System.out.println(content + ": �ǺϷ�IP��ַ ��" + isLawfulIP);
		
		//�ɱ�������
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