package Array;

public class sortedarray {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,8,9,10,1,2,3};
        int t;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        for(int n:arr){
            System.out.println(n+" ");
        }
    }
}
