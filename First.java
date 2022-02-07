import java.io.IOException;

public class First {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello First Program");
        int read = System.in.read();
        System.out.println("Entered Input is : " + read);
    }
}

// jps -l
// jhsdb jmap --heap --pid <pid>
// jcmd <pid> VM.info

