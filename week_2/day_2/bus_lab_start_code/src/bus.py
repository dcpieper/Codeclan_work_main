class Bus:
    def __init__(self, route_number, destination):
        self.route_number = route_number
        self.destination = destination
        self.passengers = []

    def  drive(self):
        return "Brum brum"

    def passenger_count(self):
        return len(self.passengers)    

    def pick_up(self, passengers):
        self.passengers.append(passengers)    

    def drop_off(self, passengers):
        self.passengers.remove(passengers)      

    def empty(self):
        for passenger in self.passengers:
            self.passengers.remove(passenger)
        # self.passengers.clear()

    def pick_up_from_stop(self, bus_stop):
        for passengers in bus_stop.queue:
            self.pick_up(passengers)




       