n = int(input("Enter a number"))
tem = n
rev=0
while tem!=0:
    r=tem%10
    rev=rev*10+r
    tem//=10
if n==rev:
    print("Palindrome")
else:
    print("Not palidrome")