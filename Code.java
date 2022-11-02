import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        System.out.print("Input a Number : ");
        int n=input.nextInt();
        int tnd=n%10;
        while(n!=0){
            n/=10; 
            tnd+=(n%10);
        }
        System.out.println("Total Number of Digits : "+tnd);
    }
    
}

/* Armstrong sayısı sorgulama örneği!
 * 
 * Scanner scanner = new Scanner(System.in);
        System.out.print("n degerini giriniz: ");
        
        int n = scanner.nextInt();
        int count=0;
        int x=n*10;
        int armstrong=0;
        
        while(n!=0){
            n/=10; 
            count++;
            }
        System.out.println(count);
        while(x!=0){
            x/=10; 
            System.out.println(x);
            int b=x%10;
            System.out.println(b);
            int y=b;
            for(int i=2;i<=count;i++){
                y*=b;
            
            }
            
            armstrong+=y;
            System.out.println(armstrong);
 * 
 */