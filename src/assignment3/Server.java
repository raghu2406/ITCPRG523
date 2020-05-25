
package assignment3;

import java.io.*;
import java.net.ServerSocket;
import java.net.*;
import java.util.*;

/**
 *
 * @author Halady Raghavendra Prabhu
 * Student ID S10075084
 */

public class Server {
    ArrayList <Player> players;
    ServerSocket server = null;
    Socket s = null;
    int counter = 0;

    public ArrayList<Player> receivePlayers() throws Exception {
        players = new ArrayList<Player> ();
        server = new ServerSocket(4445);

        while (true) {
            System.out.println("Waiting for client");

            s = server.accept();
            System.out.println("Client Connected!");



            ObjectInputStream in = new ObjectInputStream(s.getInputStream());
//            DataOutputStream out = new DataOutputStream(s.getOutputStream());

            Player tempPlayer =  (Player) in.readObject();
            if(tempPlayer == null) {
                break;
            } else {
                this.players.add(tempPlayer);
            }
            
            
        }
        s.close();
        return players;
    }

    public static void main(String[] args) throws Exception {
        Server server = new Server();

       ArrayList<Player> players = server.receivePlayers();
       
       for(int i = 0; i < players.size(); i++) {
           Player tempPlayer = players.get(i);
           System.out.println("Player{");
           System.out.println("\t\tusername=" + tempPlayer.getUserName() + "\n\t\ttagname=" + tempPlayer.getTagName());
            System.out.println("\t\t{");
            for(int j = 0; j < tempPlayer.arr.size(); j++) {
                Achievement tempAch = tempPlayer.arr.get(j);
                System.out.println("\t\t\t\tAchievement{Description="+ tempAch.getDescription() + ", Level=" + tempAch.getLevel() + ", Max=" + tempAch.getOutOfPossible());

            }
            System.out.println("\t\t}");
       }
        System.out.println("}");

       
    }
}

/*
Comment the line number 32 in Client.java
Run the Server.java
Run the Client.java
Uncomment line number 32 in Client.java
Run the Client.Java
*/