class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        if len(arr) == 0:
            return arr
        
        if len(arr) == 1:
            return [-1]

        arr2 = [None] * len(arr)
        arr2[len(arr) - 1] = -1
        maxElement = arr[len(arr) - 1]
        for i in range(len(arr)-2, -1, -1):
            arr2[i] = maxElement
            maxElement = max(arr[i], maxElement)

        return arr2