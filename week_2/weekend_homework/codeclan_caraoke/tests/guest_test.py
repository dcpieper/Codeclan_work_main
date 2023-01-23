import unittest

from classes.guest import Guest
from classes.room import Room
from classes.song import Song

class TestGuest(unittest.TestCase):

    def setUp(self):
        self.guest = Guest('Steve', 28, 40)

    def test_guest_has_name(self):
        self.assertEqual('Steve', self.guest.name)

    def test_guest_has_age(self):
        self.assertEqual(28, self.guest.age)

    def test_guest_has_cash(self):
        self.assertEqual(40, self.guest.total_cash)

    def test_can_remove_cash(self):
        self.guest.decrease_total_cash(5)
        self.assertEqual(35, self.guest.total_cash)