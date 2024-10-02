public class string1 {
    public static void main(String[] args) {
        //helloName
        System.out.println(helloName("Bob!"));

        //makeAbba
        System.out.println(makeAbba("Hi","Bye"));

        //makeOutword
        System.out.println(makeOutWord("<<>>", "word"));

        //extraEnd
        System.out.println(extraEnd("word"));

        //firstTwo
        System.out.println(firstTwo("a"));

        //makeTags
        System.out.println(makeTags("i","Yoy"));

        //firstHalf
        System.out.println(firstHalf("HelloThere"));


        
    }

    //helloName
    public static String helloName(String name){
        return "Hello "+ name;
    }

    //makeAbba
    public static String makeAbba(String a, String b){
        return a+b+b+a;
    }

    //makeOutWord
    public static String makeOutWord(String out,String word){
        // String a = out.substring(0, 2);
        // String b=out.substring(2, 4);
        // return a + word + b;
        return out.substring(0,2) + word + out.substring(2, 4);
    }

    //extraEnd
    public static String extraEnd(String str){
        String r= str.substring(str.length()-2, str.length());
        return r+r+r;
    }

    //firstTwo
    public static String firstTwo (String str){
        if (str.length() < 2){
            return str;
        }else{
            return str.substring(0, 2);
        }
    }

    //makeTags
    public static String makeTags(String tag, String word){
        return "<"+tag+">"+word+"</"+tag+">";
    }

    //firstHalf
    public static String firstHalf(String str){
        return str.substring(0,(str.length())/2);
    } 

}
