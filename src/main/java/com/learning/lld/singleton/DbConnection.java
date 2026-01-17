package com.learning.lld.singleton;

public class DbConnection {
    private static volatile DbConnection dbConnection;

    private DbConnection(){

    }

    public  static synchronized DbConnection getInstance(){
        if(dbConnection == null) {
            dbConnection = new DbConnection();
        }
        return dbConnection;
    }


    public static DbConnection getInstanceDoubleLocking(){
        if(dbConnection ==null){
            synchronized (DbConnection.class){
                if (dbConnection == null){
                    dbConnection = new DbConnection();
                }
            }
        }
        return dbConnection;
    }
}
