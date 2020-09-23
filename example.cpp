#include <iostream>

int main(){
  int total = 1;
  int numberbefore = 1;
  int number = 1;

  while(numberbefore + number < 2000000){
    int holder = number;
    number = number + numberbefore;
    numberbefore = holder;

    if(number%2 == 1){
      total += number;
    }
  }

  std::cout << total << std::endl;
}
