package proyecto;

public class C_Usuarios extends Cuentas{
    //definiendo variables
    private int Cod_Usuario=0;
    private int Saldo=0;
    private int Token=0;
    //constructor
    public C_Usuarios(String Apellidos,String Nombres,String Sexo,int DNI,String Correo,int Celular,int Cod_Usuario,int Saldo,int Token){
        super(Apellidos,Nombres,Sexo,DNI,Correo,Celular);
        this.Cod_Usuario=Cod_Usuario;
        this.Saldo=Saldo;
        this.Token=Token;
    }
    //getters and setters
    public int getCod_Usuario() {
        return Cod_Usuario;
    }

    public void setCod_Usuario(int Cod_Usuario) {
        this.Cod_Usuario = Cod_Usuario;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

    public int getToken() {
        return Token;
    }

    public void setToken(int Token) {
        this.Token = Token;
    }
    
    //metodos
    public void guardarUser(){
        ConexionBD con = new ConexionBD();
        con.registrar(this);
    }
}
