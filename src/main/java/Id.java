public class Id {
    public static String getId(){
        char[] base={'1','2','3','4','5','6','7','8','9','0','q','w','e','r','Q','W','E','R','#','@','%','z','x','c','v','b','n','m','l','k','j','*'};


         int i;
         String nabor="";
        for(i=0;i<12;i++){
            nabor=nabor+""+""+base[(int) (Math.random()*base.length)];

        }
         System.out.println(nabor);
        return nabor;
    }
}
