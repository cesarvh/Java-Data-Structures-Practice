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
		self.size += 1

	def getSize(self):
		return self.size

	def isEmpty(self):
		return self.size == 0

	def printDeque(self):
		if (self.size == 0): return
		temp = self.sentinel.next
		i = 0
		while (i < self.getSize()):
			print temp.data
			temp = temp.next
			i += 1




class Node(object):
		"""docstring for Node"""
		def __init__(self, prev, nxt, data):
			self.nxt = nxt
			self.prev = prev
			self.data = data




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

# }
