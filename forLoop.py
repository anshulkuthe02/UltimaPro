'''  for i in range(0,10):
    print(i)  '''

# strings
'''
name = "Anthony Stark"
for i in name:
    print(i)   '''

#back to front
'''
for i in range(10,-1,-1):
    print(i)   '''

#break - breaks the loop on specified interval
'''
for i in range(10):
    if i == 5:
        break
    print(i)    '''

#continue - Skips the current iteration and moves onto the next one
'''
for i in range(0,10):
    if i%2==0:
        continue
    print(i) '''

#pass - null operation: does nothing, not effective. basically used to skip conditions of loop
'''for i in range(5):
    if i==3:
        pass
    print(i) '''

#nested for loop
'''
for i in range(0,5,1):
    for j in range(5,0,-1):
        print("*")
    print("")  '''

'''
sum = 0
#last = int(input("Enter last:"))
for i in range(int(input("Enter the last one:"))):
    sum += i
print(sum) '''

#while
it = 0; sum1 = 0
while it <= 100:
    sum1 += it
    it += 1
print("The sum is:",sum1)

#prime number check
for i in range(1,101):
    if i>1:
        for j in range(2,i):
            if i%j==0:
                 break
        else:
            print("The number is prime:", i)