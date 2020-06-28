/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.*;
import db.db;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author huulo
 */
public class book_controller {
   Connection con;
    String url,dbname;
    PreparedStatement ps;
    ResultSet rs;
    public void Add( book book) throws SQLException{
        try {
            Connection con = db.ConnectSQLServer();
            ps = con.prepareStatement("insert into Book(BookName,Category,BookAuthor,BookPub,BookYearReleash,BookQuantity) values (?,?,?,?,?,?)");
            ps.setString(1, book.getName());
            ps.setString(2,book.getCategory());
            ps.setString(3,book.getPublisher());
            ps.setString(4, book.getYear());
            ps.setInt(5, book.getQuantity());
            ps.executeUpdate();
            
        } catch (ClassNotFoundException | SQLException ex) {
        }
    }
    public void Edit(book book) throws SQLException{
        try {
            Connection con = db.ConnectSQLServer();
            ps = con.prepareStatement("UPDATE Book set BookName = ?,BookAuthor =?, BookPub= ?, BookYearReleash =?, Category = ? where BookID = ? ");
            ps.setString(1, book.getName());
            ps.setString(2,book.getCategory());
            ps.setString(3,book.getPublisher());
            ps.setString(4, book.getYear());
            ps.setInt(5, book.getQuantity());
            ps.executeUpdate();
            
        } catch (ClassNotFoundException | SQLException ex) {
        }
    }
    public void Delete(book book) throws SQLException, ClassNotFoundException{
        
       try {
           Connection conn = db.ConnectSQLServer();
           ps = conn.prepareStatement("Delete Book where Id=?");
           ps.executeUpdate();
       } catch (ClassNotFoundException | SQLException ex) {
        }
    }
    }

