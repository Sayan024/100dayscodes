bi = int(input("Enter a Binary Number: "))
n=0
d=0
binary = bi
while(bi>0):
    t=bi%10
    d+=t*2**n
    bi//=10
    n+=1
print("Binary: ",binary," :-> Decimal: ",d)