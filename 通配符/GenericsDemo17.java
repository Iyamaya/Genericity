class Info<T>{
	private T var ;		// ���巺�ͱ���
	public void setVar(T var){
		this.var = var ;
	}
	public T getVar(){
		return this.var ;
	}
	public String toString(){	// ֱ�Ӵ�ӡ
		return this.var.toString() ;
	}
};
public class GenericsDemo17{
	public static void main(String args[]){
		Info<Integer> i1 = new Info<Integer>() ;		// ����Integer�ķ��Ͷ���
		Info<Float> i2 = new Info<Float>() ;			// ����Float�ķ��Ͷ���
		i1.setVar(30) ;									// �����������Զ�װ��
		i2.setVar(30.1f) ;								// ����С�����Զ�װ��
		fun(i1) ;
		fun(i2) ;
	}
	public static void fun(Info<? extends Number> temp){	// ֻ�ܽ���Number����Number������
		System.out.print(temp + "��") ;
	}
};