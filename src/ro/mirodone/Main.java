package ro.mirodone;


public class Main {

    public static void main(String[] args) {

        PhoneNumber phoneNumber = new PhoneNumber();
        String phNum = phoneNumber.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        System.out.println(phNum);

        DescendingOrder descendingOrder = new DescendingOrder();
        System.out.println(descendingOrder.sortDesc(481226339));


    }

}
