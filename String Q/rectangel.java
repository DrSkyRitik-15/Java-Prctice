class Take{
    int length,breath;
    
    void  displayArea(){
        int  area = length*breath;
        int total=(length+breath)*2;
        System.out.println("The Area of rectangle is = "+area); 
        System.out.println("Parameter of rectangle is = "+total);
    }
}
 class ParaTake extends Take {
    
     ParaTake(int l,int b){
         length=l;
        breath=b;
        }
  
}
/**
 * rectangel
 */
public class rectangel {

    public static void main (String[] args){
        ParaTake a1= new ParaTake(5,7);
        a1.displayArea();
        // a1.displayPara();

    }
}