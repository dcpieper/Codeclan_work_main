class Guest:

    def __init__(self, name, age, total_cash):
        self.name = name
        self.age = age
        self.total_cash = total_cash

    def decrease_total_cash(self, amount):
        self.total_cash -= amount