import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class StringCount
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String words[] = str.split(" ");


        HashMap<String,Integer>f=new HashMap<>();
        for(String word:words)
        {if(f.containsKey(word))
            {
                f.put(word,f.get(word)+1);
            }
            else{
                f.put(word,1);
            }

        }
        for(Map.Entry<String,Integer>entry:f.entrySet())
        {
            System.out.println(entry.getKey()+ ":"+entry.getValue());
        }
    


    }
}