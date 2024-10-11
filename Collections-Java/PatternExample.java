package Collections;

public class PatternExample {

    public static void main(String[] args) {

        int l = 1;
        int r = 10;
        boolean ok = false;
        while(l<=r && r<=10 && l>=1)
        {
            for(int i=1;i<=l;i++){
                System.out.print("*");
            }
            for(int i = l + 1; i <= r - 1; i++)
            {
                System.out.print(" ");
            }
            for(int i=10;i>=r;i--){
                System.out.print("*");
            }
            System.out.println();
            if(Math.abs(l - r) == 1)
                ok = true;
            if(!ok) {
                l++;
                r--;
            }
            else {
                l--;
                r++;
            }

        }
    }
}
