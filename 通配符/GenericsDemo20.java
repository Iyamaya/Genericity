class Info<T extends Number>{	// 此处泛型只能是数字类型
	private T var ;		// 定义泛型变量
	public void setVar(T var){
		this.var = var ;
	}
	public T getVar(){
		return this.var ;
	}
	public String toString(){	// 直接打印
		return this.var.toString() ;
	}
};
public class GenericsDemo20{
	public static void main(String args[]){
		Info<String> i1 = new Info<String>() ;		// 声明Integer的泛型对象
	}
};