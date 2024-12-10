n1=15
n2=25
lcm=0
if n1>n2:
    max=n1
else:
    max=n2
for i in range(max,(n1*n2)+1):
    if(i%n1==0 and i%n2==0):
        lcm=i
        break
print(i)