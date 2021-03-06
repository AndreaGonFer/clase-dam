public class Alumno {
    
    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto; 
        if (nombre.length() < 3) {
            System.out.println("La longitud del nombre es inferior a 3 caracteres.");
        }
        numeroMatricula = numeroMatriculaAlumno;
        if (numeroMatricula.length() < 4) {
            System.out.println("La longitud de la matr?cula es inferior a 4 caracteres.");
        }
        edad = edadAlumno;
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " años");
    }
    
    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        String nombreAUsar = nombre;
        String numeroAUsar = numeroMatricula;
        if (nombre.length() > 3) {
            nombreAUsar = nombre.substring(0, 3);
        }
        if (numeroMatricula.length() > 4) {
            numeroAUsar = numeroMatricula.substring(0, 4);
        }
        return nombreAUsar + numeroAUsar;
    }
}
