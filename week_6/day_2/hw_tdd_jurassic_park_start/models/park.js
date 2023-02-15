const Park = function (name, price) {
    this.name = name;
    this.price = price;
    this.dinosaurs = []
}

Park.prototype.dinosaurCount = function(){
    return this.dinosaurs.length;
}

Park.prototype.addDinosaur = function(dinosaur){
    this.dinosaurs.push(dinosaur);
}

Park.prototype.removeDinosaur = function(){
    this.dinosaurs.pop();
}

Park.prototype.findMostAttractiveDinosaur = function(){
    let mostAttractiveDino = this.dinosaurs[0];

    for (const dino of this.dinosaurs) {
        if (dino.guestsAttractedPerDay > mostAttractiveDino.guestsAttractedPerDay) {
            mostAttractiveDino = dino;
        }
    }

    return mostAttractiveDino;
}

Park.prototype.findDinosaursBySpecies = function(species){
    let dinospecies = [];
    for (const dinosaur of this.dinosaurs){
        if (dinosaur.species === species){
            dinospecies.push(dinosaur);
        }
    }
    return dinospecies
}
module.exports = Park;