class LinkedListDeque(object):
	"""docstring for LinkedListDeque"""
	sentinel = None

	def __init__(self):
		self.sentinel = Node(None, None, -1)
		self.size = 0

	def get(self, index):
		if (index > self.size):
			return None
		pointer = self.sentinel
		i = 0
		while (i < index):
			pointer = pinter.next
			i += 1
		return pointer.data
	
	def addFirst(self, item):
		if (self.size == 0):
			newNode = Node(None, None, item)
			self.sentinel.prev = newNode
			self.sentinel.next = newNode
			newNode.next = newNode
			newNode.prev = newNode
		else:
			temp = self.sentinel.next
			newNode = Node(self.sentinel.prev, temp, item)
			self.sentinel.next = newNode
			temp.prev = self.sentinel.next
			self.sentinel.next = self.sentinel.next
		self.size += 1

	def addLast(self, item):
		if (self.size == 0):
			newNode = Node(None, None, item)
			self.sentinel.prev = newNode;
			self.sentinel.next = newNode
			newNode.next = newNode;
			newNode.prev = newNode;
		else:
			temp =self.sentinel.prev
			newNode = Node(temp, self.sentinel.next, item)
			self.sentinel.prev = newNode
			temp.next = newNode
			self.sentinel.next.prev = newNode


class Node(object):
		"""docstring for Node"""
		def __init__(self, prev, nxt, data):
			self.nxt = nxt
			self.prev = prev
			self.data = data


#     public void addLast(Pokemon item) {
#         if (this.isEmpty()) {
#             Node newNode = new Node(None, None, item);
#             sentinel.prev = newNode;
#             sentinel.next = newNode;
#             newNode.next = newNode;
#             newNode.prev = newNode;
#         } else {
#             Node temp = sentinel.prev;
#             Node newNode = new Node(temp, sentinel.next,item);
#             sentinel.prev = newNode;
#             temp.next = newNode;
#             sentinel.next.prev = newNode;
#         }

#         this.size += 1;
#     }

#     public boolean isEmpty() {
#         return size == 0;
#     }
    
#     public int size() {
#         return this.size;
#     }

#     /* Prints out the Deque from Front to Back*/
#     public void printDeque() {
#         Node pointer = sentinel.next;
#         int counter = 0;
#         while (counter != this.size() - 1) {
#             System.out.print(pointer.data + ", ");
#             counter += 1;
#             pointer = pointer.next;
#         }
#         System.out.println(pointer.data + ".");

#     }

#     public Pokemon removeFirst() {
#         if (this.size() == 0){ return None;}
#         else {
#             Node toRemove = sentinel.next;
#             Node temp = sentinel.next.next;
#             temp.prev = sentinel.prev;
#             toRemove.next = None;
#             toRemove.prev = None;
#             sentinel.next = temp;
#             sentinel.prev.prev = temp;
#             size -= 1;
#             return (Pokemon) toRemove.data;

#         }
#     }

#     public Pokemon removeLast() {
#         if (this.size() == 0){ return None;}
#         else { 
#             Node toRemove = sentinel.prev;
#             Node temp = sentinel.prev.prev;
#             Node front = sentinel.next;
#             sentinel.prev = temp;
#             temp.next = front;
#             front.prev = temp;
#             toRemove.next = None;
#             toRemove.prev = None;
#             size -= 1;
#             return (Pokemon) toRemove.data;
#         }

#     }

#     public Pokemon recursiveGet(int index) {
#         int c = 0;
#         Node s = sentinel;
#         callHelper(s, c, index);
#         return s.data;
#     } 

#     public Pokemon helper(Node current, int counter, int index) {
#         if (counter  == index) {return current;}
#         else {
#             return helper(current.next, counter + 1, index);
#         }
#     }

#     public Pokemon get(int index) {
#         Node pointer = sentinel.next;
#         int counter = 0;
#         while (counter != index) {
#             pointer = pointer.next;
#             counter += 1;
#         }
#         return (Pokemon) pointer.data;
#     }

# }
