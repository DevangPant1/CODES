
import numpy as np

sudoku=[
      [2,0,0,0,0,1,0,0,0], 
	    [0,0,0,0,5,0,8,0,9], 
	    [0,8,0,6,2,0,4,0,0], 
	    [0,0,5,3,0,0,0,0,8], 
	    [0,4,9,2,0,0,0,0,7], 
	    [0,0,0,0,0,0,3,0,0], 
	    [0,0,2,0,0,0,0,0,0], 
	    [0,0,0,9,4,0,0,0,0], 
	    [7,0,1,0,0,0,0,6,0]
        ]

def empty(grid):
    for row in range(9):
        for j in range(9):
            if grid[row][j]==0:
                return (row,j)

def valid(grid,num,pos):
    row=pos[0]
    col=pos[1]

    for i in range(9):
        if grid[row][i]==num:
            return False
    for j in range(9):
        if grid[j][col]==num:
            return False
    box_row=row//3
    box_col=col//3
    for i in range(box_row*3,box_row*3+3):
        for j in range(box_col*3,box_col*3+3):
            if grid[i][j]==num:
                return False
    return True

def solve(grid):
    pos=empty(grid)
    if pos==None:
        return True
    else:
        for i in range(1,10,1):
            if valid(grid,i,pos):
                grid[pos[0]][pos[1]]=i
                if solve(grid):
                    return grid
                grid[pos[0]][pos[1]]=0
        return False



ans=solve(sudoku)
print(np.matrix(ans))        

