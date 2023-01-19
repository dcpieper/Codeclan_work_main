class Team:
    def __init__(self, input_name, input_players, input_coach):
        self.name = input_name
        self.players = input_players
        self.coach = input_coach
        self.points = 0

    def add_player(self, new_player):
        self.players.append(new_player)

    def has_player(self, player):
        return player in self.players
        #return self.players.count(players) > 0

    def play_game(self, Win):
        if Win:
            self.points += 3


