public class LinkedList<Item>{
	Node head;
	int size;

	public LinkedList() {
		head = new Node(null, null);
		size = 0;
	}

	public class Node<Item> {
		Item contents;
		Node next;

		public Node(Item contents, Node next) {
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

	public void clear() {}

	public LinkedList<Item> clone() {return null;}

	public Item getFirst() {return null;}

	public Item getLast() {return null;}

	public Item get(int index) {return null;}

	/* Gets the first item of the list*/
	public Item peek() {return null;}

	/* Gets the last item of the list*/
	public Item peekLast() {return null;}

	/* Retrieves and removes the first element of the list*/
	public Item poll() {return null;}

	/* Retrieves and removes the last element of the list*/
	public Item pollLast() {return null;}

	public int size() {return null;}

	public boolean isEmpty() {return null;}


}