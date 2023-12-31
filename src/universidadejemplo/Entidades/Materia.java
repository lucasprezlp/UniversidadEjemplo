
package universidadejemplo.Entidades;


public class Materia {
    public int idMateria;
    public String nombre;
    public int anio; 
    public boolean activo;

    public Materia() {
    }

    public Materia(String nombre, int anio, boolean activo) {
        this.nombre = nombre;
        this.anio = anio;
        this.activo = activo;
    }
 
    public Materia(int idMateria, String nombre, int anio, boolean activo) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
        this.activo = activo;
    }

    public Materia(int idMateria) {
        this.idMateria = idMateria;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
