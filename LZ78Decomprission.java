
package lz78decomprission;

import java.util.ArrayList;


public class LZ78Decomprission {
      

    /**
     * @param args the command line arguments
     */
     ArrayList <String> Dectionary = new ArrayList<String>();
       String phrase ;
       private void Decompression (int i, String x){
            Dectionary.add(null);
            phrase = null;
            
            if (i==0){
                //thats means this is the frist time the sympol appears 
                //add sympol in dectionary 
                Dectionary.add(x);
                //put sympol in the output phrase.
                phrase = phrase + x;
                
            }else {
                //thts means this sympol founded in dectionary
                String intry;//string to save in it the intry of dectionary at index i.
                //get intry at index i
                intry = Dectionary.get(i);
                //add the intry + the sympol at the end of dectionary
                Dectionary.add(intry + x);
                //puild the phrase
                phrase =phrase + (intry+x);
                intry=null;
            }
            
        }
            
    
}
