import java.util.Scanner;

public class counter {
    public static void main(String[] args) {
        String s=new String();
        Scanner sc=new Scanner(System.in);
        int count=1;
        System.out.print("Enter your text:");
        s=sc.nextLine();
        for(int i=0;i<s.length()-1;i++)
        {
            char c=s.charAt(i);
            char d=s.charAt(i+1);
            if(c==' ' && d!=' ')
                count++;
        }
        System.out.print("Total number of words is:"+count);
    }
}
