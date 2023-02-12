class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        a = 0
        b = 0
        c = 0
        
        for num in nums:
            if num == 0:
                a+=1
            elif num == 1:
                b+=1
            else:
                c+=1
      
        cnt = 0
        while(a>0):
            nums[cnt] = 0
            a-=1
            cnt+=1
        
        while(b>0):
            nums[cnt] = 1
            b-=1
            cnt+=1
        
        while(c>0):
            nums[cnt] = 2
            c-=1
            cnt+=1