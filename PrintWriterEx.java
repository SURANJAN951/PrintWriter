import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterEx {
    public static void main(String[] args) throws Exception{
        File dir = new File ("PwJava");
        File file = new File(dir,"pwsills.txt");

        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);

        pw.write(97);
        pw.write("\n");
        pw.println("java");
        pw.println(100);
        pw.println(true);
        pw.close();
    }
}
