//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;

import mapka.Map;
//import fields.*;

public class Mapowanie{

     public static void main(String []args){
		
        Map mapunia = Map.newMap();
        mapunia.newGrid(mapunia.height, mapunia.width);
        mapunia.drawMap();
        
        
//		RACZEJ BEZUŻYTECZNE:
//        mapunia.tellSize();
//        int x = mapunia.height;
//        System.out.println(x);

//        List<Field> lista = new ArrayList<Field>(x);
//        lista.add(0, new EmptyF());
//        System.out.println(lista.size());
     }
     
     
}
