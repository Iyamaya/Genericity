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

public class GenericsDemo02{
	public static void main(String args[]){
		Point p = new Point() ;	// ����һ��Point�Ķ���
		p.setX(10.5f) ;		// �����Զ�װ�������float --> Float --> Object
		p.setY(20.6f) ;		// �����Զ�װ�������float --> Float --> Object
		float x = (Float)p.getX() ;	// ȡ�������ȱ�ΪInteger��֮���Զ�����
		float y = (Float)p.getY() ;	// ȡ�������ȱ�ΪInteger��֮���Զ�����
		System.out.println("С����ʾ��X����Ϊ��" + x) ;
		System.out.println("С����ʾ��Y����Ϊ��" + y) ;
	}
};