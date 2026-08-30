package Array;

public class EqualityCheck {
    public static void main(String[] args) {
    int arr1[]={1,2,3,4,5};
    int arr2[]={1,2,3,4,5};
    boolean isEqual=true;
    if(arr1.length==arr2.length){
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                isEqual=false;
                break;
            }
        }
        if(isEqual){
            System.out.println("arrays are same");
        }
        else{
            System.out.println("Arrays Are diff");
    }

    }
    
    else{
        System.out.println("Arrays are of different length");
    }
   
}
   
    
}
