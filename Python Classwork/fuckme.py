class Solution:
    def isMatch(self, s, p):
        lst=list(s)
        p=list(p)
        if(len(lst)>len(p)):
            return False
        for i in range(len(p)):
            if(p[i]=='*'):
                if(i==0):
                    p[i]='0'
                elif(p[i-1]=='.'):
                    p[i]='.'
                else:
                    p[i]=p[i-1]
        print(p)