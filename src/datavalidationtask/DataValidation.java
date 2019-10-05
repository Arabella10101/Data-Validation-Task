///Arabella Balidis

package datavalidationtask;

import java.util.Date;

public class DataValidation {
        
    //Tests to see if String is only letters
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
    
    //Tests if a gender is selected
    public boolean mfcheck(boolean m,boolean f)
    {
        boolean tf=true;
        if (m==false && f==false) 
        {
            tf=false;
        }
        return tf;
    }
    
    //Tests if String consists of digits
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
    
    //Tests the range of the height
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
    
    //Tests length of the ID Number
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
    
    //Tests that the date is not in the future
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
