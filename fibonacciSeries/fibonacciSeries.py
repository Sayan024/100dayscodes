num = int(input("Enter the Nth number upto which series you want to see"))
a=0
b=1
print(a," , ",b," , ",end="")
for i in range(2,num+1):
    nextTerm = a+b
    a=b
    b=nextTerm
    if i==num:
        print(nextTerm)
    else:
        print(nextTerm,end=" , ")
