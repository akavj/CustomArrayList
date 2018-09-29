public class Test {

	public static void main(String args[]) {

		CustomArrayList<Integer> car = new CustomArrayList<Integer>();

		car.set(0);
		car.set(1);
		car.set(3);

		car.setAt(2, 2);

		System.out.println("findAt");
		car.findAt(5);

		System.out.println("getAll");
		car.getAll();
		System.out.println("size" + car.size());
		System.out.println("removeAt");
		car.removeAt(5);
		car.getAll();
		System.out.println("removeAll");
		car.removeAll();
		car.getAll();
	}

}
