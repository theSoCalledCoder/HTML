import java.util.ArrayList;

public class nbitBinary {
    
        public static void correct(int N,String s, ArrayList<String> str, int numO, int numOf){
        if(N==0){
            str.add(s);
            return;
        }
        if(numOf<N){
            correct(N-1,s+"1", str, numO,numOf+1);
        }
        if(numO<numOf){
            correct(N-1,s + "0",str, numO +1, numOf);
        }
        
        
    }
    public static void main(String[] args) {
        int N=3;
        ArrayList<String> str = new ArrayList<>();
        correct (N,"", str, 0,0);
        for(String s: str){
            System.out.println(s);
        }
    }
}
