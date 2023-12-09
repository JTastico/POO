package proyecto;

public class C_Personal extends Cuentas{
    //definiendo variables
    private int Cod_Personal=0;
    private String Puesto="";
    //constructor
    public C_Personal(String Apellidos,String Nombres,String Sexo,int DNI,String Correo,int Celular,int Cod_Personal,String Puesto){
        super(Apellidos,Nombres,Sexo,DNI,Correo,Celular);
        this.Cod_Personal=Cod_Personal;
        this.Puesto=Puesto;
    }
    //getters and setters

    public int getCod_Personal() {
        return Cod_Personal;
    }

    public void setCod_Personal(int Cod_Personal) {
        this.Cod_Personal = Cod_Personal;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }    
}
