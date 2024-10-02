public class Logic1 {
    public static void main (String[] args){
        //dateFashion 
        System.out.println(dateFashion(10, 2));

        //squirrelPlay
        System.out.println(squirrelPlay(95,false));

        //caughtSpeeding
        System.out.println(caughtSpeeding(75,false));

        //sortaSum
        System.out.println(sortaSum(10,11));

    }

    //dateFashion
    public static int dateFashion(int you,int date){
        if (you <=2 || date <=2){
            return 0;
        }else if(you >=8 || date >=8){
            return 2;
        }else
        return 1;
    }

    //squirrelPlay
    public static boolean squirrelPlay(int temp, boolean isSummer){
        if(isSummer){
            return temp >=60 && temp <=100;
        }else {
            return temp >=60 && temp <=90;
        }
    }

    //caughtSpeeding
    public static int caughtSpeeding(int speed, boolean isBirthday){
        if(isBirthday){
            speed -= 5;
        }
        
        if (speed <=60){
            return 2;
        }else if (speed >=61 && speed <=80){
            return 1;
        }else {
            return 0;
        }
    }

    public static int sortaSum (int a, int b){
        int sum = a +b;
        if(a >=10 && a<=19){
            return 20;
        }
        return sum;
    }


}
