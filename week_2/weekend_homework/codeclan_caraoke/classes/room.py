class Room:
    def __init__(self, name, capacity, total_cash, entry_fee):
     self.name = name
     self.capacity = capacity
     self.guests = []
     self.songs = []
     self.total_cash = total_cash
     self.entry_fee = entry_fee

    def guest_count(self):
        return len(self.guests)

    def add_guest(self, guest):
        if len(self.guests) < self.capacity:
            self.guests.append(guest)

    def remove_guest(self, guest):
        for guest_name in self.guests:
            if guest_name == guest:
                self.guests.remove(guest)

    def song_count(self,):
        return len(self.songs)

    def add_song(self, song):
        self.songs.append(song)

    def remove_song(self, song):
        for song_name in self.songs:
            if song_name == song:
                self.songs.remove(song)

    def increase_total_cash(self, amount):
        self.total_cash += amount

    # def guest_can_afford_entry(self, guest,):
    #     return guest.total_cash >= self.entry_fee

    
    # def guest_can_enter(self, guest):
    #  if guest.total_cash() >= 5:
    #         guest.decrease_total_cash(self.entry_fee)
    #         self.increase_total_cash(self.entry_fee)
    #         self.add_guest(guest)