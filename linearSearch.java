public class linearSearch {
    
    public static int linear(int number[],int key){
        for( int i=0;i<=number.length-1;i++){
            if(number[i]==key){
              return i;
            }
        }
       return -1;
    }
     
   public static void main(String[]args){
      int number[]={10,20,30,40};
      int key=20;
      int index=linear(number, key);
      System.out.println(index);
   }
}
