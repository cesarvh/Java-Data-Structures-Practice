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



