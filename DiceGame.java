import java.util.Scanner;

public class DiceGame{
	public static void main(String[]args){
		double value = Math.random();//Math�����������һ�������ҷ�Χ��[0.0~1.0)
		//Math�൱����java�������ϣ�����import�Ϳ���ֱ����
		int number = (int)(value*6+1);//�ѷ�Χ�ĳ�һ����������
		Scanner input = new Scanner(System.in);
		System.out.println("�����С��������");
		String choose = input.nextLine();//��ȡ����
		System.out.println("����ҡ���ĵ�����:"+number);
		if((number<4 && choose.equals("С")) || (number>3 && choose.equals("��"))){
			System.out.println("��ϲ�����¶���");
		}else{
			System.out.println("��Ǹ�����Ĵ𰸲��ԣ��������衣");
		}
	}
}