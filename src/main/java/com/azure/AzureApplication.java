package com.azure;

import org.bson.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azure.mongo.MongoDBConnection;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

@SpringBootApplication
@RestController
public class AzureApplication {
	MongoClient mongoClient = MongoDBConnection.createConnection();
    MongoDatabase database = mongoClient.getDatabase("himanshu");
	
	
	  MongoCollection<Document> usersCollection = database.getCollection("users");
	
	
	@GetMapping("/message")
	public Document message() {
	      // Query the "users" collection to retrieve the inserted document
        Document retrievedUser = usersCollection.find(Filters.eq("name", "Himanshu Bansal")).first();
        System.out.println("Retrieved User: " + retrievedUser);
        mongoClient.close();
        
		
		return retrievedUser;
	}
	
	@GetMapping("/")
	public String start() {
		return "your deployed application is working.";
	}

	public static void main(String[] args) {

 
        // Your MongoDB operations go here
        
      
        
        // Insert a document into the "users" collection
//        Document newUser = new Document("name", "John Doe")
//                .append("email", "john.doe@example.com");
// 
//        usersCollection.insertOne(newUser);
//        System.out.println("Document inserted successfully!");
// 
  
 
 
       
		SpringApplication.run(AzureApplication.class, args);
	}

}
