public class LinkedList<Item>{
	Node head;
	int size;
	public LinkedList() {
		head = new Node(null, null);
		size = 0;
	}

	public class Node()<Item> {
		Item contents;
		Node next;

		public Node(contents, Node next) {
			this.contents = contents;
			this.next = next;

		}
	}

	public void add(Item element) {
		if (size == 0) {
			head.contents = element;
		} else {
			Node newNode = new Node(contents, null);
			
		}
		Node newNode = new Node(contents, null);
		Node pointer = head;

	}

	public void add(int index, Item element){}
	
	public void addFirst(Item element) {}

	public void addLast(Item element) {}

	public void clear()

	public LinkedList<Item> clone() {}

	public Item getFirst() {}

	public Item getLast() {}

	public Item get(int index) {}

	/* Gets the first item of the list*/
	public Item peek() {}

	/* Gets the last item of the list*/
	public Item peekLast() {}

	/* Retrieves and removes the first element of the list*/
	public Item poll() {}

	/* Retrieves and removes the last element of the list*/
	public Item pollLast() {}

	public int size() {}

	public boolean isEmpty() {}


}