// const scenario = {
//     murderer: 'Miss Scarlet',
//     room: 'Library',
//     weapon: 'Rope'
// };
// // const declareMurderer = function() {
// //     return `The murderer is ${scenario.murderer}.`;
// // }

// const verdict = declareMurderer();
// console.log(verdict);

//  The murderer is Miss Scarlet.
// Scenario is global scope so function can see it

// const murderer = 'Professor Plum';

// const changeMurderer = function() {
//     murderer = 'Mrs. Peacock';
// }

// const declareMurderer = function() {
//     return `The murderer is ${murderer}.`;
// }

// changeMurderer();
//     const verdict = declareMurderer();
// console.log(verdict);

// error because murderer is defined differently in both const statements

// let murderer = 'Professor Plum';

// const declareMurderer = function() {
//     let murderer = 'Mrs. Peacock';
//     return `The murderer is ${murderer}.`;
// }

// const firstVerdict = declareMurderer();
// console.log('First Verdict: ', firstVerdict);

// const secondVerdict = `The murderer is ${murderer}.`;
// console.log('Second Verdict: ', secondVerdict);

// First Verdict: The murderer is Mrs. Peacock
// Because the let murderer = 'Mrs. Peacock' is contained within the scope of the function
// Second Verdict: The murderer is Professor Plum
// Because let murderer = 'Professor Plum' is in the scope of the whole program

// let suspectOne = 'Miss Scarlet';
// let suspectTwo = 'Professor Plum';
// let suspectThree = 'Mrs. Peacock';

// const declareAllSuspects = function() {
//     let suspectThree = 'Colonel Mustard';
//     return `The suspects are ${suspectOne}, ${suspectTwo}, ${suspectThree}.`;
// }

// const suspects = declareAllSuspects();
// console.log(suspects);
// console.log(`Suspect three is ${suspectThree}.`);

// The suspects are Miss Scarlet, Professor Plum, Colonel Mustard
// The let suspectThree = 'Colonel Mustard' is within the scope of the function, which takes precedence over the original let suspectThree
// Suspect three is Mrs Peacock
// Same reason as before, Colonel Mustard is limited to inside the function

// const scenario = {
//     murderer: 'Miss Scarlet',
//     room: 'Kitchen',
//     weapon: 'Candle Stick'
// };
    
// const changeWeapon = function(newWeapon) {
//     scenario.weapon = newWeapon;
// }
    
// const declareWeapon = function() {
//     return `The weapon is the ${scenario.weapon}.`;
// }
    
// changeWeapon('Revolver');
// const verdict = declareWeapon();
// console.log(verdict);

// The weapon is the revolver
// all const are within same scope, weapon is changed to revolver, verdict is printed

// let murderer = 'Colonel Mustard';

// const changeMurderer = function() {
//     murderer = 'Mr. Green';

//     const plotTwist = function() {
//         murderer = 'Mrs. White';
//     }

//     plotTwist();
// }

// const declareMurderer = function () {
//     return `The murderer is ${murderer}.`;
// }

// changeMurderer();
// const verdict = declareMurderer();
// console.log(verdict);

//  The murderer is Mrs. White
// I think because the changeMurderer function works its way through, so it changes to Mr.Green but then the plotTwist function changes it to Mrs White

// let murderer = 'Professor Plum';

// const changeMurderer = function() {
//     murderer = 'Mr. Green';

//     const plotTwist = function() {
//     let murderer = 'Colonel Mustard';

//         const unexpectedOutcome = function() {
//             murderer = 'Miss Scarlet';
//         }

//         unexpectedOutcome();
//     }

//     plotTwist();
// }

// const declareMurderer = function() {
//     return `The murderer is ${murderer}.`;
// }

// changeMurderer();
// const verdict = declareMurderer();
// console.log(verdict);
//  The murderer is Mr. Green
// Because the let makes the murderer Colonel Mustard only within the scope of the plotTwist function, which then makes the unexpectedOutcome function only part of the scope of the plotTwist function also

// const scenario = {
//     murderer: 'Mrs. Peacock',
//     room: 'Conservatory',
//     weapon: 'Lead Pipe'
// };

// const changeScenario = function() {
//     scenario.murderer = 'Mrs. Peacock';
//     scenario.room = 'Dining Room';

//     const plotTwist = function(room) {
//     if (scenario.room === room) {
//         scenario.murderer = 'Colonel Mustard';
//     }

//     const unexpectedOutcome = function(murderer) {
//         if (scenario.murderer === murderer) {
//         scenario.weapon = 'Candle Stick';
//         }
//     }

//     unexpectedOutcome('Colonel Mustard');
//     }

//     plotTwist('Dining Room');
// }

// const declareWeapon = function() {
//     return `The weapon is ${scenario.weapon}.`
// }

// changeScenario();
// const verdict = declareWeapon();
// console.log(verdict);

// The weapon is Candle Stick
// The room is changed to dining room, which then makes the plotTwist change the murderer to Colonel Mustard, which then causes the unexpectedOutcome to change the weapon to Candle Stick

// let murderer = 'Professor Plum';

// if (murderer === 'Professor Plum') {
//     murderer = 'Mrs. Peacock';
// }

// const declareMurderer = function() {
//     return `The murderer is ${murderer}.`;
// }

// const verdict = declareMurderer();
// console.log(verdict);

// The murderer is Professor Plum
// The let murderer = 'Mrs. Peacock is only within the scope of the if statement, it doesnt change anything outside that. Remove the let and it changes to Mrs. Peacock

