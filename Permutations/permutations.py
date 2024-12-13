n=int(input("Enter number of seats "))
r=int(input("Enter number of people "))
f1=1
f2=1
for i in range(2,n+1):
    f1*=i

num=n-r
for i in range(2,num+1):
    f2*=i
nper=f1//f2
print("Number of ways: ",nper)
