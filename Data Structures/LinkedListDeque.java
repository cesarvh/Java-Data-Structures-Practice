public class LinkedListDeque<Pokemon> {
    /*
    * Linked list implementation of Deque
    * Add and remove operations must not involve 
    * looping/recursion. O(1)  
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
        if (this.isEmpty()) {
            Node newNode = new Node(null, null, item);
            sentinel.prev = newNode;
            sentinel.next = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
        } else {
            Node temp = sentinel.prev;
            Node newNode = new Node(temp, sentinel.next,item);
            sentinel.prev = newNode;
            temp.next = newNode;
            sentinel.next.prev = newNode;
        }

        this.size += 1;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    public int size() {
        return this.size;
    }

    /* Prints out the Deque from Front to Back*/
    public void printDeque() {
        Node pointer = sentinel.next;
        int counter = 0;
        while (counter != this.size() - 1) {
            System.out.print(pointer.data + ", ");
            counter += 1;
            pointer = pointer.next;
        }
        System.out.println(pointer.data + ".");

    }

    public Pokemon removeFirst() {
        if (this.size() == 0){ return null;}
        else {
            Node toRemove = sentinel.next;
            Node temp = sentinel.next.next;
            temp.prev = sentinel.prev;
            toRemove.next = null;
            toRemove.prev = null;
            sentinel.next = temp;
            sentinel.prev.prev = temp;
            size -= 1;
            return (Pokemon) toRemove.data;

        }
    }

    public Pokemon removeLast() {
        if (this.size() == 0){ return null;}
        else { 
            Node toRemove = sentinel.prev;
            Node temp = sentinel.prev.prev;
            Node front = sentinel.next;
            sentinel.prev = temp;
            temp.next = front;
            front.prev = temp;
            toRemove.next = null;
            toRemove.prev = null;
            size -= 1;
            return (Pokemon) toRemove.data;
        }

    }

    public Pokemon get(int index) {
        Node pointer = sentinel.next;
        int counter = 0;
        while (counter != index) {
            pointer = pointer.next;
            counter += 1;
        }
        return (Pokemon) pointer.data;
    }

}
