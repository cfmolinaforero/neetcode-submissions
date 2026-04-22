class Node:
    def __init__(self, val=None, prev=None, next=None):
        self.val = val
        self.prev = prev
        self.next = next

# Dequeue double-ended queue
class Deque:
    # constructor
    def __init__(self, head=None):
        self.length = 0
        self.head = head
        self.tail = head

    def isEmpty(self) -> bool:
        if self.length == 0:
            return True
        return False

    def append(self, value: int) -> None:
        node = Node(value)
        if self.tail:
            self.tail.next = Node(value)
        self.head = node
        self.tail = node

    def appendleft(self, value: int) -> None:
        node = Node(value)
        if self.head:
            self.head.prev = node
            node.next = self.head
            self.head = node
        self.head = node
        self.tail = node

    def pop(self) -> int:
        if self.tail.prev and self.tail:
            tmp = self.tail
            self.tail.prev = None
            return tmp
        elif self.tail:
            tmp = self.tail
            self.tail = None
            self.head = None
            return tmp
        return -1 #empty

    def popleft(self) -> int:
        if self.head and self.head.next:
            tmp = self.head
            tmp.next.prev = None
            self.head = tmp.next
            return tmp
        elif self.head:
            tmp = self.head
            self.head = None
            self.tail = None
            return tmp
        return -1 #empty
