from flask import render_template, request
from app import app
from models.book_list import books, add_new_book, delete_a_book
from models.book import Book

@app.route('/books')
def index():
    return render_template('index.html', title='Home', books=books)

@app.route('/books', methods=['POST'])
def add_book():
    book_title = request.form['title']
    book_author = request.form['author']
    book_genre = request.form['genre']
    new_book = Book(book_title, book_author, book_genre)
    add_new_book(new_book)
    print(books)
    return render_template('index.html', title='Home', books=books)

@app.route('/books/<index>')
def one_book(index):
    show_book = books[int(index)]
    return render_template('show_book.html', books=show_book)

@app.route('/books/delete/<int:index>', methods=['POST'])
def delete_book(index):
        delete_a_book(index)
        return render_template('index.html', title='Home', index=index)

