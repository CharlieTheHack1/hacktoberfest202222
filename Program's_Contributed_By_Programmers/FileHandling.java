import java.io.FileOutputStream;
import java.io.IOException;

/*
File handling in java .
file output stream in java .
 */
public class Filehandling1 {
    public static void main(String[] args)throws IOException {
        // adding a file location into file output stream
        FileOutputStream fout=new FileOutputStream("C:\\Users\\admin\\Desktop\\kailash.html");
        // you can add .txt file here

        fout.write(99); // writing an integer value into file

        String str=" kailash is learning file handling ! ";// string

        // converting the string into byte stream
        byte []b=str.getBytes();
        fout.write(b);// writing byte stream into file

        String s=" More write methods : - ";
        fout.write(s.getBytes()); // writing bytes form of string s.

        // using one more method to write
        fout.write(b,0,8);

        System.out.println(fout.getChannel()+"\n"+fout.getClass());

        fout.close();// closing the output stream

        System.out.println("success...");

    }
}
