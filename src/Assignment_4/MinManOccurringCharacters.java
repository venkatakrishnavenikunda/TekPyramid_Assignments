package Assignment_4;

public class MinManOccurringCharacters {
    public static void main(String[] args){
        String s1 ="Hello java";
        s1 = s1.toLowerCase().replaceAll("\\s+","");
        System.out.println(s1);
        int max=0;
        int min=Integer.MAX_VALUE;
        int count=0;
        char maxch =' ';
        char minchar=' ';
        String s2 ="";
        while(s1.length()>0) {
           char ch = s1.charAt(0);
            s2 = s1.replace(ch + "", "");
            count = s1.length() - s2.length();
            if (count > max) {
                max = count;
                maxch =ch;
            }
            if(count<min){
                min=count;
                minchar=ch;
            }
            s1 = s2;
        }
        System.out.println("Maximun occurance:"+maxch +"->"+max);
        System.out.println("Minimum occurance:"+minchar +"->"+min);
        }
    }
