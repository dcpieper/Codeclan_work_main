var name = 'Jill';

var secretsFunction = function (){
    var pinCode = [0, 0, 0, 0];
    console.log('Inside secrets function', name);
}

const filterNames = function(names, letter){
    const filteredNames = [];
    for (const name of names){
        if(name[0] === letter){
            filteredNames.push(name);
        }
    }
    return filteredNames
}

var students = ['Alice', 'Bob', 'Alyssia', 'Artem', 'Babs'];
var filteredStudents = filterNames(students, 'A');
console.log(filteredStudents);