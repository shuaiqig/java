package exercise2;

public class Fish extends Animal {
	
	private String Name;
	
	public Fish(String name) {		
		/*
		 * ʹ��super���ø��෽��
		 */
		super(0);
		Name = name;
	}
	
	public Fish() {	
		/*
		 * ʹ��this�ؼ���,������һ�����ַ�����""����Ϊ����
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
