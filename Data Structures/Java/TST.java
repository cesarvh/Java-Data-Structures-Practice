public class TST {
	size;


	public class TSTNode() {
		TSTNode right;
		TSTNode middle;
		TSTNode left;
		char c;
		double myWeight;
		double maxWeight;
		TSTNode parent;
		String fullWord;


		public TSTNode(TSTNode right, TSTNode left, TSTNode middle, TSTNode parent, 
			char c, double myWeight, double maxWeight, String word) {

			this.right = right;
			this.left = left;
			this.middle = middle;
			this.c = c;
			this.myWeight = myWeight;
			this.maxWeight = maxWeight;
			this.parent = parent;
			this.word = word;

		}
	}

	public TST() {
		this.root = new TSTNode(null, null, null, null, null, -1, -1, null);
		size = 0;
	}

    public int size() {
    	return this.size;
    }

    public boolean contains(String key) {
    }

    public double get(String key) {


    public double getMax(String key) {

    }

    public TSTNode get(TSTNode x, String key, int d) {
    }


    public TSTNode getRoot() {
    
    }

    public void put(String key, double myWeight) {
    	this.size += 1;
    
    }

    public TSTNode put(TSTNode x, String key, double myWeight, int d, TSTNode parental) {
    	this.size += 1;

    }

    public LinkedList<String> getList(int count) {

    }


    public Iterable<String> keysWithPrefix(String prefix) {

    }

    public HashSet<TSTNode> getChildren(TSTNode node) {

    }

    public void collect(TSTNode x, StringBuilder prefix, Queue<String> q) {
    
    }

    public Iterable<String> keys() {

    }

    public static void main(String[] args) { 
    }



}       
