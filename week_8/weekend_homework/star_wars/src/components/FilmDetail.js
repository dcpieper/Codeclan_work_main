import React from 'react'


const FilmDetail =({film}) => {
    return (
        <div>
            <div>Film Details
            <p>{film.title}</p>
            <p>Director: {film.director}</p>
            <p>Producer: {film.producer}</p>
            <p>Release Date: {film.release_date}</p>
            </div>
        </div>
    )
}

export default FilmDetail