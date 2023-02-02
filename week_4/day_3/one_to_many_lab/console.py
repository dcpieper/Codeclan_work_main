import pdb
from models.book import Book
from models.author import Author

import repositories.book_repository as book_repository
import repositories.author_repository as author_repository

book_repository.delete_all()
author_repository.delete_all()

author1 = Author("Dan", "Abnett")
author_repository.save(author1)
author2 = Author("Dan", "Simmons")
author_repository.save(author2)

author_repository.select_all()

book_1 = Book("Horus Rising", author1, "Science Fiction", "The beginning of the end")
book_repository.save(book_1)

book_2 = Book("Hyperion", author2, "Science Fiction", "Best Sci-Fi book ever")
book_repository.save(book_2)

pdb.set_trace()