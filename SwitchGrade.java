import java.util.Scanner;

public class SwitchGrade{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��ѧ���ɼ��������ж�����");
		int score = input.nextInt();
		switch(score/10){
		case 0:
			System.out.println("һ�����ر��Ե��!");
			break;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("������Ŷ!");
			break;
		case 6:
			System.out.println("�������꣡");
			break;
		case 7:
			System.out.println("�е�");
			break;
		case 8:
			System.out.println("��ͦ��Ŷ");
			break;
		case 9:
			System.out.println("���㣬�����ý�ѧ���ˣ�");
			break;
		case 10:
			if(score==100){
				System.out.println("ѧ�Ա��ԣ�");
				break;
			}
		default:
			System.out.println("û�������~");
			break;
		}
	}
}