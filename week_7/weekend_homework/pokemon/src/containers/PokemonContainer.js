import {useState, useEffect} from 'react';
import PokemonSelector from '../components/PokemonSelector';
import PokemonItem from '../components/PokemonItem';
import PokemonDetail from '../components/PokemonDetail'

const PokemonContainer = () => {
    const [selectedPokemon, setSelectedPokemon] = useState([])
    const [selectedPokemonUrl, setSelectedPokemonUrl] = useState('')

    useEffect(() => {
        getPokemon()
    }, [])

    const getPokemon = () => {
        fetch('https://pokeapi.co/api/v2/pokemon?&limit=1279')
        .then(res => res.json())
        .then(pokemonData => setSelectedPokemon(pokemonData.results))
    }

    const handlePokemonSelected = url => {
        setSelectedPokemonUrl(url)
    }

    const onPokemonClicked = function(pokemon){
        setSelectedPokemon(pokemon)
    }

    return (
        <div className='main-container'>
            <PokemonSelector pokemon={selectedPokemon} onPokemonSelected={handlePokemonSelected}/>
            {selectedPokemon ? 
            <PokemonDetail pokemon={selectedPokemon}/> : null}
        </div>
    )
}

export default PokemonContainer;