# Question - What exactly is __init__ ?
# In Python, __init__ is a function or function Object() { [native code] }. When a new object/instance of a class is created, this function is automatically called to reserve memory. The __init__ method is available in all classes.

# Python program to explain __init__  
  
class Student:  
    def __init__(self, st_name, st_class, st_marks):  
        self.st_name = st_name  
        self.st_class = st_class  
        self.st_marks = 67  
S1 = Student("Itika", 10, 67)  
print(S1.st_name)  
print(S1.st_class) 
