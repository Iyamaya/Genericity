class Point<T>{		// 此处可以随便写标识符号，T是type的简称
	private T var ;	// var的类型由T指定，即：由外部指定
	public T getVar(){	// 返回值的类型由外部决定
		return var ;
	}
	public void setVar(T var){	// 设置的类型也由外部决定
		this.var = var ;
	}
};
public class GenericsDemo07{
	public static void main(String args[]){
		Point<Integer> p = new Point<Integer>() ;	// 里面的var类型为String类型
		p.setVar("MLDN") ;		// 设置字符串
	}
};