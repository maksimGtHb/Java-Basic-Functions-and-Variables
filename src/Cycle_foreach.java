public class Cycle_foreach {
    public static void main (String[] args){

        String[] arrayOfStr = new String[2];
        arrayOfStr[0] = "First name";
        arrayOfStr[1] = "Second name";
        for (String i : arrayOfStr){
            System.out.println(i);
        }

        System.out.println(); //empty line for space

        int[] arrayOfNum = {3, 5, 1};
        int sum = 0;
        for (int i : arrayOfNum){
            sum = sum+i;
        }
        System.out.println(sum);

    }
}
