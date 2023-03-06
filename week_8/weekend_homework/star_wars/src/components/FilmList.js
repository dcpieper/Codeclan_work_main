import React from 'react'
import ListItem from './ListItem'

const FilmList = ({films, onFilmClick}) => {
    const allFilms = films.map((film, index) => {
        return(
            <ListItem film={film} key={index} onFilmClick={onFilmClick} />
        )
    })

    return (
        <div>
            {allFilms}
        </div>
    )
}

export default FilmList