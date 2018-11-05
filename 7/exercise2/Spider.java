package exercise2;

public class Spider extends Animal {
	
	public Spider() {
		/*
		 * 使用super调用父类方法
		 */
		super(8);
	}
	
	public void eat() {
		System.out.println("Spider eat");
	}
}
