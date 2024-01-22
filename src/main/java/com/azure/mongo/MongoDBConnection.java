package com.azure.mongo;


import com.mongodb.client.MongoClient;

import com.mongodb.client.MongoClients;
 
public class MongoDBConnection {
 
    public static MongoClient createConnection() {

        String connectionString = "mongodb+srv://hbansal944:9017650030@cluster0.ue2iqkf.mongodb.net/himanshu?retryWrites=true&w=majority";

        return MongoClients.create(connectionString);

    }

}
