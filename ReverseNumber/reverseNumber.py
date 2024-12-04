num=int(input("Enter Nummber"))
s=0
while num!=0:
    r=num%10
    s=s*10+r
    num//=10
print(s)