/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rizkirestu.latihanmvcjdbc.main;

import edu.rizkirestu.latihanmvcjdbc.database.KingsBarbershopDatabase;
import edu.rizkirestu.latihanmvcjdbc.entity.Pelanggan;
import edu.rizkirestu.latihanmvcjdbc.error.PelangganException;
import edu.rizkirestu.latihanmvcjdbc.service.PelangganDao;
import edu.rizkirestu.latihanmvcjdbc.view.MainView;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-1
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException{
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainView main = new MainView();
                    main.loadDatabase();
                    main.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
}
