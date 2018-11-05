import java.io.*;

public class TestLineNumbering {
    public static void main(String[] args) {
        if (args.length == 0) {
        	System.out.println("An argument expected!");
            return;
        }
        File file = new File(args[0]);
        try {
            BufferedReader bufferedReader = new BufferedReader(
                                            new InputStreamReader(
                                            new DataInputStream(System.in)));
            PrintWriter printWriter = new PrintWriter(file);
            String str = null;
            int a = 1;
            str = bufferedReader.readLine();
            while ( str != null) {
            	printWriter.println("Line" + a + ": " + str);
                a++;
                str = bufferedReader.readLine();
            }
            bufferedReader.close();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
