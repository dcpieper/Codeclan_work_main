import React from 'react';

const Film = ({url, name}) => {
    return(
        <>
        <li className='Film'>
        <a href={url} className='link'>{name}</a>
        </li>
        </>
    )  
}

export default Film