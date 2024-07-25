import java.util.Date;
public class cls_Persona {
    // Private attributes
    private int cedula;
    private String nombre;
    private char sexo;
    private char eCivil;
    private String Ocupacion;
    private String Gusto_Musical;
    private String Creencia;
    private String Gusto_Culinario;
    private String Genero;
    private boolean Seleccionado;


    //Para ver si ya fue elegido


    public boolean isSeleccionado() {
        return Seleccionado;
    }

    public void setSeleccionado(boolean seleccionado) {
        Seleccionado = seleccionado;
    }

    private Date fecNac;

    // Creates default constructor
    public cls_Persona() {  }

    // Creates parametrized constructor
    public cls_Persona(int cedula, String nombre, char sexo, char eCivil, Date fecNac, String Ocupacion,String Gusto_Musical,String Creencia,String Gusto_Culinario,String Genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.sexo = sexo;
        this.eCivil = eCivil;
        this.fecNac = fecNac;
        this.Ocupacion = Ocupacion;
        this.Gusto_Musical = Gusto_Musical;
        this.Creencia = Creencia;
        this.Gusto_Culinario = Gusto_Culinario;
        this.Genero = Genero;
    }

    // Getters and Setters methods
    public int getCedula() {
        return this.cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char geteCivil() {
        return this.eCivil;
    }

    public void seteCivil(char eCivil) {
        this.eCivil = eCivil;
    }

    public Date getFecNac() {
        return this.fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

//    public int getEdad() {
//        return new Date().getYear() - this.fecNac.getYear();
//    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        Ocupacion = ocupacion;
    }

    public String getGusto_Musical() {
        return Gusto_Musical;
    }

    public void setGusto_Musical(String gusto_Musical) {
        Gusto_Musical = gusto_Musical;
    }

    public String getCreencia() {
        return Creencia;
    }

    public void setCreencia(String creencia) {
        Creencia = creencia;
    }


    public String getGusto_Culinario() {
        return Gusto_Culinario;
    }

    public void setGusto_Culinario(String gusto_Culinario) {
        Gusto_Culinario = gusto_Culinario;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }
}

