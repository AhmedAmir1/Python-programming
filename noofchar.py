

file = open('abc.txt','r')
count = 0
for l in file:
    for c in l:
        code = ord(c)
        if code>=65 and code<=90 or code>=97 and code<=122:
            count+=1
print(count)
