public class PrimeNumber{
	public static void main(String[]args){
		/*for(int num =2;num<=99;num++){
			int i =2;
			for(;i<=7;i++){
				if(num%i==0 && num!=i){
					System.out.println(num+"��������");
					break;//����������ʱ�ж�ѭ���������ж�if
				}
			}
			if(i==8){
				System.out.println(num+"������");
			}
		}*/
		for(int num =2;num<=99;num++){
			boolean x = false;
			for(int i =2;i<=num/2;i++){
				if(num%i==0){
					System.out.println(num+"��������");
					x=true;
					break;//����������ʱ�ж�ѭ���������ж�if
				}
			}
			if(!x){//!x<==>x==false
				System.out.println(num+"������");
			}
		}
	}
}