import unittest

from src.fizzbuzz import fizzbuzz

class TestFizzbuzz(unittest.TestCase):

    def test_1_is_not_fizzbuzz(self):
        self.assertEqual(1, fizzbuzz(1))
    
    def test_3_is_fizz(self):
        self.assertEqual("Fizz", fizzbuzz(3))

    def test_5_is_buzz(self):
        self.assertEqual("Buzz", fizzbuzz(5))
    
    def test_15_is_fizzbuzz(self):
        self.assertEqual("Fizzbuzz", fizzbuzz(15))