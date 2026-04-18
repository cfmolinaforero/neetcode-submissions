# Design a Dynamic Array (aka a resizable array) class, such as an ArrayList in Java or a vector in C++.
class DynamicArray:
    # Will initialize an empty array with a capacity of `capacity`, where capacity > 0
    def __init__(self, capacity: int):
        self.capacity = capacity
        self.length = 0
        self.arr = [0] * self.capacity

    # Will return the element at index i. Assume that index i is valid.
    def get(self, i: int) -> int:
        return self.arr[i]

    # Will set the element at index i to n. Assume that index i is valid
    def set(self, i: int, n: int) -> None:
        self.arr[i] = n

    # will push the element n to the end of the array
    def pushback(self, n: int) -> None:
        if self.capacity == self.length:
            self.resize()

        self.arr[self.length] = n
        self.length += 1
    
    # will pop and return the element at the end of the array. Assume that the array is non-empty
    def popback(self) -> int:
        if (self.length > 0):
            self.length -= 1
        
        return self.arr[self.length]

    

    # double the capacity of the array
    def resize(self) -> None:
        # new array of double capacity
        self.capacity = self.capacity * 2
        new_arr = [0] * self.capacity

        # copy over elements
        for i in range(self.length):
            new_arr[i] = self.arr[i]
        
        self.arr = new_arr


    # will return the number of elements in the array
    def getSize(self) -> int:
        return self.length

    # will return the capacity of the array
    def getCapacity(self) -> int:
        return self.capacity