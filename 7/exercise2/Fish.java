package exercise2;

public class Fish extends Animal {
	
	private String Name;
	
	public Fish(String name) {		
		/*
		 * 使用super调用父类方法
		 */
		super(0);
		Name = name;
	}
	
	public Fish() {	
		/*
		 * 使用this关键字,并传递一个空字符串（""）作为参数
		 */
		this("");
	}
	
	public void eat() {
		System.out.println("Fish eat");
	}
	
	public String getName() {
		return this.Name;
	}
	
	public void setName(String name) {
		this.Name = name;
	}
	
	public void play() {
		System.out.println("Fish play");
	}
}
