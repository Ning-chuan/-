public class ArraySeparate{
	public static void main(String[] args){
		//����һ������a{1,2,3,9,4,5},�������������ֵ��λ�ã��������ֳ�����{1,2,3}{4,5}
		//������ĳ�a{1,2,3,4,5,6,16,4,7,9,70,5}������
		int[] a = new int[]{1,2,3,4,5,6,16,4,7,9,70,5};
		int max =a[0];
		int index = 0;
		for(int i=1;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
				index=i;
			}
		}
		System.out.println("ԭ�������ֵ��������"+index);
		int[] x = new int[index];
		int[] y = new int[a.length-index-1];
		for(int i=0;i<x.length;i++){
			x[i]=a[i];
		}
		for(int i=0;i<y.length;i++){
			y[i]=a[index+1+i];
		}
		for(int v:x){
			System.out.println(v);
		}
		System.out.println("---------------");
		for(int v:y){
			System.out.println(v);
		}
	}
}