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
        final int N = scan.nextInt();
        String[] msg = new String[N];
        scan.nextLine(); // Skip end-line char
        for(int i = 0; i < N; ++i) {
            msg[i] = scan.nextLine();
        }
        int K = scan.nextInt();
        Character data = new Character(msg);
        for(int i=0 ; i<K ; i++){
            data.speak();
        }
    }
}
