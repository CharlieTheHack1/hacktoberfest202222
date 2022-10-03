#Program To Print Your PC/Laptop/Smartphone Hostname and IP Address of Hostname Given in Input

import socket
host = input("Enter Hostname To Get Its Ip : ")
#This Will Print Your Input IP
print(socket.gethostbyname(host))
#This Will Print Your System Name
print(socket.gethostname())
