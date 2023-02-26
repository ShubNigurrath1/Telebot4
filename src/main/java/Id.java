public class Id {
    public static char[] getId(){
        char[] base=new char[20];
        base[0]='f';
        base[1]='1';
        base[2]='2';
        base[3]='3';
        base[4]='#';
        base[5]='5';
        base[6]='6';
        base[7]='7';
        base[8]='$';
        base[9]='9';
        base[10]='0';
        base[11]='@';
        base[12]='W';
        base[13]='E';
        base[14]='R';
        base[15]='T';
        base[16]='Y';
        base[17]='U';
        base[18]='I';
        base[19]='O';
         int i;
         String nabor="";
        for(i=0;i<8;i++){
            nabor=nabor+""+""+base[(int) (Math.random()*base.length)];

        }
         System.out.println(nabor);
        return base;
    }
}
