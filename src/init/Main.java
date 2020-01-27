package init;

import configuration.ConfigJson;
import generator.GeneratorHtml;

public class Main {
	
	public static void main(String[] args) {
		
		ConfigJson configJson = new ConfigJson();
		System.out.println(configJson.zoo.getSoigneur());
        System.out.println(configJson.zoo.getEnclos().get(0).getSoigneur());
        
        GeneratorHtml gh = new GeneratorHtml(configJson.zoo);
        System.out.println(gh.GetHtml());
	}
	
}
