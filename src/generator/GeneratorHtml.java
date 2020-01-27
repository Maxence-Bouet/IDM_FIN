package generator;

import eMProject.Enclos;
import eMProject.Soigneur;
import eMProject.Zoo;

public class GeneratorHtml {
	
	private String html;

	public GeneratorHtml(Zoo zoo) {
		html = "";
		this.putH1("Zoo", zoo.getId());
		
		for (Enclos enclos : zoo.getEnclos()) {
			this.putH2("Enclos", enclos.getId());
		}
		
		this.body();
	}
	
	public String GetHtml() {
		return this.html;
	}
	
	private void add(String message) {
		html += message;
	}
	
	private void putH1(String name, int id) {
		this.add("<h1>" + name + " numero " + id + "</h1>\r\n");
	}
	
	private void putH2(String name, int id) {
		this.add("<h2>" + name + " numero " + id + "</h2>\r\n");
	}
	
	private void putH3(String name, int id) {
		this.add("<h3>" + name + " numero " + id + "</h3>\r\n");
	}
	
	private void body() {
		html = "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"    <head>\r\n" + 
				"        <meta charset=\"utf-8\" />\r\n" + 
				"        <title>Zoo</title>\r\n" + 
				"    </head>\r\n" + 
				"\r\n" + 
				"    <body>\r\n" + 
				html +
				"    </body>\r\n" + 
				"</html>";
	}
}
