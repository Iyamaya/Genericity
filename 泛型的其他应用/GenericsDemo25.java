interface Info<T>{		// �ڽӿ��϶��巺��
	public T getVar() ;	// ������󷽷������󷽷��ķ���ֵ���Ƿ�������
}
class InfoImpl implements Info<String>{	// ���巺�ͽӿڵ�����
	private String var ;				// ��������
	public InfoImpl(String var){		// ͨ�����췽��������������
		this.setVar(var) ;	
	}
	public void setVar(String var){
		this.var = var ;
	}
	public String getVar(){
		return this.var ;
	}
};
public class GenericsDemo25{
	public static void main(String arsg[]){
		Info i = null;		// �����ӿڶ���
		i = new InfoImpl("���˻�") ;	// ͨ������ʵ��������
		System.out.println("���ݣ�" + i.getVar()) ;
	}
};