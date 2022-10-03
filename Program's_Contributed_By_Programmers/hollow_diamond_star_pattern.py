n = int(input('Enter n:'))

def upper():
    global n;
    for i in range(n-1):
        print("* "*(n-i),"  "*i,sep="",end="")
        print("  "*i,"* "*(n-i),sep="")
        
def lower():
    global n
    for i in range(n):
        print("* "*(i+1),"  "*(n-i-1),sep="",end="")
        print("  "*(n-i-1),"* "*(i+1),sep="")

upper()
lower()
