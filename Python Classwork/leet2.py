class Solution(object):
    def isMatch(self, s, p):
       if len(s)==len(p):
        s=list(s)
        p=list(p)
        for i in range(len(p)):
            if(p[i]=="."):
                p[i]=s[i]
            if(p[i]=="*"):
                h=p.copy()
                h.remove(p[i])
                for j in range(len(h)):
                    if(h[j]==s[i]):
                        h=h[j]
                p[i]=h
                    
        if(p==s):
            return True
        elif(len(p)!=len(s)):
            return False

obj=Solution()
print(obj.isMatch("aa","a"))