n1=84
n2=144
hcf=1
for i in range(1,n1 or n2):
    if(n1%i==0 and n2%i==0):
        hcf=i
        
print("Hcf of ",n1," and ",n2," is ",hcf)