#!/bin/bash
NUMBER=1
NUMBER_BEFORE=1
TOTAL=1
REAL_TOTAL=2
MAX=2000000

while (( $REAL_TOTAL < $MAX ))
do
  HOLDER=$NUMBER
  NUMBER=$((NUMBER + NUMBER_BEFORE))
  NUMBER_BEFORE=$HOLDER
  REALTOTAL=$((NUMBER + NUMBER_BEFORE))

  if [ $NUMBER%2 == 1 ]; then
    TOTAL=$((TOTAL + NUMBER))
  fi

done

echo $TOTAL
