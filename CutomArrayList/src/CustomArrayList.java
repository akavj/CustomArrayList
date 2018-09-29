import java.util.ArrayList;

public class CustomArrayList<T> extends ArrayList<T> {

	private static final long serialVersionUID = 1L;
	ArrayList<T> array = new ArrayList<T>();
	int size;
	int index;

	public void set(T element) {
		array.add(element);
		this.size = array.size();
	}

	public void setAt(T element, int index) {
		array.add(index, element);
		this.size = array.size();
	}

	public void findAt(T index) {

		if ((int) index < this.size)
			System.out.println(array.get((int) index));
		else
			System.out.println("Array size is lesser than the index provided");
	}

	public void getAll() {
		array.forEach(System.out::println);
	}

	public int size() {

		return size;
	}

	public void removeAt(T index) {
		if ((int) index < this.size)
			array.remove((int) index);
		else
			System.out.println("Array size is lesser than the index provided");
	}

	public void removeAll() {

		while (array.size() > 0)
			array.remove(index);

	}

}
