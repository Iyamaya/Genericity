class Notepad<K,V>{		// �˴�ָ����������������
	private K key ;		// �˱������������ⲿ����
	private V value ;	// �˱������������ⲿ����
	public K getKey(){
		return this.key ;
	}
	public V getValue(){
		return this.value ;
	}
	public void setKey(K key){
		this.key = key ;
	}
	public void setValue(V value){
		this.value = value ;
	}
};
public class GenericsDemo09{
	public static void main(String args[]){
		Notepad<String,Integer> t = null ;		// ���������������͵Ķ���
		t = new Notepad<String,Integer>() ;		// �����keyΪString��valueΪInteger
		t.setKey("���˻�") ;		// ���õ�һ������
		t.setValue(30) ;			// ���õڶ�������
		System.out.print("������" + t.getKey()) ;		// ȡ����Ϣ
		System.out.print("�����䣻" + t.getValue()) ;		// ȡ����Ϣ

	}
};