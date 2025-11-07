package Assignment_4;

//public class DuplicateWords {
//    public static void main(String[] args){
//        String s="java is fun and easy and java";
//        String[] arr=s.split(" ");
//        for(int i=0; i<arr.length;i++){
//            if(arr[i]==null) continue;
//            int count=1;
//            for(int j=i+1; j<arr.length;j++){
//                if(arr[i].equals(arr[j]))
//                {
//                    count++;
//                    arr[j]=null;
//                }
//            }
//            if(count>1)
//                System.out.println(arr[i]);
//        }
//    }
//}


import java.util.LinkedHashMap;
import java.util.Map;

//One more way using collections
public class DuplicateWords {
    public static void main(String[] args){
        String[] a= {"java","is","java","easy","is"};
		Map<String,Integer> m=new LinkedHashMap();
		for(String x:a) {
			m.put(x, m.getOrDefault(x, 0)+1);
		}
		for(Map.Entry<String,Integer>x:m.entrySet()) {
			//Printing duplicates
			if(x.getValue()>1) {
				System.out.println(x.getKey());
			}

			//print unique
//			if(x.getValue()<=1) {
//				System.out.println("=============");
//				System.out.println(x.getKey()s);
//			}
		}
    }
}