

public class array {
    public static void main(String[] args) {
        
        int scores[] = {10, 40, -10, 50, 70, 65, 54, 23, 82};
        int evenCounter = 0;
        int oddCounter = 0;
        
        for (int i = 0; i < scores.length; i++) {
            if(scores[i]% 2 == 0)
                evenCounter ++;
            else{
                oddCounter ++;
            }
        }
        System.out.println("Even count: "+ evenCounter);
        System.out.println("Odd count: "+ oddCounter);

        int arbitraryNumber = 1;
        boolean hasFound = contains(scores, arbitraryNumber);
        System.out.println("Has foud value of x: "+ hasFound);

        // int arbitraryNumber = 10;
        // boolean hasFound = false;
        // for (int i = 0; i < scores.length; i++) {
        //     if(scores[i]== arbitraryNumber){
        //         hasFound = true;
        //         break;
        //     }
        // }
        // System.out.println("has found value of x: "+ hasFound);
        }

    public static boolean contains(int[] scores,int target){
        for (int i = 0; i < scores.length; i++) {
            if(scores[i]== target){
                return true;
            }
        }
        return false;
    }

    }



