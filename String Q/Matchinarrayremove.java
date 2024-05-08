public class Matchinarrayremove {
    public static void main(String[] args) {
        int arr[]={10,10,20,20,40,65,60,60};
        int len1=arr.length;
        int arr1[]=new int[len1];
        int arr2[]=new int[len1];
        int count2=0;
        int count=0;

        // System.out.println(len1); // array length
        for (int i = 0; i < arr.length; i++) {
           Apple: for (int j = 0; j < arr.length; j++) {
                if (arr[i]!=arr[j]) {
                  arr1[count2]=arr[j];
                  count2++;
                  break Apple;
                  
                }
                // else
                // {
                //    arr[count]=arr[i];
                //    count++;
                // }
                
            }
        }
        for (int k = 0; k < count2; k++) {
            
            System.out.println(arr1[k]);
        }

    }
}
