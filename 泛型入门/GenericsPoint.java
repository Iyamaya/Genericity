class Point<T>{
	private T x ;		// ��ʾX����
	private T y ;		// ��ʾY����
	public void setX(T x){
		this.x = x ;
	}
	public void setY(T y){
		this.y = y ;
	}
	public T getX(){
		return this.x ;
	}
	public T getY(){
		return this.y ;
	}
};

public class GenericsPoint{
	public static void main(String args[]){
		Point<Integer> p = new Point<Integer>() ;
		p.setX(10) ;		// �����Զ�װ�������int --> Integer
		p.setY("��γ210��") ;		// �����Զ�װ�������int --> Integer
		int x = p.getX() ;	// �Զ�����
		int y = p.getY() ;	// �Զ�����
		System.out.println("������ʾ��X����Ϊ��" + x) ;
		System.out.println("������ʾ��Y����Ϊ��" + y) ;
	}
};