public class ReverseArray{
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6};
		for(int i=0;i<a.length/2;i++){//����������Ԫ�ظ�������������ż�������ȳ��Զ�������
			a[i]=a[a.length-1-i]^a[i];
			a[a.length-1-i]=a[i]^a[a.length-1-i];
			a[i]=a[i]^a[a.length-1-i];	
		}
		/*
		int[] b = new int[6];
		for(int i=0;i<a.length;i++){
			b[i]=a[i];
		}
		for(int i=0;i<b.length;i++){
			a[i]=b[b.length-1-i];
		}
		*/
		for(int i:a){
			System.out.println(i);
		}
	}
}