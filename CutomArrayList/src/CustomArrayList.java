import java.util.ArrayList;

public class CustomArrayList<T> extends ArrayList<T> {

	private static final long serialVersionUID = 1L;
	ArrayList<T> array = new ArrayList<T>();
	ArrayList<T> arrayValue = new ArrayList<T>();
	ArrayList<T> arrayKey = new ArrayList<T>();
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

	public void findAt(int index) {

		if (index < this.size)
			System.out.println(array.get(index));
		else
			System.out.println("Array size is lesser than the index provided");
	}

	public void getAll() {
		array.forEach(System.out::println);
	}

	public int size() {

		return size;
	}

	public void removeAt(int index) {
		if (index < this.size)
			array.remove(index);
		else
			System.out.println("Array size is lesser than the index provided");
	}

	public void removeAll() {

		while (array.size() > 0)
			array.remove(index);

	}

	public void addKeyValue(T element1, T element2) {

		arrayKey.add(element1);
		arrayValue.add(element2);

	}

	public void getAllKeyValue() {

		for (int i = 0; i < (arrayKey.size()) && i < (arrayValue.size()); i++) {
			System.out.print(arrayKey.get(i));
			System.out.print("->");
			System.out.println(arrayValue.get(i));
		}
	}

	public void keyValueGet(int index) {

		System.out.print(arrayKey.get(index));
		System.out.print("->");
		System.out.println(arrayValue.get(index));

	}

	public void removeKey(T key) {
		int objKey = 0;
		for (int i = 0; i < arrayKey.size(); i++) {
			if (arrayKey.get(i).equals(key)) {
				objKey = i;

			}
		}
		arrayKey.remove(objKey);
		arrayValue.remove(objKey);

	}

	public void removeAllKeyValue() {
		int i = 0;
		while (i < arrayKey.size() && i < arrayValue.size()) {
			arrayKey.remove(i);
			arrayValue.remove(i);
		}

	}

	public void modifyValue(T key, T element) {
		int index = 0;
		for (int i = 0; i < (arrayKey.size()) && i < (arrayValue.size()); i++) {
			if (arrayKey.get(i).equals(key)) {
				index = i;

			}
		}
		arrayValue.set(index, element);
	}
}
