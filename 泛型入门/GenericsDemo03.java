class Point{
	private Object x ;		// ��ʾX����
	private Object y ;		// ��ʾY����
	public void setX(Object x){
		this.x = x ;
	}
	public void setY(Object y){
		this.y = y ;
	}
	public Object getX(){
		return this.x ;
	}
	public Object getY(){
		return this.y ;
	}
};

public class GenericsDemo03{
	public static void main(String args[]){
		Point p = new Point() ;	// ����һ��Point�Ķ���
		p.setX("����180��") ;		// String --> Object
		p.setY("��γ210��") ;		// String --> Object
		String x = (String)p.getX() ;	// ȡ�������ȱ�ΪInteger��֮���Զ�����
		String y = (String)p.getY() ;	// ȡ�������ȱ�ΪInteger��֮���Զ�����
		System.out.println("�ַ�����ʾ��X����Ϊ��" + x) ;
		System.out.println("�ַ�����ʾ��Y����Ϊ��" + y) ;
	}
};