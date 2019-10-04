
package datavalidationtask;

import java.util.Date;

public class datavalid {
    
    public boolean testforAlphabets(String st)
    {
        boolean tf=true;      
        for (int i = 0; i < st.length(); i++) 
        {
            int ordval=(int) st.toLowerCase().charAt(i);
            if (!(ordval<=122 && ordval>=97)) 
            {
                tf=false;
            }
            
        }       
        return tf;       
    }
 
    public boolean mfcheck(boolean m,boolean f)
    {
        boolean tf=true;
        if (m==false && f==false) 
        {
            tf=false;
        }
        return tf;
    }
    
    public boolean testNumbers(String num)
    {
        boolean tf=true;
        String h=num;
        for (int i = 0; i < h.length(); i++) 
        {
            int ordval=(int) h.charAt(i);
            if (!(ordval<=57 && ordval>=48)) 
            {
                tf=false;
            }
        }
        return tf;
    }
    
    public boolean testRange(String num)
    {
      boolean tf=true;  
      int h= Integer.parseInt(num);
      
        if (!(h>=100 && h<=300)) 
        {
        tf=false;    
        }
        return tf;
    }
    
    public boolean testID(String idNum)
    {
        boolean tf=true;
        int len= idNum.length();
        
        if (!(len >=13 && len <= 13)) 
        {
            tf=false;           
        } 

        return tf;
    }
    public boolean testDate(Date dob)
    {
        boolean tf=true;
        Date currentDate = new Date();
        
        if (dob.after(currentDate)) 
        {
            tf=false;
        }
        
        return tf;
    }
           
}
