public class Meet{
	public static void main(String[]args){
		int distance=1000;
		int hour=0;
		while(distance>0){
			distance-=17;
			distance-=18;
			hour++;
			System.out.println(hour+"Сʱ���������"+distance+"ǧ��");
		}
		System.out.println("С��ͬѧ�͸����������"+hour+"Сʱ");
	}
}