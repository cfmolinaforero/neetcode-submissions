class DynamicArray:
    
    def __init__(self, capacity: int):
        self.capacity = capacity
        self.length = 0
        self.arr = [0] * self.capacity

    def get(self, i: int) -> int:
        if i < self.capacity:
            return self.arr[i]

    def set(self, i: int, n: int) -> None:
        self.arr[i] = n

    def pushback(self, n: int) -> None:
        if (self.capacity < self.length):
            self.arr[self.length]
            self.length += 1

    def popback(self) -> int:
        temp = self.arr[self.length-1]
        self.arr[self.length-1] = 0
        self.length -= 1
        return temp

    def resize(self) -> None:
        self.arr = self.arr + [0] * self.capacity
        self.capacity *= 2

    def getSize(self) -> int:
        return self.length
    
    def getCapacity(self) -> int:
        return self.capacity