import React, {useState, useEffect} from 'react'
import FilmList from '../components/FilmList'
import FilmDetail from '../components/FilmDetail'
import PageSelector from '../components/PageSelector'

const FilmContainer = () => {

    const [films, setFilms] = useState([]);
    const [selectedFilm, setSelectedFilm] = useState(null);

    useEffect(() => {
        getFilms()
    }, [])

    const getFilms = () => {
        fetch('https://swapi.dev/api/films/?format=json')
        .then (res => res.json())
        .then (films => setFilms(films.results))
    }

    const onFilmClick = (film) => {
        setSelectedFilm(film);
    }

    // const handleSelectChange = event => {
    //     getFilms(event.target.value);
    // }

    return (
        <div>
            <div>
                <FilmList films={films}
                // onFilmClick={onFilmClick}
                />
            </div>
            {/* <div>
                {selectedFilm ?
                <FilmDetail film={selectedFilm}/> : <img src={ require(`./star_wars.png`)}/>}
            </div> */}
            {/* <div>
                <PageSelector handleSelectChange={handleSelectChange}/>
            </div> */}
        </div>
    )
}

export default FilmContainer