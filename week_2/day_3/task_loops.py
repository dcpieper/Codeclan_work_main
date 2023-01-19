odd_numbers = [number for  number in [5, 15, 64, 27, 84, 26] if number %2 != 0]

print(odd_numbers)

# chicken_names = ["Hen Solo", "Cluck Norris", "Hennifer Lopez", "ChewPekka", "Feather Locklear"]

chicken_name_10 = [name for name in ["Hen Solo", "Cluck Norris", "Hennifer Lopez", "ChewPekka", "Feather Locklear"] if len(name) > 10]
name_start_h = [name for name in ["Hen Solo", "Cluck Norris", "Hennifer Lopez", "ChewPekka", "Feather Locklear"] if name[0] == "H"]
print(chicken_name_10)
print(name_start_h)

words = ["The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog"]

first_letters = [word[0].lower() for word in words]
print(first_letters)

# Build a new list, with the first letter from each word
# Convert each letter to lower case
# Expected output: ["t", "q", "b", "f", "j", "o", "t", "l", "d"]

# Hint: Strings in Python work as if they were a tuple full of characters. How would you get the first element from a tuple or list?

