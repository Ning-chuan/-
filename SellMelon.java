public class SellMelon{
	public static void main(String[]args){
		int sum = 1020;
		int day = 0;
		while(sum>0){
			sum=sum/2-2;
			day++;
			System.out.println(day+"���ʣ"+sum+"����");
		}
		System.out.println("����������������"+day+"��");
	}
}