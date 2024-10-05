public class warmup{
    public static void main (String[] args){
        //sumDouuble
        System.out.println(sumDouble(1,2));
        System.out.println(sumDouble(2,2));

        //diff21
        System.out.println(diff21(30));

        //parrotTrouble
        System.out.println(parrotTrouble(true,6));
        System.out.println(parrotTrouble(false,6));

        //makes10
        System.out.println(makes10(10,1));

        //nearHundred
        System.out.println(nearHundred(93));
        System.out.println(nearHundred(199));


    }

    //sumDouble
    public static int sumDouble(int a,int b){
        int sum = a+b;
        if(a==b){
            return sum*2;
        }else{
            return sum;
        }
    }

    //diff21
    public static int diff21(int n){
        int diff = 21-n;
        if(n > 21){
            return (-diff)*2;
        }else{
            return diff;
        }
    }

    //parrotTrouble
    public static boolean parrotTrouble(boolean talking, int  hour){
        return talking && (hour<7 || hour>20);
    }

    //makes10
    public static boolean makes10(int a, int b){
        return (a==10 || b==10 || a+b ==10);
    }

    //nearHundred 
    public static boolean nearHundred(int n){
        return (Math.abs(100 - n)<= 10|| Math.abs(200-n)<=10);
    }
}