package Clase;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda {
	
	public static void main(String[] args) {

	        List<String> cursos = new ArrayList<>();
	        cursos.add("curso de fisica");
	        cursos.add("curso de java 8");
	        cursos.add("curso de geometria del espacio");
	        cursos.add("curso de historia universal");

	        cursos.sort(new CompararClase3());

	        cursos.forEach(x -> System.out.println(x));
	    }
	}


	class CompararClase3 implements Comparator<String> {

	    @Override
	    public int compare(String o1, String o2) {
	        if(o1.length() > o2.length()){
	            return 1;
	        } else if (o1.length() < o2.length()){
	            return -1;
	        }
	        return 0;
	    }
}


