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
public class GenericsDemo15{
	public static void main(String args[]){
		Info<?> i = new Info<String>() ;		// ʹ��StringΪ��������
		i.setVar("MLDN") ;							// ��������
	}
};