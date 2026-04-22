class Node:
    # def __init__(self, val):
    #     self.val = val
    #     self.next = None
    def __init__(self, val, next = None):
        self.val = val
        self.next = next

class LinkedList:
    def __init__(self):
        self.length = 0
        self.head = None

    def get(self, index: int) -> int:
        i = 0
        head = self.head
        while (head != None):
            if (i == index):
                return head.val
            i += 1
            head = head.next

        return -1
    
    def insertHead(self, val: int) -> None:
        newNode = Node(val)

        newNode.next = self.head
        self.head = newNode

    def insertTail(self, val: int) -> None:
        head = self.head
        if head == None:
            return

        while head.next != None:
            head = head.next

        head.next = Node(val)

    def remove(self, index: int) -> bool:
        head = self.head
        i = 0
        prev = None
        while head != None:
            # remove
            if i == index:
                if i == 0:
                    self.head = self.head.next
                    return True
            
                prev.next = head.next
                return True

            i += 1
            prev = head
            head = head.next

    def getValues(self) -> List[int]:
        head = self.head
        values = []
        while head != None:
            values.append(head.val)
            head = head.next

        return values