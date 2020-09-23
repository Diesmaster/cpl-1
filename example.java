public class HelloWorld{

     public static void main(String []args){
         int number = 1;
         int numberBefore = 1;
         int total = 1;

         while( (number + numberBefore) < 2000000){

             int holder = number;
             number = number + numberBefore;
             numberBefore = holder;

             if( (number%2) == 1){
                 total = total + number;
             }
         }

        System.out.println(total);
     }
}
