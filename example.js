<script>



// To start we will create 2 variables:
var number = 1;
var numberBefore = 1; // <br> means line break in html
var total = 1;

while(number + numberBefore < 2000000){
	var holder = number;
	number = number + numberBefore;
    numberBefore = holder;

    if( number%2 == 1){
    	total = total + number;
    }
}

document.write(total);


</script>
