package proyecto;

import java.sql.Connection;//i establece conexion a una base de datos
import java.sql.DriverManager;//c son los controladores JDBC
import java.sql.PreparedStatement;//i para realizar consultas parametrizadas
import java.sql.ResultSet;//i para el conjunto de resultados de una consulta SQl
import java.sql.SQLException;//c manejo de excepciones ocurridas en SQL
import java.util.logging.Logger;//registrar mensajes
import java.util.logging.Level;//establecer el nivel de registro


public class ConexionBD {
    //se inicia un objeto Connection
    Connection conexionUsuariosDB = null;
    //metodos
    public void conectar(){
        try{
            conexionUsuariosDB = DriverManager.getConnection("jdbc:sqlite:TorryPlazaDB.db");
            if (conexionUsuariosDB!=null){
                System.out.println("-------");//simbolo de conexion establecida
            }
        }catch(SQLException ex){
            //Imprime mensaje de error
            System.err.println("No se ha podido conectar a la base de datos\n"+ex.getMessage());
        }
    }
    public void cerrar(){
        try {
            conexionUsuariosDB.close();
            System.out.println("---x---");//simbolo de conexion cerrada
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void lectura(){
        conectar();
        try{
            //Se crea un objeto PreparedStatement para ejecutar una consulta SQL
            PreparedStatement st=conexionUsuariosDB.prepareStatement("select * from C_Usuarios");
            //Ejecutar la consulta y obtener resultados
            ResultSet result=st.executeQuery();
            //Mueve el cursor a la siguiente fila
            while(result.next()){
                System.out.print("Codigo: ");
                System.out.println(result.getInt("Cod_user"));
                System.out.print("Apellidos: ");
                System.out.println(result.getString("Ape_User"));
                System.out.print("Nombres: ");
                System.out.println(result.getString("Nom_User"));
                System.out.print("Sexo: ");
                System.out.println(result.getString("Sexo_user"));
                System.out.print("DNI: ");
                System.out.println(result.getInt("DNI_User"));                
                System.out.print("Correo: ");
                System.out.println(result.getString("Cor_User"));
                System.out.print("Celular: ");
                System.out.println(result.getInt("Cel_User"));
                System.out.print("Saldo: ");
                System.out.println(result.getDouble("Saldo_User"));
                System.out.print("Token: ");
                System.out.println(result.getInt("Token_User"));                
                System.out.println("");
            }
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
        cerrar();
    }   
     //public void saveAlumno(C_Usuarios newuser){
       // try {
         //   PreparedStatement st = connect.prepareStatement("insert into alumnos (nombre, apellidos) values (?,?)");
           // st.setString(1, alumno.getNombre());
         //   st.setString(2, alumno.getApellidos());
          //  st.execute();
        //} catch (SQLException ex) {
         //   System.err.println(ex.getMessage());
        //}

    //}
    public void registrar(C_Usuarios newuser){
        conectar();
        try{
            //Se crea un objeto PreparedStatement para ejecutar una consulta SQL
            PreparedStatement st=conexionUsuariosDB.prepareStatement("insert into C_Usuarios (Cod_user,Ape_User,Nom_User,Sexo_user,DNI_User,Cor_User,Cel_User,Saldo_User,Token_User) values (?,?,?,?,?,?,?,?,?)");
            //insercion mediante parametros ???
            st.setInt(1,newuser.getCod_Usuario());
            st.setString(2, newuser.getApellidos());
            st.setString(3, newuser.getNombres());
            st.setString(4, newuser.getSexo());
            st.setInt(5, newuser.getDNI());   
            st.setString(6, newuser.getCorreo());   
            st.setInt(7, newuser.getCelular());   
            st.setDouble(8, newuser.getSaldo());   
            st.setInt(9, newuser.getToken());   
            
            //Ya que esta sentencia no devuelve datos se debe usar executeUpdate
            st.executeUpdate();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
        cerrar();
    }  
    public void busqueda(){
        conectar();
        try{
            //Se crea un objeto PreparedStatement para ejecutar una consulta SQL
            //buscaremos por Nombre
            PreparedStatement st=conexionUsuariosDB.prepareStatement("select * from C_Usuarios where Cod_User=?");
            st.setInt(1, 75301939);
            //Ejecutar la consulta y obtener resultados
            ResultSet result=st.executeQuery();
            //Mueve el cursor a la siguiente fila
            while(result.next()){
                System.out.print("Codigo: ");
                System.out.println(result.getInt("Cod_user"));
                System.out.print("Apellidos: ");
                System.out.println(result.getString("Ape_User"));
                System.out.print("Nombres: ");
                System.out.println(result.getString("Nom_User"));
                System.out.print("Sexo: ");
                System.out.println(result.getString("Sexo_user"));
                System.out.print("DNI: ");
                System.out.println(result.getInt("DNI_User"));                
                System.out.print("Correo: ");
                System.out.println(result.getString("Cor_User"));
                System.out.print("Celular: ");
                System.out.println(result.getInt("Cel_User"));
                System.out.print("Saldo: ");
                System.out.println(result.getDouble("Saldo_User"));
                System.out.print("Token: ");
                System.out.println(result.getInt("Token_User"));         
            }
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
        cerrar();
    }
    public void eliminar(){
        conectar();
        try{
            //Se crea un objeto PreparedStatement para ejecutar una consulta SQL
            PreparedStatement st=conexionUsuariosDB.prepareStatement("delete from C_Usuarios");         
            //Ya que esta sentencia no devuelve datos se debe usar executeUpdate
            st.executeUpdate();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
        cerrar();
    }
}    
