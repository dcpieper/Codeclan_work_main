import {useState, useEffect} from 'react';
import PokemonList from '../components/PokemonList.js';
import PokemonDetail from '../components/PokemonDetail'

const PokemonContainer = ({pokemon}) => {
    
    const [selectedPokemon, setSelectedPokemon] = useState(null);
    // const [pokemon, setPokemon] = useState([])

    const getPokemonData = (url) => {
        fetch(url)
        .then(response => response.json())
        .then(pokemonUrlData => setSelectedPokemon(pokemonUrlData))
    }

    // useEffect(() => {
    //     getPokemon()
    // }, [])

    // const getPokemon = () => {
    //     fetch('https://pokeapi.co/api/v2/pokemon?&limit=9')
    //     .then(res => res.json())
    //     .then(pokemonData => setPokemon(pokemonData.results))
    // }

    // const handleSelectChange = event => {
    //     getPokemon(event.target.value)
    // }


    return (
        <div className='main-container'>
            <PokemonList pokemon={pokemon} getPokemonData={getPokemonData}/>
            <PokemonDetail selectedPokemon={selectedPokemon}/>
        </div>
    )
}

export default PokemonContainer;