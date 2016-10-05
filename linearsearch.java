package linear_search;

/**
 *
 * @author User
 */
import java.util.Scanner;
import java.util.Random;
public class Linear_Search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, size, search, array[];
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Enter array size: ");
        size = input.nextInt();
        array = new int[size];
        
        System.out.print("Enter number to find: ");
        search = input.nextInt();
        
        for (i = 0; i<size; i++){
            array[i] = rand.nextInt(1000);
            if (array[i] == search){
                System.out.println("FOUND: " + search + " is at " + "array["+i+"]");
                break;
            }
        }
        
        if (i == size){
            System.out.println("NOT FOUND: " + search + " is not in the array. ");
        }
    }
    
}