
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author m
 */


public abstract class BaseDeDatos {
    
       private static List<Alumno> alumnos = new ArrayList<>();
       private static int contador=0;

	public static List<Alumno> getAlumnos() {
		return alumnos;
	}

	public static void setAlumnos(List<Alumno> alumnos) {
		BaseDeDatos.alumnos = alumnos;
	}
       
       
       public static void añadirAlumno(Alumno a){
	       
       alumnos.add(a);
       if (alumnos.add(a)){
       contador++;}
       
       }
       
       public static String visualizarAlumnos(){
	       String[] s=new String[alumnos.size()];
	       String s1="";
	       int i;
	       int j;
	       
	       for(i=0;i<alumnos.size();i++){
		       
		       s[i]=(alumnos.get(i).getNombre()+"\n");
		     
	       }
	       for(j=0;j<alumnos.size();j++){
	      s1+=s[j];}
	       return s1;
       }
       

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		BaseDeDatos.contador = contador;
	}
	
       
       
       
       
}
