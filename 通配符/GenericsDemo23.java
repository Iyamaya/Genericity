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
public class GenericsDemo23{
	public static void main(String args[]){
		Info<String> i1 = new Info<String>() ;		// ��������ΪString
		Info<Object> i2 = null ;
		i2 = i1 ;
	}
};