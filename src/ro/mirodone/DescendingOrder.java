package ro.mirodone;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;


class DescendingOrder {

      int sortDesc(final int num) {

            /*  return Integer.parseInt(String.valueOf(num)
                      .chars()
                      .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                      .sorted(Comparator.reverseOrder())
                      .collect(Collectors.joining()));*/
          String[] array = String.valueOf(num).split("");
          Arrays.sort(array, Collections.reverseOrder());
          return Integer.valueOf(String.join("", array));

          }
}
