import pdb
from models.artist import Artist
from models.album import Album
import repositories.artist_repository as artist_repository
import repositories.album_repository as album_repository

artist_1 = Artist('Eminem')
artist_repository.save(artist_1)
artist_2 = Artist('Killswitch Engage')
artist_repository.save(artist_2)

album_1 = Album("Horizons", "Metalcore", "Parkway Drive" )
album_repository.save(album_1)

# result = album_repository.select_all()
# result = artist_repository.select_all()

# result = album_repository.select(1)
# result = artist_repository.select(1)

# artist_repository.delete_all()
album_repository.delete_all()

pdb.set_trace()