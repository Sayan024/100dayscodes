d = int(input("Enter a number : "))
b=[]

while(d>0):
    r=d%2
    b.append(r)
    d//=2

j=b[::-1]
bi= "".join(map(str,j))
print(bi)