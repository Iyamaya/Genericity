class Point<T>{		// �˴��������д��ʶ���ţ�T��type�ļ��
	private T var ;	// var��������Tָ�����������ⲿָ��
	public T getVar(){	// ����ֵ���������ⲿ����
		return var ;
	}
	public void setVar(T var){	// ���õ�����Ҳ���ⲿ����
		this.var = var ;
	}
};
public class GenericsDemo07{
	public static void main(String args[]){
		Point<Integer> p = new Point<Integer>() ;	// �����var����ΪString����
		p.setVar("MLDN") ;		// �����ַ���
	}
};