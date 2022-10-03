def printNos(initial, last):
    if(initial<=last):
        print(initial)
        printNos(initial+1,last)
printNos(1,10)
printNos(1,100)
