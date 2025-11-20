import java.util.*;

class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int num=sc.nextInt();
        String arr[][]=new String[num][num];
        String choice[]={"2","4","6","8","10","12","14","16","18","20"};
        Random random=new Random();
        System.out.println();
        for (int i=0;i<num;i++){
            for (int j=0;j<num;j++){
                arr[i][j]=choice[random.nextInt(choice.length)];
            }
        }
        for (String[] x : arr){
            System.out.println(Arrays.toString(x));
        }
        System.out.println();
        System.out.print("Enter the number to be evicted: ");
        sc.nextLine();
        String evicter=sc.nextLine();
        int count=0;
        for (int x=0;x<num;x++){
            for(int y=0;y<num;y++){
                if (arr[x][y].equals(evicter)){
                    arr[x][y]="["+evicter+"]";
                    count++;
                }
            }
        }
        System.out.println();
        for (String[] a:arr){
            System.out.println(Arrays.toString(a));
        }
        System.out.println();
        System.out.println("The number of elements found are : "+count);
    }
}