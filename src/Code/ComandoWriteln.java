package Code;
import java.io.*;
import java.util.*;

import lp.*; 

class ComandoWriteln extends Comando {
   	
   ComandoWriteln(int lin) {
      linha= lin;
   }
   
   public int executa() {
      System.out.println("A");
      return linha+1;
   }
}