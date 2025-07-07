class Solution(object):
    def transpose(self, matrix):
        result=[]
        for i in  range(len(matrix[0])):
            new_row=[]
            for row in matrix:
                new_row.append(row[i])
            result.append(new_row)
        return result