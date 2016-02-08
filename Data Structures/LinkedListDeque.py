class LinkedListDeque(object):
	"""docstring for LinkedListDeque"""
	sentinel = None

	def __init__(self):
		self.sentinel = Node(None, None, -1)
		self.size = 0

	def get(self, index):
		if (index > self.getSize()):
			return None
		pointer = self.sentinel
		i = 0
		while (i < index):
			pointer = pointer.nxt
			i += 1
		return pointer.data

	def addFirst(self, item):
		if (self.getSize() == 0):
			newNode = Node(None, None, item)
			self.sentinel.prev = newNode
			self.sentinel.nxt = newNode
			newNode.nxt = newNode
			newNode.prev = newNode
		else:
			temp = self.sentinel.nxt
			newNode = Node(self.sentinel.prev, temp, item)
			self.sentinel.nxt = newNode
			temp.prev = self.sentinel.nxt
			self.sentinel.nxt = self.sentinel.nxt
		self.size += 1

	def addLast(self, item):
		if (self.getSize() == 0):
			newNode = Node(None, None, item)
			self.sentinel.prev = newNode;
			self.sentinel.nxt = newNode
			newNode.nxt = newNode;
			newNode.prev = newNode;
		else:
			temp =self.sentinel.prev
			newNode = Node(temp, self.sentinel.nxt, item)
			self.sentinel.prev = newNode
			temp.nxt = newNode
			self.sentinel.nxt.prev = newNode
		self.size += 1

	def getSize(self):
		return self.size

	def isEmpty(self):
		return self.size == 0

	def printDeque(self):
		if (self.getSize() == 0): return
		temp = self.sentinel.nxt
		i = 0
		while (i < self.getSize()):
			print temp.data
			temp = temp.nxt
			i += 1

	def printBackwards(self):
		if (self.getSize() == 0): return
		temp = self.sentinel.prev
		i = 0
		while (i < self.getSize()):
			print temp.data
			temp = temp.prev
			i += 1

	def removeFirst(self):
		if (self.getSize() == 0): return None
		else:	
			toRemove = self.sentinel.nxt	
			temp = self.sentinel.nxt.nxt		
			temp.prev = self.sentinel.prev
			toRemove.nxt = None
			toRemove.prev = None
			self.sentinel.nxt = temp
			self.sentinel.prev.prev = temp;
			self.size -= 1;
			return toRemove;

	def removeLast(self):
		if (self.getSize() == 0): return None
		else:
			toRemove = self.sentinel.prev
			temp = self.sentinel.prev.prev
			front = self.sentinel.nxt
			self.sentinel.prev = temp
			temp.nxt = front
			front.prev = temp
			toRemove.nxt = None
			toRemove.prev = None
			self.size -= 1
			return toRemove





class Node(object):
		"""docstring for Node"""
		def __init__(self, prev, nxt, data):
			self.nxt = nxt
			self.prev = prev
			self.data = data

