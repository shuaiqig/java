package exercise2;

public class Cat extends Animal implements Pet {
	
	private String Name;
	
	public Cat(String name) {		
		/*
		 * ʹ��super���ø��෽��
		 */
		super(4);
		Name = name;
	}
	
	public Cat() {	
		/*
		 * ʹ��this�ؼ���,������һ�����ַ�����""����Ϊ����
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

