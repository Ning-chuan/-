import java.util.Scanner;

public class SwitchLearnPlan{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("����һ����ѡһ�죬������������ѧϰ����");
		int day = input.nextInt();
		switch(day){
			case 1:
			case 3:
			case 5:
				System.out.println("ѧϰ���");
				break;
			case 2:
			case 4:
			case 6:
				System.out.println("ѧϰӢ��");
				break;
			case 7:
				System.out.println("��Ӣ��ѧϰ���");
				break;
			default:
				System.out.println("����һ�������𣬾���͵����");
				break;
		}
	}
}