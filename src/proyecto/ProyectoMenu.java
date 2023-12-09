package proyecto;

public class ProyectoMenu {

    public static void main(String[] args) {
        //realizando la conexion a nuestra BASE DE DATOS
        ConexionBD con = new ConexionBD();
        con.lectura();
        
        //variables para el nuevo usuario - txtbox = casilleros a llenar interfaz
        //String Apellidos=txtbox01;
        //String Nombres=txtbox02;
        //String Sexo=txtbox03;
        //int DNI=txtbox04;
        //String Correo=txtbox05;
        //int Celular=txtbox06;
        //int Cod_Usuario=txtbox07;
        //int Saldo=0;
        //int Token=0;
        
        String Apellidos="d";
        String Nombres="d";
        String Sexo="d";
        int DNI=234;
        String Correo="d";
        int Celular=324;
        int Cod_Usuario=324;
        //saldo y token en 0 es preferible hacerlo con las otras operaciones
        
        C_Usuarios newuser = new C_Usuarios(Apellidos,Nombres,Sexo,DNI,Correo,Celular,Cod_Usuario,0,0);
        newuser.guardarUser();
    }
    
}
