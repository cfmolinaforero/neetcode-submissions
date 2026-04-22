class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        arr2 = [None] * len(arr)
        maxElement = -1
        for i in range(len(arr)-1, -1, -1):
            arr2[i] = maxElement
            maxElement = max(arr[i], maxElement)

        return arr2