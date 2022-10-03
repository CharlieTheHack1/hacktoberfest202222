/**
 *  spread operator : used to spread the packed values into individual values.
 * 
 * rest operator : used to packed individual operator into packed array
 */
function sum( a , b,c){
    return a+b+c ;
 }
/**
 *  syntax  : suppose we have an array containing our values that we want to have in function as arguments use ( ...)  three dots
 *   called spread operator to unpacke these values into individual once.
 * 
 *    if arr=[ 2,4,6 ,8] then   ...arr is 2, 4,6,8 
 */

var arr=[2,4,6]
 console.log(   sum(...arr) ); // now a is 2 , b is 4 , c is 6 

 /**
  * Rest operator : packs all individual values into one array. 
  * 
  *  suppose you don't knopw how many arguments you gonna pass into function then use ( ...) rest operator to
  *  pack all values into one array and iterate over it to perform the tasks
  */

 function add(...args){
     console.log('args is an array :  ',args); // print the agrs 
     let sum=0;
     args.forEach( 
         // adding all values in args
         ( value) => sum += value
         )

         return sum ; // returning sum here 
 }

 console.log(  
     add(55,66,77,0,91,2)  // you can pass any number of arguments
 );

 /** 
  * you can also use rest operator while destructuring the arrays
  *  suppose you want to operate only two value and keep others in an array than just
  *  add ... operator before rest , now rest values are in array
  */

 const [x,y, ...rest]=[1,2,3,4,5,6,7,8,9];

 console.log(`x is ${x}   y is ${y}  rest is [${rest}]`);
