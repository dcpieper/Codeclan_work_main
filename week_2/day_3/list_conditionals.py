# numbers = range(1,11)
evens_squared = [number * number for number in range(1,11) if number % 2 == 0]

# for number in numbers:
#     if number % 2 == 0:
#         evens_squared.append(number * number)

print(evens_squared)