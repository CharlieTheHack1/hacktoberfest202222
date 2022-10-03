/**
 * destructor assignment are js expression that is resposible for unpacking the paked values into individual values .
 */

// destrucing array use [ variables ]

const myArray=[1,2,3,4,5,6];
/**
 *  suppose you want to use individual values of arrays either use indexes or destructure the array
 * 
 *     syntax :     const [ variable ]= <array name >
 */

const [a,b,c,d,e,f]=myArray;  
// now you can use the individual values 

console.log(a ,b,c );

// you want skip some values just leave some empty spaces

const [x, , ,y,z ]=myArray;
console.log( `x is ${x}  y is ${y}  z is ${z}  `);

// we can also set default values of individual variables in the case where we have more varibale than elements of arrays

const [p=1 , q=0 , r=9]=[5,6]   // here 'r ' is not undefined but defaultly 9 but p is 5 and q is 0
console.log(p,q,r);


/**
 *  we can use this concept for swapping two variables
 */

var num1=11 , num2=12 ;

[ num1 , num2]= [num2 , num1] ;  // this will swap the number

console.log(`num1 is ${num1} \nnum2 is ${num2}`);

/** we can use these assignment while returing the array from an function */

function arr( ){
    return [1,2,3] ;
}

const [first , sec , thrid ]=arr( );

console.log(first , sec , thrid);

/**
 *  Destructuring the Objects : objects can also be destructured but with original property names.
 */
const user={
    id:42 ,
    isVerified: true
};

const{ id , isVerified }=user;

console.log('id is ' , id , 'is verified', isVerified);

/**
 *   ( ) should be used if objects are not already defined
 */

(  { name , age } = { name :'kailash'   , age:21  } );

console.log(name);

//OR

const {firstName  , lastName }={
      firstName: 'kailash' ,
      lastName : 'mandal'
}
console.log(firstName, lastName);

/**
 *   we can also assign new names to property .
 */

const { l : foo  , q : bar } ={   l : 42 ,  q : 45   } ;
console.log(foo);
/**
 *  we can also give default values to property .
 */

const rectangle={
    height : 20,
    width : 20
}

const { height =10 , width=10}=rectangle; // but new value is assigned
console.log(`area is ${height*width}`);
