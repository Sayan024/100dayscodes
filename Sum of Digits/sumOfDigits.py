n = int(input("Enter a number "))
def sum_of_digits(n):
    s=0
    while n!=0:
        s+=n%10
        n//=10
    return s
u=sum_of_digits(n)
print("Sum of digits is ",u)