import java.util.Arrays;

public class MyIntArrayList {

	private int[] elements;
	private int size;

	public MyIntArrayList() {
		this(10);
	}

	public MyIntArrayList(MyIntArrayList c) {
		this(c.size);
		this.addAll(c);
	}

	public MyIntArrayList(int initialCapacity) {
		this.elements = new int[initialCapacity];
	}

	public boolean add(int e) {
		if (this.size == this.elements.length) {
			this.elements = Arrays.copyOf(this.elements, this.size * 2);
		}

		this.elements[size] = e;
		this.size++;

		return true;
	}

	public void add(int index, int element) {
		if (this.size == this.elements.length) {
			this.elements = Arrays.copyOf(this.elements, this.size * 2);
		}
		for (int m = elements.length - 1; m <= index; m--) {
			this.elements[m] = elements[m - 1];
		}
		this.elements[index] = element;
		this.size++;
	}

	public int size() {
		return this.size;
	}

	public boolean contains(int e) {
		for (int i = 0; i < elements.length; i++) {
			if (this.elements[i] == e) {
				return true;
			}
		}
		return false;
	}

	public int get(int index) {
		if (index >= 0 && index <= this.size) {
			return elements[index];
		}
		System.out.println("Throwing IndexOutOfBoundsException when trying to get element at position 0" + index);
		return -1;
	}

	public int indexOf(int e) {
		for (int i = 0; i < this.size; i++) {
			if (this.elements[i] == e) {
				return i;
			}
		}
		return -1;
	}

	public int lastIndexOf(int e) {
		for (int i = this.size - 1; i > 0; i--) {
			if (this.elements[i] == e) {
				return i;
			}
		}
		return -1;
	}

	public boolean remove(int e) {
		int indexOfRemovedElement = indexOf(e);
		if (indexOfRemovedElement == -1) {
			return false;
		}
		for (int i = indexOfRemovedElement; i < this.size; i++) {
			this.elements[i] = this.elements[i + 1];
		}
		this.size++;
		return true;
	}

	public int removeElementAtIndex(int index) {
		if (index < 0 || index >= this.size) {
			// should throw IndexOutOfBoundsException
			System.out.println(
					"Throwing IndexOutOfBoundsException when trying to" + " remove element at position " + index);
			return -1;
		}

		int removedElement = this.elements[index];
		for (int i = index; i < this.size - 1; i++) {
			this.elements[i] = this.elements[i + 1];
		}
		this.size--;
		return removedElement;
	}

	public void clear() {
		this.size = 0;
	}

	public int set(int index, int e) {
		if (index < 0 || index >= this.size) {
			// should throw IndexOutOfBoundsException
			System.out.println("Throwing IndexOutOfBoundsException when trying to set" + " the element " + e
					+ " at position " + index);
			return -1;
		}

		int replacedElement = this.elements[index];
		this.elements[index] = e;
		return replacedElement;
	}

	public boolean addAll(MyIntArrayList c) {
		if (c == null) {
			return false;
		}
		for (int i = 0; i < c.size; i++) {
			this.add(c.get(i));
		}
		return true;
	}

	public boolean addAll(int index, MyIntArrayList c) {
		if (c == null) {
			return false;
		}
		for (int i = 0; i < c.size; i++) {
			this.add(index, c.get(i));
		}
		return true;
	}

	public int[] toArray() {
		int[] array = new int[size];
		for (int i = 0; i < this.size; i++) {
			array[i] = get(i);
		}
		return array;
	}

	public void ensureCapacity(int minCapacity) {
		this.size = minCapacity;
	}

	public void trimToSize() {
		this.size = elements.length;
	}
}