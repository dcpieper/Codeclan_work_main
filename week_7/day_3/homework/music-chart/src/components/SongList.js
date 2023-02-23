import React from 'react';
import ListItem from './ListItem';

const SongList = ({songs}) => {

    const songItems = songs.map((songs, index) => {
        return <ListItem label={songs.title.label} key={index} />
    })

    return (
    <div>
        <ol>
            {songItems}
        </ol>
    </div>
    )
}

export default SongList