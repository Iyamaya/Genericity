interface Info<T>{		// �ڽӿ��϶��巺��
	public T getVar() ;	// ������󷽷������󷽷��ķ���ֵ���Ƿ�������
}
class InfoImpl<T> implements Info<T>{	// ���巺�ͽӿڵ�����
	private T var ;				// ��������
	public InfoImpl(T var){		// ͨ�����췽��������������
		this.setVar(var) ;	
	}
	public void setVar(T var){
		this.var = var ;
	}
	public T getVar(){
		return this.var ;
	}
};
public class GenericsDemo24{
	public static void main(String arsg[]){
		Info<String> i = null;		// �����ӿڶ���
		i = new InfoImpl<String>("���˻�") ;	// ͨ������ʵ��������
		System.out.println("���ݣ�" + i.getVar()) ;
	}
};