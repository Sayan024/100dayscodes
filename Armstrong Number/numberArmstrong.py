num = int(input("Enter a number "))
def order(a):
    len=0
    while(a!=0):
        len=len+1
        a//=10
    return len
len = order(num)
def Armstrong(num,len):
    temp=num
    s=0
    while(temp!=0):
        d=temp%10
        s=s+d**len
        temp//=10
    return num==s
if(Armstrong(num,len)):
    print("Armstrong")
else:
    print("Not a armstrong")