public class Continue{
	public static void main(String[]args){
		ok:for(int i=1;i<=5;i++){
			ko:for(int j=1;j<=5;j++){
				if(j==3){
					continue ok;//����Ǹ��������Ǹ���
				}
				System.out.println("�ǹ⵴������");
			}
		}
		/*
		int i=1;
		int j=1;
		for(;i<=5;i++){
			for(;j<=5;j++){
				if(j==3){
					continue;//û�б��ʱ���ؾͽ�ԭ��
				}
				System.out.println("�ǹ⵴������");
			}
		}
		System.out.println("i��ֵΪ"+i);
		System.out.println("j��ֵΪ"+j);
		*/
	}
}