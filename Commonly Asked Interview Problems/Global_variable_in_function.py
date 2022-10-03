# Question - In a function, how do you create a global variable ?
# We can create a global variable by designating it as global within every function that assigns to it; we can utilize it in other functions:
# Code -

global_var = 0  
def modify_global_var():  
    global global_var # Setting global_var as a global variable  
    global_var = 10  
def printing_global_var():  
    print(global_var) # There is no need to declare global variable  
modify_global_var()  
printing_global_var() # Prints 10  
