public class GenericsDemo30{
	public static void main(String args[]){
		Integer i[] = fun1(1,2,3,4,5,6) ;	// ���ط�������
		fun2(i) ;
	}
	public static <T> T[] fun1(T...arg){	// ���տɱ����
		return arg ;			// ���ط�������
	}
	public static <T> void fun2(T param[]){	// ���
		System.out.print("���շ������飺") ;
		for(T t:param){
			System.out.print(t + "��") ;
		}
	}
};