public class ChickenProblem{
	public static void main(String[]args){
		for(int num=1;num<50;num++){
			if(num*2+(50-num)*4==160){
				System.out.println("С��������Ϊ"+num);
				System.out.println("���ӵ�����Ϊ"+(50-num));
			}
		}
	}
}