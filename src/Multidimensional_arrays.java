public class Multidimensional_arrays {
    public static void main (String[] args){
    int [][] twoDimArray = {{5,6,3}, {2, 0}, {556}};
    System.out.println(twoDimArray[0][1]);
    System.out.println(twoDimArray[1][1]);
    System.out.println(twoDimArray[2][0]);


    String[][] twoDim =new String[4][2];
    twoDim[0][0] = "Hi";
    System.out.println(twoDim[0][0]);
        System.out.println();


    int [][] test = {{4, 5, 6, 0},{7, 5, 6, 0},{0, 5, 6, 0},{8, 5, 6, 0}};
    for (int i =0; i<test.length; i++){
        for (int j = 0; j<test[i].length; j++){     //output of the entire two-dimensional array using a nested loop
         System.out.print(test[i][j] + " "); //Use print instead of println
    }
        System.out.println();
    }

        System.out.println(); //empty line for space

   for (int i = 0; i <test.length; i++) {
       for (int j = 0; j < 3; j++){         //output of a two-dimensional array up to three columns
           System.out.print(test[i][j] + " "); //Use print instead of println
   }
       System.out.println();
   }

    }
}
