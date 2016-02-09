public class BST<Item>{
	
	Leaf root;
	int size;

	public BST() {
		root = new Leaf();
		size = 0;
	}

	public BST(Item item) {
		root = new Leaf(null, null, item);
		size = 1;
	}

	public void insert(Item item){
		insertHelper(this.root, item);
	}

	public void insertHelper(Leaf pointer, Item item) {

	}

	public boolean contains(Item item) {
		return true;
	}

	public Leaf get(Item item) {
		return null;
	}

	public Leaf floor() {
		return null;
	}

	public Leaf ceiling() {
		return null;
	}

	public Object[] asArray() {
		Object[] arr = new Object[size];
		return arr;
	}

	public class Leaf<Item> {
		Leaf left;
		Leaf right;
		Item data;

		public Leaf() {
			this.right = null;
			this.left = null;
			this.data = null;
		}

		public Leaf(Leaf right, Leaf left, Item data) {
			this.right = right;
			this.left = left;
			this.data = data;
		}
		
	}

}