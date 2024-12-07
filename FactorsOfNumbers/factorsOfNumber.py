import math
def simplefactor():
    n=int(input("Enter a number :"))
    for i in range(1,n+1):
        if(n%i==0):
            print(i,end=" ")
def sqrtfactor():
    n=int(input("Enter a number :"))
    for i in range(1,int(math.sqrt(n))+1):
        if(n%i==0):
            if(i==n//i):
                print(i,end=" ")
            else:
                print(i,end=" ")
                print(n//i,end=" ")
                
c = input("1. Simple \n2. Complex :")
match c:
    case "1":
        simplefactor()
    case "2":
        sqrtfactor()
        
