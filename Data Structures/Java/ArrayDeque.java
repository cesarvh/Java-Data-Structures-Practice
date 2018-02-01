public class ArrayDeque<T> {
	int size;
	T[] arr;
	int front;
	int back;
	int capacity;

	public ArrayDeque() {
		this.size = 0;
		this.capacity = 8;
	 	this.front = 0;
		this.back = 0;
		this.arr = (T[]) new Object[this.capacity];
	}

	public void addFirst(T item) {
		if (this.size == 0) {
			this.arr[this.front] = item;
			this.front = this.capacity - 1;
			this.back += 1;
			this.size += 1;
		} else if (this.size == capacity) {
			this.capacity = this.capacity * 2;
			T[] temp = (T[]) new Object[this.capacity];
			temp[0] = item;

			int tempFront = this.front;
			int j = this.front + 1;
			int i = 1;
			for (; i - 1 != this.size; i += 1) {
				temp[i] = this.arr[j];
				j += 1;
				if (j == this.arr.length) {
					j = 0;
				}
				
			}
			this.back = this.arr.length;
			this.arr = temp;
			this.front = 0;
			this.size += 1;
		} else {
			this.arr[this.front] = item;
			this.size += 1;
			this.front -= 1;
		}
	}

	public void addLast(T item) {}

	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public int size() {
		return this.size;
	}

	public void printDeque() {
		int j = this.front + 1;
		int i = 1;
		for (; i - 1 != this.size; i += 1) {
			System.out.println(this.arr[j]);
			j += 1;
			if (j == this.arr.length) {
				j = 0;
			}	
		}
	}

	public T removeFirst() {
		return null;
	}

	public T removeLast() {
		return null;
	}

	public T get(int index) {
		return null;
	}

	public T getRecursive(int index) {
		return null;
	}


	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		ad.addFirst(9);
		ad.addFirst(8);
		ad.addFirst(7);
		ad.addFirst(6);
		ad.addFirst(5);
		ad.addFirst(4);
		ad.addFirst(3);
		ad.addFirst(2);

		// [9 2 4 4 5 6 7 8]
		//   fb		

		// ad.addFirst(1);
		System.out.println("=====");
		System.out.println(ad.front); // 0 but should be 
		System.out.println(ad.back); // 1
		System.out.println("=====");
		ad.printDeque();

		
	}
}