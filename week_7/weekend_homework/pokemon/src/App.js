import './App.css';
import React, {useState, useEffect} from 'react';
import PokemonContainer from './containers/PokemonContainer'

function App() {

  const [pokemon, setPokemon] = useState([])

  useEffect(() => {
      getPokemon()
  }, [])

  const getPokemon = () => {
      fetch('https://pokeapi.co/api/v2/pokemon?&limit=151')
      .then(res => res.json())
      .then(pokemonData => setPokemon(pokemonData.results))
  }

  return (
    <div className="App">
        {pokemon ? <PokemonContainer pokemon={pokemon}/> : null}
    </div>
  );
}

export default App;
