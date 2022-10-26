n = int(input('Enter n:'))
from colorama import Fore, Style

l = [Fore.BLUE, Fore.GREEN, Fore.RED, Fore.WHITE, Fore.MAGENTA, Fore.YELLOW]

def upper():
    global n;
    c = 0
    for i in range(n-1):
        print(l[c],"* "*(n-i),"  "*i,sep="",end="")
        print("  "*i,"* "*(n-i),Style.RESET_ALL,sep="")
        c=[0,c+1][(c!=5)]
        
def lower():
    global n
    c = 0
    for i in range(n):
        print(l[c],"* "*(i+1),"  "*(n-i-1),sep="",end="")
        print("  "*(n-i-1),"* "*(i+1),Style.RESET_ALL,sep="")
        c=[0,c+1][(c!=5)]

upper()
lower()
