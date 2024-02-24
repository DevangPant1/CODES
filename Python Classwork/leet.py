class Solution():
    def findMedianSortedArrays(self, nums1, nums2):
        m=len(nums1)
        n=len(nums2)
        merge=nums1
        for i in nums2:
            merge.append(i)
        asc=[]
        grt=merge[0]
        while(len(merge)!=0):
            grt=merge[0]
            for i in range(len(merge)):
                if merge[i]>grt:
                    grt=merge[i]
            merge.remove(grt)
            asc.append(grt) 
        length=len(asc)
        if length%2==0:
            m=int(length/2)
            a=asc[m-1]
            b=asc[m]
            median=(a+b)/2
        else:
            median=asc[((length+1)/2)-1]
        return median

obj=Solution()
print(obj.findMedianSortedArrays([1,2],[3,4]))