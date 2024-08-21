package mx.edu.utez.proyectorecupera.models.autos;

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

public class DaoAuto implements DaoRepository<BeanAuto> {
    private Connection conn;
    private CallableStatement cstm;
    private ResultSet rs;

    @Override
    public List<BeanAuto> findAll(){
        try{
            List<BeanAuto> autos = new ArrayList<>();
            conn = new MySQLConnection().connect();
            String query = "Select * from autos;";
            cstm = conn.prepareCall(query);
            cstm.execute();
            rs = cstm.getResultSet();

            while(rs.next()){
                BeanAuto auto = new BeanAuto();
                auto.setId(rs.getLong("id"));
                auto.setModelo(rs.getString("modelo"));
                auto.setColor(rs.getString("color"));
                auto.setPlacas(rs.getString("placas"));
                auto.setTipo(rs.getString("tipo"));
                auto.setFechaCreacion(rs.getString("fechaCreacion "));
                auto.setEstado(rs.getBoolean("estado"));
                auto.getIdmarca().setId(rs.getLong("id"));
                auto.getIdmarca().setNombre(rs.getString(("marca")));
                auto.getIdmarca().setFechaCreacion(rs.getString("fechaCreacion"));

                autos.add(auto);
            }
            return autos;
        }catch(SQLException e){
            Logger.getLogger(DaoAuto.class.getName())
                    .log(Level.SEVERE, "Error findAll" + e.getSQLState());
        }finally {
            close();
        }
        return  null;
    }

    @Override
    public BeanAuto findOne(Long id){
        return null;
    }
    @Override
    public String save(BeanAuto auto){
        return null;
    }
    @Override
    public String update(BeanAuto auto){
        return null;
    }
    @Override
    public String delete(Long id){
        return null;
    }

    public void close(){
        try {
            if (conn != null) conn.close();
            if (cstm != null) cstm.close();
            if (rs != null) rs.close();
        }catch (SQLException e){
            Logger.getLogger(DaoAuto.class.getName())
                    .log(Level.SEVERE, "Error closeConnection" + e.getMessage());
        }
    }
}
