class Info<T extends Number>{	// ָ�����ޣ�ֻ������������
	private T var ;		// ���������ⲿ����
	public T getVar(){
		return this.var ;	
	}
	public void setVar(T var){
		this.var = var ;
	}
	public String toString(){		// ��дObject���е�toString()����
		return this.var.toString() ;	
	}
};
public class GenericsDemo27{
	public static void main(String args[]){
		Info<Integer> i = fun(30) ;
		System.out.println(i.getVar()) ;
	}
	public static <T extends Number> Info<T> fun(T param){
		Info<T> temp = new Info<T>() ;		// ���ݴ������������ʵ����Info
		temp.setVar(param) ;		// �����ݵ��������õ�Info�����var����֮��
		return temp ;	// ����ʵ��������
	}
};