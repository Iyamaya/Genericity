class Point<T>{		// �˴��������д��ʶ���ţ�T��type�ļ��
	private T var ;	// var��������Tָ�����������ⲿָ��
	public Point(T var){		// ͨ�����췽����������
		this.var = var ;
	}
	public T getVar(){	// ����ֵ���������ⲿ����
		return var ;
	}
	public void setVar(T var){	// ���õ�����Ҳ���ⲿ����
		this.var = var ;
	}
};
public class GenericsDemo08{
	public static void main(String args[]){
		Point<String> p = new Point<String>("MLDN") ;	// �����var����ΪString����
		System.out.println("���ݣ�" + p.getVar()) ;
	}
};