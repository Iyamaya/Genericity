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
public class GenericsDemo18{
	public static void main(String args[]){
		Info<String> i1 = new Info<String>() ;		// ����String�ķ��Ͷ���
		i1.setVar("hello") ;
		fun(i1) ;
	}
	public static void fun(Info<? extends Number> temp){	// ֻ�ܽ���Number����Number������
		System.out.print(temp + "��") ;
	}
};