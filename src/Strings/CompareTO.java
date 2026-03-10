package Strings;

public class CompareTO {
    public static void main(String[] args) {
         String s="sajnt";
         String h="saj";
          int result=0;
          int size =Math.min(s.length(),h.length());
          for(int i=0;i<size;i++){
            if(s.charAt(i)!=h.charAt(i)){
                result= (int)(s.charAt(i)-h.charAt(i));
                 break;
            }
          }
          if(s.startsWith(h)){
            result = s.length()-h.length();
          }

          System.out.println(result);
    }
}
