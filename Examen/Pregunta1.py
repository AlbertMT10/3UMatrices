from ast import For
from multiprocessing.spawn import import_main_path
from traceback import format_tb


matriz1=[[1,2,12],[6,50,10],[2,5,3]]
matriz2=[[1,6,2],[2,8,5][4,10,3]]

print("MATRIZ 1 =")
for i in range(len(matriz1)):
    for j in range(len(matriz1[i])):
        print (matriz1[i][j],end="\t")
        print("")
        
print("MATRIZ 2 =")
for i in range(len(matriz2)):
    for j in range(len(matriz2[i])):
        print (matriz2[i][j],end="\t")
        print("")

print("RESULTADO = ")
for i in range(len(matriz1)):
    for j in range(len(matriz2[i])):
        resultado = matriz1[i][j] + matriz2[i][j]
        print(resultado, end="\t")
        print("")
        
import_main_path