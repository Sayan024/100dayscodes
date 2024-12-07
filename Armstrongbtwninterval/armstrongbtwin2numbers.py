print("Enter range between you want to see all armStrong numbers")
l =int(input("Enter first number"))
h = int(input("Enter Second number"))
def getOrder(num):
    l=0
    while(num!=0):
        l+=1
        num//=10
    return l
for num in range(l,h+1):
    temp=num
    s=0
    len=getOrder(num)
    while(temp!=0):
        d=temp%10
        s+=d**len
        temp//=10
    if(num==s):
        print(s,end=" ")

        