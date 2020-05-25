package assignment3;

import java.io.*;
import java.net.ServerSocket;
import java.net.*;
import java.util.*;

/**
 *
 * @author Halady Raghavendra Prabhu Student ID S10075084
 */
public class Client {

    public void sendPlayer(Player player) throws IOException {
        Socket s = new Socket("localhost", 4445);
        ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
        out.writeObject(player);
        s.close();
    }
    
    //Details from the csv file
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        Player player1 = new Player("stefan@gamemail.com", "SomebodyStopMe");
        player1.addAchievment("Boss fight", "0", "1");
        player1.addAchievment("Pleb missions", "7", "10");
        player1.addAchievment("Tutorial", "6", "6");
        player1.addAchievment("Noob missions", "3", "10");

//        player1 = null;       //Comment this line initially
        client.sendPlayer(player1);  
    }
}

/*
Comment the line which says player1 = null;
Run the Server.java
Run the Client.java
Uncomment line number 32 in Client.java
Run the Client.Java
*/
