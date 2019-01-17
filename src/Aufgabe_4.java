import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Aufgabe_4
{
    public static void main(String[] args)
    {
        String ordnerPath = "/Users/larissablachfelder/documents/uebung_fur_SW_uebung8";

        File f = new File(ordnerPath);

        for(String item : f.list())
        {
            System.out.println(ordnerPath+ "/"+item);
            readFile(ordnerPath+ "/"+item);





        }
    }

    public static void readFile(String filepath)
    {
        File test = new File(filepath); //aufgabe 1 nur hier verändert


        BufferedReader br = null;

        List<String> liste = new ArrayList<String>(); //liste erstellen

        try
        {
            br = new BufferedReader(new FileReader(test));

            while(true)
            {
                String zeilen = br.readLine();


                if(zeilen == null) //abbruchbedingung, deshalb alles andere danach
                {
                    break;
                }

                liste.add(zeilen);//liste befüllen
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                br.close();

            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }


        for(String item : liste)
        {
            System.out.println(item);
        }

    }
    }

