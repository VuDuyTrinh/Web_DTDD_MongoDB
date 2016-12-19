/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import Model.sanpham;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SUALAPTOP24h.NET
 */
public class Demo {
    public ArrayList<sanpham> DanhSachHocSinh(){
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver"); //Không hiện mấy dòng lỗi nhỏ
        mongoLogger.setLevel(Level.SEVERE); // 

        MongoClientURI uri = new MongoClientURI("mongodb://Nhom6_CCMT:nhom6ccmt@ds139278.mlab.com:39278/ql_cuahangdtdd");
        MongoClient mongoClient = new MongoClient(uri);
         DB db = mongoClient.getDB("ql_cuahangdtdd");
         DBCollection col = db.getCollection("LoaiSP");
        DBCursor contro = col.find();
        ArrayList<sanpham> list = new ArrayList<>();
        while (contro.hasNext()) {
            sanpham sp = new sanpham();
            BasicDBObject obj2 = (BasicDBObject) contro.next();
            sp.setMaid(obj2.getString("_id"));
            sp.setId(obj2.getInt("Id"));
            sp.setTenloai(obj2.getString("TenLoai"));
            list.add(sp);
        }
        return list;
    }
     public static void main(String[] args) {

        Logger mongoLogger = Logger.getLogger("org.mongodb.driver"); //Không hiện mấy dòng lỗi nhỏ
        mongoLogger.setLevel(Level.SEVERE); // 

        MongoClientURI uri = new MongoClientURI("mongodb://Nhom6_CCMT:nhom6ccmt@ds139278.mlab.com:39278/ql_cuahangdtdd");
        MongoClient mongoClient = new MongoClient(uri); //kết nối với chuỗi

        System.out.println("List Admin:");//in ra

        DB db = mongoClient.getDB("ql_cuahangdtdd"); //lấy database qlcuahang

        DBCollection dept = db.getCollection("Admin"); //lấy bảng admin
        DBCursor c = dept.find();
        
        BasicDBObject obj = (BasicDBObject) c.next(); //đối tượng cursor để lấy dữ liệu
        //in ra
         
      System.out.println("id: " + obj.getString("_id") + " IDTK: " + obj.getString("_IDTK") + " Tên tk: " + obj.getString("TenTK")+ " Mật khẩu: " + obj.getString("MatKhau"));
    
  
//       DBCollection col = db.getCollection("LoaiSP");
//        DBCursor contro = col.find();
//        ArrayList<sanpham> list = new ArrayList<>();
//        while (contro.hasNext()) {
//            sanpham sp = new sanpham();
//            BasicDBObject obj2 = (BasicDBObject) contro.next();
//            sp.setMaid(obj2.getString("_id"));
//            sp.setId(obj2.getInt("Id"));
//            sp.setTenloai(obj2.getString("TenLoai"));
//            list.add(sp);
//        }
//        
//        System.out.println("DS sp:");
//        for(sanpham sp: list) //Lay san pham trong list
//        {
//            System.out.println("ID big:" + sp.getMaid() + " ID nho: " + sp.getId() + " Ten loai: " + sp.getTenloai());
//        }
//                    
 
    }
}
