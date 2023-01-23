import unittest

from classes.room import Room
from classes.song import Song
from classes.guest import Guest

class TestRoom(unittest.TestCase):

    def setUp(self):
        self.guest_1 = Guest('Steve', 28, 20)
        self.guest_2 = Guest('Belinda', 64, 20)

        self.song_1 = Song('Africa','Toto', 4.21)
        #self.song_2 = Song('Blue Monday', 'New Order', 4.09 )

        # guests = [self.guest_1]
        # songs = [self.song_1]
        self.room_1 = Room('80s', 1, 10, 5)
        self.room_2 = Room('90s', 5, 10, 5)
        # self.songs = [songs]

    def test_room_has_name(self):
        self.assertEqual('80s', self.room_1.name)

    def test_room_has_capacity(self):
        self.assertEqual(1, self.room_1.capacity)

    def test_can_add_guest(self):
        self.room_1.add_guest(self.guest_1)
        self.assertEqual(1, self.room_1.guest_count())
    
    def test_can_remove_guest(self):
        self.room_1.remove_guest(self.guest_1)
        self.assertEqual(0, self.room_1.guest_count())

    def test_can_add_song(self):
        self.room_1.add_song(self.song_1)
        self.assertEqual(1, self.room_1.song_count())

    def test_can_remove_song(self):
        self.room_1.remove_song(self.song_1)
        self.assertEqual(0, self.room_1.song_count())

    def test_capacity_reached(self):
        self.room_1.add_guest(self.guest_2)
        self.assertEqual(1, self.room_1.guest_count())

    def test_room_has_cash(self):
        self.assertEqual(10, self.room_1.total_cash)

    def test_can_increase_total_cash(self):
        self.room_1.increase_total_cash(5)
        self.assertEqual(15, self.room_1.total_cash)
#     def test_customer_can_afford_entry_yes(self):
# self.assertEqual(True, can_afford)

    # def test_guest_can_enter_room(self):
    #     self.room_1.guest_can_enter(self.guest_1)
    #     self.assertEqual(15, self.guest_1.total_cash)
    #     self.assertEqual(15, self.room_1.total_cash)
    #     self.assertEqual(1, self.guest_count())