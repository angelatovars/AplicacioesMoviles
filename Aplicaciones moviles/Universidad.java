public class Universidad {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan", 12345);
        Profesor profesor = new Profesor("María", "Informática");
        
        estudiante.reproducirCancion();
        
        System.out.println("Profesor " + profesor.getNombre() + " del departamento " + profesor.getDepartamento());
    }
}

class Persona {
    protected String nombre;
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

interface Reproductor {
    void reproducirCancion();
}

class Estudiante extends Persona implements Reproductor {
    private int numeroCarnet;
    
    public Estudiante(String nombre, int numeroCarnet) {
        super(nombre);
        this.numeroCarnet = numeroCarnet;
    }
    
    public int getNumeroCarnet() {
        return numeroCarnet;
    }
    
    public void setNumeroCarnet(int numeroCarnet) {
        this.numeroCarnet = numeroCarnet;
    }
    
    @Override
    public void reproducirCancion() {
        System.out.println(getNombre() + " está reproduciendo una canción...");
    }
}

class Profesor extends Persona {
    private String departamento;
    
    public Profesor(String nombre, String departamento) {
        super(nombre);
        this.departamento = departamento;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
