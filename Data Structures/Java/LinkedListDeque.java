public class LinkedListDeque<Item>{
    /*
    * Linked list implementation of Deque
    * Add and remove operations must not involve 
    * looping/recursion. O(1)  
    * Get: Must use iteration
    * Size: Must be O(1)
    * 
    */
    int size;
    Node<Item> sentinel;


    public static class Node<Item> {
        Node prev;
        Node next;
        Item data;
        
        public Node(Node prev, Node next, Item data) {
            this.next = next;
            this.prev = prev;
            this.data = data;
        }

        public Item getData() {
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

    // public Item rGet(int index) {
    //     int c = 0;
    //     Node s = sentinel;
    //     get_Rec(s, c, index);
    //     return (Item) s.data;
    // }

    // public Item get_Rec(Node sentinel ,int counter, int index) {
    //     if (counter  == index) {return current;}
    //     else {
    //         return helper(current.next, counter + 1, index);
    //     }
    // }

    public void addFirst(Item item) {
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

    public void addLast(Item item) {
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

    public Node removeFirst() {
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
            return (Node) toRemove.data;

        }
    }

    public Node removeLast() {
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
            return  toRemove;
        }

    }

    // public Item recursiveGet(int index) {
    //     int c = 0;
    //     Node s = sentinel;
    //     callHelper(s, c, index);
    //     return s.data;
    // } 

    public Item getRecursive(int index) {
        Node toReturn = getHelper(index, 0, this.sentinel.next);
        return (Item) toReturn.data;
    }

    public Node getHelper(int index, int counter, Node pointer) {
        if (index > size) {return null;}
        if (index == counter) {return pointer;}
        else {
            pointer = pointer.next;
            getHelper(index, counter+1, pointer);
        }
        return pointer;

    }

    public Item get(int index) {
        if (index > size) {return null;}
        Node pointer = sentinel.next;
        int counter = 0;
        while (counter != index) {
            pointer = pointer.next;
            counter += 1;
        }
        return (Item) pointer.data;
    }

}
