/** new :  keyword lets the developer create an instance of user defined object type.
 * 
 *  syntax : new constructor(arguments)
 * 
 */

function car(make , model , year){
    this.make=make;
    this.model=model;
    this.year=year;
}
// this is the new way of defining the object called constructor function
const myCar=new car("eagle", "tesla" ,2010)
/** here 
 *   constructor is car since it specifies the type of object
 *   and arguments are : eagle , tesla , 2010
 */
console.log(myCar);

/**
 * new keyword creates the new plain object and add property to newly created object thats like to consturctor prototype .
 */

// we can add shared property to previously created objects aswell by using prototype keyword

car.prototype.price="100k dollar" // new propery is added to car object

// now all instances of car will have price property

console.log(myCar.price);
// default value is set

// we can change it also
myCar.price="120k dollar";
console.log(myCar.price);

newCar=new car("sharp" , "frarari" , 2000 );
console.log(newCar);
// and this newCar will have price default
console.log(newCar.price);
