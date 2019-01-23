package practice_Java;

public class check_interface implements practice_Interface {

	public check_interface() {
		System.out.println("I am the constructor");
		// int n = 90;

		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("I am the main ");
		check_interface c1 = new check_interface();
		c1.test02();
		c1.test04();

		practice_Interface p1 = new check_interface();
		p1.test05();
	}

	@Override
	public void test01() {
		// TODO Auto-generated method stub
		System.out.println("I am test01");
	}

	@Override
	public void test02() {
		// TODO Auto-generated method stub
		System.out.println("I am test02");
	}

	@Override
	public void test03() {
		// TODO Auto-generated method stub
		System.out.println("I am test03");
	}

	@Override
	public void test04() {
		// TODO Auto-generated method stub
		System.out.println("I am test04");
	}

	@Override
	public void test05() {
		// TODO Auto-generated method stub
		System.out.println("I am test05");
	}

}
