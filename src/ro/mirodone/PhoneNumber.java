package ro.mirodone;

 class PhoneNumber {

     //function that accepts an array of 10 integers (between 0 and 9),
     // that returns a string of those numbers in the form of a phone number.

     String createPhoneNumber(int[] numbers) {

          StringBuilder builder = new StringBuilder();
          for(int i : numbers) {
              builder.append(i);
          }

        return builder.toString().
                replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");

        // solution 2
         // return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
         // java.util.stream.IntStream.of(numbers).boxed().toArray());
    }
}
