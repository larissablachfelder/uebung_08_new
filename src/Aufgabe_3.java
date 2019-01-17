import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Aufgabe_3 //code richtig aber txt wird nicht befüllt
{
    public static void main(String[] args) {


        FileWriter fw = null;
        try
        {
            fw = new FileWriter("/Users/larissablachfelder/documents/uebung_fur_SW_uebung8/test2.txt");

            fw.write("hallo");
            String lineSeparator = System.lineSeparator();
            for(int i = 1; i <= 5; i++)
            {
                fw.write(Integer.toString(i)+lineSeparator);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fw.close();

            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }

    }

}
