public class TestInterFace implements Animal {
	public void eat() {
		System.out.println("Test eat");
	}
	
	public void travel() {
		System.out.println("Test travel");
	}
	
	public static void main(String[] args) {
		TestInterFace t = new TestInterFace();
		t.eat();
		t.travel();
	}
}