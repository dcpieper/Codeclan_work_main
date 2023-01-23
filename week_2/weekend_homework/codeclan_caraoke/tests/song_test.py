import unittest

from classes.song import Song
# from classes.guest import Guest
# from classes.room import Room

class TestSong(unittest.TestCase):
    
    def setUp(self):
        self.song = Song("Africa", "Toto", 4.21)

    # def test_song_has_name(self):
    #     self.assertEqual("Africa", self.song.name)
    
    # def test_song_has_artist(self):
    #     self.assertEqual("Toto", self.song.artist)

    # def test_song_has_duration(self):
    #     self.assertEqual(4.21, self.song.duration)