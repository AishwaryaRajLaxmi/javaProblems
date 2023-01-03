public class TwoDArray{
    public static void main(String args[]){
        // int arr[][]=new int[5][5];

        //creating 2d array and F is a 1D array
        int[] arr[]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        
        

        //jagged Array
        int x[][];
        x=new int[3][];
        x[0]={1,2,3};
        x[1]={1,2,3,4};
        x[2]={1,2,3,4,5};

        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[0].length;j++){
                System.out.print(x[i][j]+" ");
            }
        }

        for(int xy[]:x)
        {
            for(int y:xy)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }

    }
}