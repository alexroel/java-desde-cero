

public class Main {
  
    public static void main(String [] args){
        
        int [][][] x = {
            {
                {1,2,3},
                {4,5,6},
            },
            {
                {-1,-2,-3},
                {-4,-5,-6},
            },
        };
        
        for(int[][] matriz2D: x){
            for(int []matriz1D: matriz2D){
                for (int dato:matriz1D){
                    System.out.println(dato);
                } 
            }
        }
        
    }
}
