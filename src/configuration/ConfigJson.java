package configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import eMProject.EMProjectFactory;
import eMProject.Enclos;
import eMProject.Soigneur;
import eMProject.Zoo;
import eMProject.impl.EMProjectFactoryImpl;

public class ConfigJson {
	
	public Zoo zoo;

	public ConfigJson() {
		JSONParser jsonParser = new JSONParser();
		
		EMProjectFactory empf = new EMProjectFactoryImpl();
		
	      try {
	         //Parsing the contents of the JSON file
	         JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("C:\\Users\\Maxence Bouet\\Desktop\\S9\\EMProject\\src\\init\\configuration.json"));
	         
	         JSONObject zooJSON = (JSONObject) jsonObject.get("zoo");
	         
	         zoo = empf.createZoo();
	         zoo.setId(Math.toIntExact((long) zooJSON.get("id")));
	         
	         
	         
	         JSONArray arraySoigneursJSON = (JSONArray) zooJSON.get("soigneurs");
	         
	         for (int i = 0; i < arraySoigneursJSON.size(); i++) {
	        	 JSONObject soigneursJSON = (JSONObject) arraySoigneursJSON.get(i);
	        	 JSONObject soigneurJSON = (JSONObject) soigneursJSON.get("soigneur");
	        	 
	        	 Soigneur soigneur = empf.createSoigneur();
	        	 soigneur.setId(Math.toIntExact((long) soigneurJSON.get("id")));
	        	 soigneur.setZoo(zoo);
	         }
	         
	         
	         
	         JSONArray arrayEnclossJSON = (JSONArray) zooJSON.get("encloss");
	         
	         for (int i = 0; i < arrayEnclossJSON.size(); i++) {
	        	 JSONObject enclossJSON = (JSONObject) arrayEnclossJSON.get(i);
	        	 JSONObject enclosJSON = (JSONObject) enclossJSON.get("enclos");
	        	 
	        	 Enclos enclos = empf.createEnclos();
	        	 enclos.setId(Math.toIntExact((long) enclosJSON.get("id")));
	        	 enclos.setZoo(zoo);
	        	 
	        	 JSONArray arraySoigneurssJSON = (JSONArray) enclosJSON.get("soigneurs");
	        	 
	        	 for (int j = 0; j < arraySoigneurssJSON.size(); j++) {
	        		 JSONObject soigneurJSON = (JSONObject) arraySoigneurssJSON.get(j);
	        		 
	        		 List<Soigneur> soigneurs = zoo.getSoigneur();
	        		 
	        		 for (Soigneur s : soigneurs) {
	        			 if (s.getId() == Math.toIntExact((long) soigneurJSON.get("id"))) {
	        				 enclos.getSoigneur().add(s);
	        				 s.getEnclos().add(enclos);
	        			 }
	        		 }
	        		 
	        		 
//	        		 Soigneur soigneur = empf.createSoigneur();
//	        		 soigneur.setId(Math.toIntExact((long) soigneurJSON.get("id")));
//	        		 soigneur.setZoo(zoo);
	        	 }
	        	 
	         }
	         
	        
	         
	         /*
	         for(Iterator iterator = jsonObject.keySet().iterator(); iterator.hasNext();) {
	        	    String key = (String) iterator.next();
	        	    System.out.println(jsonObject.get(key) + "\n");
	         }
	         */
	         
	         //System.out.println(zoo);
	      } catch (FileNotFoundException e) {
	            e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      } catch (ParseException e) {
	         e.printStackTrace();
	      }
	}
	
}
