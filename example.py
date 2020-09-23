number = 1;
number_before = 1;
total = 1;

while (number + number_before) < 2000000:
    holder = number
    number = number + number_before
    number_before = holder

    if number%2 == 1:
        total = total + number

print(total)
