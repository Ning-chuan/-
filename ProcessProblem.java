public class ProcessProblem{
	public static void main(String[]args){
		for(int x=20;x<200;x++){
			if((x-10)+(x+20)+(2*x)+(x/2)==370){
				System.out.println("�׼ӹ����������"+(x-10));
				System.out.println("�Ҽӹ����������"+(x+10));
				System.out.println("���ӹ����������"+(x/2));
				System.out.println("���ӹ����������"+(2*x));
			}
		}
	}
}