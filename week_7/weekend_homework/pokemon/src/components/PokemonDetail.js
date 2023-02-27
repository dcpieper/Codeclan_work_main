import React from 'react';

const PokemonDetail = ({pokemon}) =>
{

    return(
        <div className='pokemon-detail'>
            <h2>Name: {pokemon.results.name}</h2>
        </div>
    )
}

export default PokemonDetail;