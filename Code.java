import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        
        //SAYININ BASAMAK RAKAMLARININ TOPLAMINI VEREN PROGRAM

        Scanner input=new Scanner(System.in);
  
        System.out.print("Input a Number : ");
        int n=input.nextInt();
        int tnd=n%10;
        while(n!=0){
            n/=10; 
            tnd+=(n%10);
        }
        System.out.println("Total Number of Digits : "+tnd);
   
        /*
        //SAYININ ARMSTRONG OLUP OLMADIĞINI SORGULAYAN PROGRAM
        System.out.print("Input a Number : ");
        int n = input.nextInt();
        int count=0;
        int x=n*10;
        int armstrong=0;
        int tempn=n;
        
        while(tempn!=0){
            tempn/=10; 
            count++;
            }
        
        while(x!=0){
            x/=10; 
            int b=x%10;
            int y=b;
            for(int i=2;i<=count;i++){
                y*=b;
            }
            armstrong+=y;
        }
        if(armstrong==n){
            System.out.println(n+" is an Armstrong Number.");
        }else{
            System.out.println(n+" is not an Armstrong Number.");
        }
   
        
        
        *//*
        //0-10000 ARASI BÜTÜN ARMSTRONG SAYILARI YAZDIRAN PROGRAM
        
        for(int i=1;i<10000;i++){
            int tempi=i;
            int count=0;
            while(tempi!=0){
                tempi/=10; 
                count++;
            }
            
            tempi=i;
            int armstrong=0;
            
            while(tempi!=0){
                int basvalue=tempi%10;
                int baspow=1;
                for(int j=1;j<=count;j++){
                    baspow*=basvalue;
                }
                tempi/=10;
                armstrong+=baspow;
            }
            
            if(armstrong==i){
            System.out.println(i+" is an Armstrong Number.");
            }
        }*/
    }
}

