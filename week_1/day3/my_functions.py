def greet(name, time_of_day): #name is parameter
    #print("Hello") #use with greet()
    return "Good " + time_of_day + ", " + name #use with greeting = greet() print(greeting)

greeting = greet("Randolph", "morning") #Randolph is argument
print(greeting)
#greet()

name_1 = "Bob"
time_of_day_1 = "morning"
name_2 = "Ada"
time_of_day_2 = "afternoon"
greeting = greet(name_1, time_of_day_1)
print(greeting)
greeting=greet(name_2, time_of_day_2)
print(greeting)

def test():
    words = "Hey"
    return words

def test_2():
    return greeting

print(test_2())

chickens = [
  { "name": "Margaret", "age": 2, "eggs": 0 },
  { "name": "Hetty", "age": 1, "eggs": 2 },
  { "name": "Henrietta", "age": 3, "eggs": 1 },
  { "name": "Audrey", "age": 2, "eggs": 0 },
  { "name": "Mabel", "age": 5, "eggs": 1 },
]

def count_eggs(list):

    total_eggs = 0

    for bird in list:
        total_eggs += bird["eggs"]
        bird["eggs"] = 0 # eggs have been collected

    return f"{total_eggs} eggs collected"

print(count_eggs(chickens))

