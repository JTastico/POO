package proyecto;

public abstract class Cuentas {
    //definiendo variables
    private String Apellidos="";
    private String Nombres="";    
    private String Sexo="";
    private int DNI=0;
    private String Correo="";
    private int Celular=0;
    
    //constructor
    public Cuentas(String Apellidos,String Nombres,String Sexo,int DNI,String Correo,int Celular){
        this.Apellidos=Apellidos;
        this.Nombres=Nombres;
        this.Sexo=Sexo;        
        this.DNI=0;
        this.Correo=Correo;
        this.Celular=Celular;
    }
    //getters and setters

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int Celular) {
        this.Celular = Celular;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
}
