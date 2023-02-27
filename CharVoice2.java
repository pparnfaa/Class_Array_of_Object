import java.util.Scanner;

class Character{
    public int count = 0;
    public String msg[];
    Character(String msg[]){
        this.msg = msg;
    }
    public void speak(){
        System.out.println(msg[count]);
        count ++;
        if(count == msg.length){
            count = 0;
        }
    }
    
}

public class CharVoice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int C = scan.nextInt();
        Character data[] = new Character[C];
        for(int j = 0 ; j < C ; j++){
            final int N = scan.nextInt();
            String[] msg = new String[N];
            scan.nextLine();
            for(int i = 0; i < N; i++) {
                msg[i] = scan.nextLine();
            } 
            data[j] = new Character(msg);
        }
        
        int K = scan.nextInt();
        for(int i=0 ; i<K ; i++){
            int count_k = scan.nextInt();
            data[count_k-1].speak();
        }
    }
}
