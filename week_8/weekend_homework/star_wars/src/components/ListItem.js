import React from 'react'

const ListItem = ({film, onFilmClick}) => {

    const handleClick = function() {
        onFilmClick(film);
    }

    return(
        <div>
            <p>{film.title}</p>
            
            <button onClick={handleClick} className='detail-button'>More Info</button>
        </div>
    )
}

export default ListItem