class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        ans = []
        counter = 1
        vec = [False] * (len(nums) + 1)
        sortedNums = set(nums)
        for val in sortedNums:
            vec[val] = True
        for i in range(1, len(vec)):
            if not vec[i]:
                ans.append(i)
        return ans