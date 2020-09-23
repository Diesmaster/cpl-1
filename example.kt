fun main() {
    var number = 1;
    var numberBefore = 1;
    var total = 1;

    while( (number + numberBefore) < 2000000){
        var holder = number;
        number = number + numberBefore;
        numberBefore = holder;

        if(number%2 == 1){
            total = total + number
        }
    }
    print(total);
}
