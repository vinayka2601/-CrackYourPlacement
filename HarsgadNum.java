public class HarsgadNum {
    public static void main (String args[]){
        int n=94;//24
        int og=n;
        int sum=0;
        while(og>0){
            int reminder=og%10;
            sum+=reminder;
            og=og/10;
            
        }
        if(n%sum==0){
            System.out.println("its a harshad number");
        }else{
            System.out.println("not harshad");
        }
    }
}
