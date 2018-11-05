package exercise2;

public class TestAnimals {
	
	public static void main(String[] args) {
		Fish d = new Fish();
		Cat c = new Cat("Fluffy");
		Animal a = new Fish();
		Animal e = new Spider();
		Pet p = new Cat();
		
		a.eat();
		a.walk();
		
		c.eat();
		c.play();
		c.setName("Fluffy2");
		c.walk();
		
		d.eat();
		d.walk();
		
		e.eat();
		e.walk();
		
		Cat p1 = (Cat) p;
		p1.eat();
		p1.walk();
	}
}
