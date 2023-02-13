const totalNumbers = function(numbers){
    let total = 0
        for (const number of numbers){
            total += number;

    }
    return total;
}

const myNumbers = [1, 2, 3, 4, 5];
console.log(totalNumbers(myNumbers));

// Declare a function that takes input of a number and an array and returns true if the array contains that number and false if it doesn't

const containsNumber = function(number, array){
    for (const num of array){
        if(num === number){
            return true;
        }
    }
    return false
}

// console.log(containsNumber(3, myNumbers))
// console.log(containsNumber(8, myNumbers))

// Define a function expression that takes two arguments:

// an object, for example, { name: 'Wojtek', age: 30 }
// a string, for example, 'name'

// Your function should return true if the given string is a key on the given object and false if the object does not have a key that matches the string. 

const myInfo = { 
    name: 'Wojtek', 
    age: 30 
}

const containsName = function(string, object){
    for (const name in object){
        if (string === name){
            return true;
        }
    }
    return false;
};

console.log(containsName('name', myInfo));