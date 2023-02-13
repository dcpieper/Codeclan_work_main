const sports = ['football', 'tennis', 'rugby'];

// console.log(sports[sports.length -1]);

sports.push('curling');
sports.push('snooker');
sports.push('darts');

// sports.pop()

// const removedSport = sports.pop();
// console.log(removedSport);

sports.unshift('Swimming')

const splicedSport = sports.splice(2, 1)

for (const sport of sports) {
    console.log(sport);
}

for (let index = 0; index < sports.length; index++){
    sports[index] = sports[index].toUpperCase()
}

console.log(sports)
