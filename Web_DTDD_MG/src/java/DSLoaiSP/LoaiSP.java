/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSLoaiSP;

import DBConnect.connect;
import Model.sanpham;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SUALAPTOP24h.NET
 */
public class LoaiSP {

    connect con = new connect();
    DB db = con.KetNoi();

    public ArrayList<sanpham> DSloaisp() {
        DBCollection col = db.getCollection("LoaiSP");
        DBCursor contro = col.find();
        ArrayList<sanpham> list = new ArrayList<>();
        while (contro.hasNext()) {
            sanpham sp = new sanpham();
            BasicDBObject obj = (BasicDBObject) contro.next();
            sp.setMaid(obj.getString("_id"));
            sp.setId(obj.getInt("id"));
            sp.setTenloai(obj.getString("tenloai"));
            list.add(sp);
        }
        return list;
    }

    public static void main(String[] args) {
        Logger mongLogger = Logger.getLogger("org.mongodb.driver");
        mongLogger.setLevel(Level.SEVERE);
        LoaiSP x = new LoaiSP();
        for (sanpham y : x.DSloaisp()) {
            System.out.println(y.getTenloai());
        }
    }
}