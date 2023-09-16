public class maxMin {
    public void max(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum is:"+max);
    }

    public void min(int[] arr){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum is:"+min);
    }

    public static void main(String[] args) {
        int []arr={10,2,5,9,10,56,89,73,25,68,4,9};
        maxMin mm = new maxMin();
        mm.max(arr);
        mm.min(arr);
    }
}
