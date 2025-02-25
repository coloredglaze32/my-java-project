import math

class Solution:
    def smallestDivisor(self, nums: list[int], threshold: int) -> int:
        l,r = 1,sum(nums)
        def getNum(div:int)->int:
            ans = 0
            for num in nums:
                ans += math.ceil(num / div)
            return ans
        while l <= r:
            mid = (l + r) // 2
            num = getNum(mid)
            if num <= threshold:
                r = mid - 1
            else :
                l = mid + 1
        print(mid)
        
Solution().smallestDivisor([2,3,5,7,11],11)