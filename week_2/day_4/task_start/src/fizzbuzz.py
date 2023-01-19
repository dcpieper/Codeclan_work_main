def fizzbuzz(number):
    if number % 3 !=0 and number % 5 != 0:
        return number
    
    elif number % 3 == 0 and number % 5 != 0:
        return "Fizz"

    elif number % 3 != 0 and number % 5 == 0:
        return "Buzz"

    elif number % 3 == 0 and number % 5 == 0:
        return "Fizzbuzz"