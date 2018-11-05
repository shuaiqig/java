package exercise2;

public class Cat extends Animal implements Pet {
	
	private String Name;
	
	public Cat(String name) {		
		/*
		 * 使用super调用父类方法
		 */
		super(4);
		Name = name;
	}
	
	public Cat() {	
		/*
		 * 使用this关键字,并传递一个空字符串（""）作为参数
		 */
		this("");
	}
	
	public void eat() {
		System.out.println("Cat eat");
	}
	
	public String getName() {
		return this.Name;
	}
	
	public void setName(String name) {
		this.Name = name;
	}
	
	public void play() {
		System.out.println("Cat play");
	}
}	

