package com.example.lab.crm;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class MongoTestClass {

    public static void main(String[] args) {
        try (MongoClient mongoClient = MongoClients.create("mongodb://admin:123@localhost:27017")) {
            System.out.println("MongoDB connection successful");
        } catch (Exception e) {
            System.out.println("MongoDB connection failed");
            e.printStackTrace();
        }
    }


}
