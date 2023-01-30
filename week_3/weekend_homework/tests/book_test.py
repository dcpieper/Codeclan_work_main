import unittest
from models.book import Book

class TestBook(unittest.TestCase):
    def setUp(self):
        self.book = Book('Only in Death', 'Dan Abnett', 'Sci-Fi', False)

    def test_book_has_title(self):
        self.assertEqual('Only in Death', self.book.title)

    def test_book_has_author(self):
        self.assertEqual('Dan Abnett', self.book.author)

    def test_book_has_genre(self):
        self.assertEqual('Sci-Fi', self.book.genre)

    def test_book_can_checkout(self):
        self.assertEqual(False, self.book.checked_out)