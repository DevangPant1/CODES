import numpy as np
def row_col(t):
    r=np.array(t)
    print(r)
    t=list(r.shape)
    row=t[0]
    col=t[1]
    max=r[0][0]
    for i in range(row):
        for j in range(col):
            if r[i][j]>max:
                max=r[i][j]
                row=i
                col=j
    return row,col

print(row_col([[100,2],[99,10]]))