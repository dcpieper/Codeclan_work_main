# WRITE YOUR FUNCTIONS HERE
def get_pet_shop_name(pet_shop):
    return pet_shop["name"]

def get_total_cash(pet_shop):
    return pet_shop["admin"]["total_cash"]

def add_or_remove_cash(pet_shop, amount):
    pet_shop["admin"]["total_cash"] += amount

def get_pets_sold(pet_shop):
    return pet_shop["admin"]["pets_sold"]

def increase_pets_sold(pet_shop, amount):
    pet_shop["admin"]["pets_sold"] += amount

def get_stock_count(pet_shop):
    return len(pet_shop["pets"])

def get_pets_by_breed(pet_shop, breed):

    number_of_breed = []
    
    for pet in pet_shop["pets"]:
        if pet["breed"] == breed:
            number_of_breed.append(pet)
    return number_of_breed

def find_pet_by_name(pet_shop, name):
    for pet in pet_shop["pets"]:
        if pet["name"] == name:
            return pet

def remove_pet_by_name(pet_shop, name):
    for pet in pet_shop["pets"]:
        if pet["name"] == name:
            pet_shop["pets"].remove(pet)

def add_pet_to_stock(pet_shop, new_pet):
    pet_shop["pets"].append(new_pet)

def get_customer_cash(customer):
    return customer["cash"]

def remove_customer_cash(customers, amount):
    customers["cash"] -= amount

def get_customer_pet_count(customers):
    return len(customers["pets"])

def add_pet_to_customer(customers, new_pet):
    customers["pets"].append(new_pet)

def customer_can_afford_pet(customers, new_pet):
    if (customers["cash"]) >= (new_pet["price"]):
        return True
    else:
        return False

    #also could be return customer["cash"] >= new_pet["price"] probably cleaner?

def sell_pet_to_customer(pet_shop, pet, customer):
    if pet in pet_shop['pets'] and customer_can_afford_pet(customer, pet):
            add_pet_to_customer(customer, pet)
            remove_customer_cash(customer, pet["price"])
            increase_pets_sold(pet_shop, 1)
            remove_pet_by_name(pet_shop, pet)
            add_or_remove_cash(pet_shop, pet["price"])

    
    