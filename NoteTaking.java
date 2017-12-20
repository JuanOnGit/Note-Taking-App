package main.java.Notes;

import java.util.ArrayList;
//import java.net.HttpURLConnection;
//import java.net.URL;
import java.util.List;

public class NoteTaking {
	
    private final long id; //This is the id.
    private final String body; //This is the note contents.
    
    //-------Alernative to using get or set methods---------------------
    //private String StringURL = null;
    //URL url = new URL("https://localhost:8080/api/notes");
    //HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    //------------------------------------------------------------------
    public NoteTaking(long id, String body) {
        this.id = id;
        this.body = body;
    }
    
    //GET
    public long getId() {
    	
    	//StringURL = "https://localhost:8080/?id=1";
        return id;
    }

    //POST
    public long setId() {
    	
    	return id;
    }
    
    //GET
    public String getBody() {
        return body;
    }
    
    //POST
    public String setBody() {
    	return body;
    }

    //GET
    //Utilize a List to retrieve all the notes.
	public static List<NoteTaking> getAllNotes() {
		List<NoteTaking> list = new ArrayList<>();
		
		
		return list;
	}

}


