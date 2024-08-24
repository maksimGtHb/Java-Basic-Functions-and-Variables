public class Break_and_continue {
    public static void main (String[] args){

        //break example
        int n = 1;
        while (true){          //An endless loop, it's better not to do that
            System.out.println(n);
            n++;
            if (n == 10) {
                break;
            }
        }
        System.out.println("The cycle is interrupted");

        //continue example
        for (int i = 0; i<6; i++){
            if (i % 3==0){
                System.out.println("This number " + i + " is divided by three");
                continue;
            }
            System.out.println("This number " + i + " is NOT divided by three");
        }
    }
}
