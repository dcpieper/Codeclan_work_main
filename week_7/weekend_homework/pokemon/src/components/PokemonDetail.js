import React from 'react';

const PokemonDetail = ({selectedPokemon}) => {
    if(!selectedPokemon){
        return "Pick your Pokemon"
    }

    // const pokeImage = selectedPokemon.height.map((image, index) => {
    //     return (
    //         <div key={index}>{image}</div>
    //     )
    // })



    return(
        <div className='pokemon-detail'>
            {/* {console.log(selectedPokemon)} */}
            <img src={selectedPokemon.sprites.other.dream_world.front_default} />
        </div>
    )
}

export default PokemonDetail;