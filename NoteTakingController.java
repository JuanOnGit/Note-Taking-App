package main.java.Notes;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NoteTakingController {


	    private static final String template = "Hello, %s!";
	    private final AtomicLong counter = new AtomicLong();
		@RequestMapping("/")
	    String get() {

	        //mapped to hostname:port/api/

	        return "Main Page";

	    }

	    //This is a test method.
	    @RequestMapping("/getContent")
	    public GetContent getContent(@RequestParam(value="name", defaultValue="0") String name){
	    	return new GetContent(counter.incrementAndGet(),
                    String.format(template, name));
	    }
	    
	    //Adds a new note.
	    //@RequestMapping(value = "/notes/{id}", method = RequestMethod.POST)
	    //public NoteTaking setId(@RequestParam(value="id", defaultValue="None") Long id) {
	        //return new NoteTaking(counter.incrementAndGet(),
	         //                   String.format(template, id));
	    //  }
	    
	    //Adds a new note
	    @RequestMapping(value = "/notes/{id}", method = RequestMethod.POST, headers = "Accept=application/json")
	    public String setId(@RequestParam(value="note", defaultValue="None") String note) {
	        return note;
	                            
	    }
	    
	    //Retrieves an existing note.
	    @RequestMapping(value = {"/notes/{id}", "api/notes/{id}"}, method=RequestMethod.GET, headers = "Accept=application/json")
	    public String getId(@RequestParam("id") String content) {
	        return content;
	    }
	    
	  //Gets all of the notes.
	    @RequestMapping(value = "/notes", method = RequestMethod.GET, headers = "Accept=application/json")
	    public List<NoteTaking> getAllNotes() {
	        return NoteTaking.getAllNotes();
	    }
	    
	    
	    //Gets the body of the note.
	    @RequestMapping(value = "/notes/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	    public NoteTaking notetaking(@RequestParam(value="body", defaultValue="None") String body) {
	        return new NoteTaking(counter.incrementAndGet(),
	                            String.format(template, body));
	    }
	    
	
	    
	 
	
}
