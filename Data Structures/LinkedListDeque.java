public class LinkedListDeque<Pokemon> {
    /*
    * Linked list implementation of Deque
    * Add and remove operations must not involve looping/recursion. O(1)  
    * Get: Must use iteration
    * Size: Must be O(1)
    * 
    */
    int size;
    Node<Pokemon> sentinel;


    public static class Node<Pokemon> {
        Node prev;
        Node next;
        Pokemon data;
        
        public Node(Node prev, Node next, Pokemon data) {
            this.next = next;
            this.prev = prev;
            this.data = data;
        }

        public Pokemon getData() {
            return this.data;
        }

        public Node getPrev() {
            return this.prev;
        }

        public Node getNext() {
            return this.next;
        }
 
    }

    /* Constructor for the LLD Class*/
    public LinkedListDeque() {
        this.size = 0;
        this.sentinel = new Node(null,null, -1);
    }

    public void addFirst(Pokemon item) {
        if (this.isEmpty()) {
            Node newNode = new Node(null, null, item);
            sentinel.prev = newNode;
            sentinel.next = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
        } else {
            Node temp = sentinel.next;
            Node newNode = new Node(sentinel.prev, temp, item);
            sentinel.next = newNode;
            temp.prev = sentinel.next;
            sentinel.prev.next = sentinel.next;

        }
        this.size += 1;
    }

    public void addLast(Pokemon item) {
        Node temp = sentinel.prev;
        Node front = sentinel.next;
        sentinel.prev = new Node(temp, front,item);
        this.size += 1;

    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    public int size() {
        return this.size;
    }

    public void printDeque() {
        // Node temp = sentinel;
        // while (i < lld1.size()) {
        //  temp = temp.next;
        //  System.out.println(temp.data);
        //  i += 1;
        // }

    }

    public Pokemon removeFirst() {
        if (this.size() == 0) return null ;
        this.size -= 1;
        return null;
    }

    public Pokemon removeLast() {
        
        this.size -= 1;
        return null;
    }

    public Pokemon get(int index) {
        return null;
    }

}
