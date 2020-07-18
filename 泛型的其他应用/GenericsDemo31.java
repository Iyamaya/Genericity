class Info<T,V>{		// ����������������
	private T var ;
	private V value ;
	public Info(T var,V value){
		this.setVar(var) ;
		this.setValue(value) ;
	}
	public void setVar(T var){
		this.var = var ;
	}
	public void setValue(V value){
		this.value = value ;
	}
	public T getVar(){
		return this.var ;
	}
	public V getValue(){
		return this.value ;
	}
};
class Demo<S>{
	private S info ;
	public Demo(S info){
		this.setInfo(info) ;
	}
	public void setInfo(S info){
		this.info = info ;
	}
	public S getInfo(){
		return this.info ;
	}
};
public class GenericsDemo31{
	public static void main(String args[]){
		Demo<Info<String,Integer>> d = null ;		// ��Info��ΪDemo�ķ�������
		Info<String,Integer> i = null ;	// Infoָ��������������
		i = new Info<String,Integer>("���˻�",30) ;	 // ʵ����Info����
		d = new Demo<Info<String,Integer>>(i) ;	// ��Demo��������Info��Ķ���
		System.out.println("����һ��" + d.getInfo().getVar()) ;
		System.out.println("���ݶ���" + d.getInfo().getValue()) ;
	}
};