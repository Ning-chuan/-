import java.util.Scanner;

public class Season{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("��������һ���·ݣ��������жϼ���");
		int month = input.nextInt();//���Զ�ȡ��������� 
		if(month<1||month>12){
			System.out.println("you can really dance!");
		}else if(month>=3&&month<=5){
			System.out.println("Spring");
		}else if(month>=6&&month<=8){
			System.out.println("Summer");
		}else if(month>=9&&month<=11){
			System.out.println("Autumn");
		}else{
			System.out.println("Winter");
		}
		
	} 
}