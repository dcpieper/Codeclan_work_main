import PokemonItem from './PokemonItem';

const PokemonSelector = ({pokemons, onPokemonSelected}) => {

    const handleChange = function(event) {
        const chosenPokemon = pokemons[event.target.value];
        onPokemonSelected(chosenPokemon)
    }
    const pokemonItems = pokemons.map((results, index) => {
        return <PokemonItem name={results.name} url={results.url} key={index}/>
    })

    return (
        // <select defaultValue = '' onChange = { handleChange } >
        //     <option value='' disabled > Choose your Pokemon! </option>
                {pokemonItems}
        // </select>
            )
    }


export default PokemonSelector;