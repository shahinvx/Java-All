package javaall;
import java.util.*;
import java.io.*;
public class Stringtokenizer_tie {
    public static void main(String[] args) {
        String s=new String();
        String p=new String();
        BufferedReader br;
        try{
        br=new BufferedReader(new FileReader("read.txt"));    
        while((s=br.readLine())!=null)
        {
               p=p+s;
        }
        //System.out.println(p);
        }catch(Exception e)
        {
            System.out.println("File not found");
        }
        StringTokenizer st=new StringTokenizer(p,".");
        int sen_index=1,i=1;
        int word[]=new int[100];
        int len[]=new int[100];
        while(st.hasMoreTokens())
        {
            String test=new String();
            test=st.nextToken();
            StringTokenizer sw=new StringTokenizer(test," ");
            word[i]=sw.countTokens();
            len[i] =test.length();
            i++;
        }
        
        int max_index=1;
        int max_word=word[1];
        int max_len=len[1];
        st=new StringTokenizer(p,".");
        //System.out.println(st.countTokens());
        for(i=1;i<=st.countTokens();i++)
        {
            if(word[i]>=max_word)
            {
                if(len[i]>=max_len)
                {
                    max_word=word[i];
                    max_len=len[i];
                    max_index=i;
                }
            }
        }
        
        System.out.println(max_index);
        
    }
    
}
