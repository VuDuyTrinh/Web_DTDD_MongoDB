/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnect;

import com.mongodb.DB;
import com.mongodb.MongoClient;

/**
 *
 * @author SUALAPTOP24h.NET
 */
public class connect {
     public DB KetNoi()
    {
		
         // Để kết nối tới MongoDb
         MongoClient mongoClient = new MongoClient( "ds139278.mlab.com" , 39278 );
			
         // Now connect to your databases
         DB db = mongoClient.getDB( "ql_cuahangdtdd" );

         return  db;
    }
}
