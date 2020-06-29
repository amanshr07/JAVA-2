import java.util.*; 
import java.io.*; 
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;


class textread implements Serializable
{
public static void main(String...args)
{

ArrayList<Integer> list = new ArrayList<Integer>();
File file = new File("textfile.txt");
BufferedReader reader = null;

try {
    reader = new BufferedReader(new FileReader(file));
    String text = null;

    while ((text = reader.readLine()) != null) {
        list.add(Integer.parseInt(text));
    }
} catch (FileNotFoundException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
} finally {
    try {
        if (reader != null) {
            reader.close();
        }
    } catch (IOException e) {
    }
}
int sum=0;
Iterator iterator = list.iterator();
while(iterator.hasNext()) {
int num=(int)iterator.next();
sum=sum+num;
}
System.out.println(sum);
}
}