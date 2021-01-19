import java.util.*;
class quadrant{
    public static void main(String []args){
        Scanner kbd=new Scanner(System.in);
        int x=kbd.nextInt();
        int y=kbd.nextInt();
        if((-1000<=x && x<=1000 && x!=0)&&(-1000<=y && y<=1000 && y!=0)){
            if(x>0){
                if(y>0)
                   System.out.println("1");
                else
                   System.out.println("4");
            }
            else{
                if(y>0)
                   System.out.println("2");
                else
                   System.out.println("3");
            }
        }
    }
}