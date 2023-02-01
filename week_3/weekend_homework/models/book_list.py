from models.book import *

book1 = Book("Hyperion", "Dan Simmons", "Sci-Fi", False)
book2 = Book("The Final Empire", "Brandon Sanderson", "Fantasy", True)
book3 = Book("Night Lords", "Aaron Dembski-Bowden", "Sci-Fi", False)
books = [book1, book2, book3]

def add_new_book(new_book):
    books.append(new_book)

def delete_a_book(index):
    books.remove(books[int(index-1)])

