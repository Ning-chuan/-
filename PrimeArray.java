public class PrimeArray{
	public static void main(String[] args){
		//��Ŀ��
		//˼·��������һ�������㹻�����飬�Ȱ��������ȥ���ٽص�0Ԫ��
		int[] array = new int[50];
		int index = 0;
		for(int num=2;num<100;num++){
			boolean a = false;
			for(int i=2;i<=num/2;i++){
				if(num%i==0){
					//System.out.println(num+"��������");
					a=true;
					break;
				}
			}
			if(!a){
				//System.out.println(num+"������");
				array[index++]=num;
				//index++;
			}
		}
		int[] primeArray = new int[index];
		for(int i=0;i<primeArray.length;i++){
			primeArray[i]=array[i];
		}
		array=null;//�ͷ��ڴ�
		for(int v:primeArray){
			System.out.println(v);
		}
		/*˼·һ���ҵ�1~100������������Ϊ���鳤�ȣ��ٴ���Ѱ���������μ���������
		int count = 0;
		for(int num=2;num<100;num++){
			boolean a = false;
			for(int i=2;i<=num/2;i++){
				if(num%i==0){
					//System.out.println(num+"��������");
					a=true;
					break;
				}
			}
			if(!a){
				//System.out.println(num+"������");
				count++;	
			}
		}
		int[] primeArray = new int[count];
		int index = 0;
		for(int num=2;num<100;num++){
			boolean a = false;
			for(int i=2;i<=num/2;i++){
				if(num%i==0){
					//System.out.println(num+"��������");
					a=true;
					break;
				}
			}
			if(!a){
				//System.out.println(num+"������");
				primeArray[index]=num;
				index++;
			}
		}
		for(int v:primeArray){
			System.out.println(v);
		}
		*/
	}
}