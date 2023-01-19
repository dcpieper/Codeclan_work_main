cars = {'Volkswagen':'Red', 'BMW':'Blue', 'Mazda':'Green', 'Volvo':'Green'}

def remove_car(cars):
    del(cars['Mazda'])

remove_car(cars)

print(cars)