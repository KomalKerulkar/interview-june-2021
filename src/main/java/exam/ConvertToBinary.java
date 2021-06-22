package exam;



public class ConvertToBinary {

 
   public String toBinary(final int n) {
   
   String s="";
   while(n>0)
   {
     s=((n%2)==0 ? "0" : "1")+s;
     n=n/2;
   }
    
    return s;
  
  }
}


