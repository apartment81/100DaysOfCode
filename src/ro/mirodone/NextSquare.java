package ro.mirodone;

class NextSquare {

     long findNextSquare(long sq) {

        //find the square root of the given number "sq"
        double sqNum =  Math.sqrt(sq);
        System.out.println(sqNum);
        //if number is perfect square root,
        // return the  next integral perfect square after the one passed as a parameter
        if(sqNum % 1 == 0){

            sqNum ++;

            return (long)(sqNum * sqNum);

        //If the parameter is itself not a perfect square, than -1 should be returned
        }else {
            return -1;
        }
    }

}
