public class RemoveElement{
	public static void main(String[] args){
		int[] a = {1,2,3,0,0,4,5,0,6,0,7,9,70,80,0,63,85,41,0,3,0,0,0,6};
		int num = 0;
		for(int i=0;i<a.length;i++){
			if(a[i]!=0){
				num++;
			}
		}
		System.out.println("ԭ�������Ԫ�صĸ���Ϊ"+num);//����û������
		int[] newArray = new int[num];
		int x = 0;
		for(int i=0;i<a.length;i++){
			if(a[i]!=0){
				newArray[x++]=a[i];
			}
		}
		System.out.println("������Ϊ��");
		for(int v:newArray){
			System.out.println(v);
		}
	}
}