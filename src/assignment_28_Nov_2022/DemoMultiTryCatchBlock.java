package assignment_28_Nov_2022;


public class DemoMultiTryCatchBlock {
	public static void main(String[] args) {
		try    
        {    
            System.out.println("statement 1 ");   
            System.out.println("statement 2");  
       
            try    
            {    
               System.out.println("statement 3"); 
               System.out.println(" statement 4");;    
     
                try    
                {    
                    System.out.println("statement 5");;    
                   System.out.println(" statement 6");;    
             }    
                catch(Exception e2)    
                {    
         System.out.println(e2.getMessage());
                }    
          
            }    
            catch(Exception e1)    
            {    
            	System.out.println(e1.getMessage());
            }    
        }    
        
        catch(Exception e3)    
        {    
        System.out.println(e3.getMessage());
        } 
     }
	}
