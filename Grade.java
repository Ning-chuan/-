import java.util.Scanner;

public class Grade{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("��������һ�����������������ȼ�");
		int grade = input.nextInt();//���Զ�ȡ��������� 
		if(0<=grade && grade<60){
			System.out.println("������");
		}else if(60<=grade && grade<70){
			System.out.println("����");
		}else if(70<=grade && grade<80){
			System.out.println("��");
		}else if(80<=grade && grade<90){
			System.out.println("��");
		}else if(90<=grade && grade<100){
			System.out.println("����");
		}else if(grade==100){
			System.out.println("����");
		}else{
			System.out.println("�㲻�ʺ�ѧϰ�������ɣ�");
		}
		
	} 
}