public class Arrays_in_Java {
    public static void main (String[] args){
        int [] newArray = new int [8];
        for (int i =0; i<newArray.length; i++){
          newArray[i] = i*10;              //method of initialization using a loop
          System.out.println(newArray[i]); //array output
        }
        System.out.println(); //empty line for space
        int [] newAnotherArray =  {0, 10, 20, 30, 40, 50, 60, 70}; //initialization
        for (int i =0; i < newAnotherArray.length; i++){
            System.out.println(newAnotherArray[i]); //array output
        }
    }
}
