package mx.edu.utez.proyectorecupera.models.marcas;

import mx.edu.utez.proyectorecupera.repository.DaoRepository;
import mx.edu.utez.proyectorecupera.utils.MySQLConnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoMarca implements DaoRepository<BeanMarca> {

    private Connection conn;
    private CallableStatement cstm;
    private ResultSet rs;

    @Override
    public List<BeanMarca> findAll() {

        try{
            List<BeanMarca> marcas = new ArrayList<>();
            conn = new MySQLConnection().connect();
            String query = "SELECT * FROM marcas;";
            cstm = conn.prepareCall(query);
            cstm.execute();
            rs = cstm.getResultSet();

            while(rs.next()){
                BeanMarca marca = new BeanMarca();
                marca.setId(rs.getLong("id"));
                marca.setNombre(rs.getString("marca"));
                marca.setFechaCreacion(rs.getString("fechaCreacion"));

                marcas.add(marca);

            }
            return marcas;

        }catch (SQLException e){
            Logger.getLogger(DaoMarca.class.getName())
                    .log(Level.SEVERE, "Error findAll" + e.getSQLState());
        }finally {
            close();
        }
    return null;
    }

    @Override
    public BeanMarca findOne(Long id) {
        return null;
    }

    @Override
    public String save(BeanMarca object) {
        return null;
    }

    @Override
    public String update(BeanMarca object) {
        return null;
    }

    @Override
    public String delete(Long id) {
        return null;
    }

    public void close(){
        try {
            if (conn != null) conn.close();
            if (cstm != null) cstm.close();
            if (rs != null) rs.close();
        } catch (SQLException e) {
            Logger.getLogger(DaoMarca.class.getName())
                    .log(Level.SEVERE, "Error al cerrar conexiones" + e.getSQLState());
        }
    }
}
