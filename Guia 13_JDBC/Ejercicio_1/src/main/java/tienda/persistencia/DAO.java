
package tienda.persistencia;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public abstract class DAO {
    
    protected Connection conecion=null;
    protected ResultSet resultado=null;
    protected Statement sentencia=null;
    
//    private final String USER="root";
//    private final String PASSWORD="@123=Lvf";
//    private final String DATABASE="tienda";
//    private final String DRIVER="com.mysql.cj.jdbc.Driver";
    
    protected void conectarBase() throws ClassNotFoundException, SQLException{
        try{
//            Class.forName(DRIVER);
//            String urlBaaseDeDatos="jdbc:mysql://127.0.0.1:3306/"+DATABASE+"?useSSL=false";
            conecion=DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "@123=Lvf");
            
        }catch(SQLException ex){
            throw ex;
        }
    }
    protected void desconectarBase() throws Exception{
        try {
            if (resultado!=null) {
                resultado.close();
            }
            if (sentencia!=null) {
                sentencia.close();                        
            }
            if (conecion!=null) {
                conecion.close();
            }
                      
        } catch (Exception e) {
            throw e;
        }
    }
    protected void insertarModificarEliminar(String sql) throws ClassNotFoundException, SQLException, Exception{
        try {
            conectarBase();
            sentencia=conecion.createStatement();
            sentencia.executeUpdate(sql);
           
        } catch (ClassNotFoundException | SQLException e) {
            //conecion.rollback();
            /*Desconecta la linea anterior. Corre el sig script en WorkBench
            SET autocimmit=1;
            COMMIT;
            */
            throw e;
        }finally{
            desconectarBase();
        }
    }
    protected void consultarBase(String sql) throws Exception{
        try {
            conectarBase();
            sentencia=conecion.createStatement();
            resultado=sentencia.executeQuery(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
}
