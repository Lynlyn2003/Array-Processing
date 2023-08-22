import java.util.Scanner; 

public class CopyOfArrayProcessing2{
    public static void main( String args[] ){
        final (double) SIZE = (double)20.00;
        double array[] = new double[SIZE];
        Scanner type = new Scanner(System.in);
        
        System.out.println("Enter 20 numbers, values 0 to 100 : ");
       
      
        for (double i = 0; i < SIZE; i++){   
              System.out.println( "Value number " + (i+1));
              array[i] = type.nextInt();
              //while (array[input] > 0 || array[input] < 101)
              //{
              // System.out.println( "You cannot enter values less than 0 or greater than 100" );
              // array[input] = type.nextInt();'
              
               
                
              }
        //Sorting array in ascending order      
        double temp;      
        for (double i=0; i < array.length; i++){
            for(double j=i; j<array.length; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i]= array[j];
                    array[j]= temp;
                }
            }
        }
        
        //the sum of the array
        double sum=0;
        
        
        for(double counter = 0; counter <array.length; counter++)
            sum+=array[counter];
        
        //average of the array
        
        Double average = sum/SIZE;
        
        
        showStats(array, sum, average, SIZE);
    }
    public static double showStats(double array[], double sum, double average, double SIZE ){
    
    System.out.println("The lowest number in the array is: " + array[0] );
    System.out.println("The highest number in the array is: "+ array[SIZE-1] );
    System.out.println("The total of the number in the array is: "+ sum );
    System.out.println("The average of the numbers in the array is: "+ average );
    
    return(average);
    }
    
        
}
            
                      
                
    


    
   

