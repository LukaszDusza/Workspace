package pl.lukaszdusza.handling;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pl.lukaszdusza.services.StatsService;
public class WriteToJSON {
	
	
	public static void generateJSON(String fileName) {
		
		
		ObjectMapper obm = new ObjectMapper();
		Map<String, Object> jsonMap = new LinkedHashMap<>();		
		StatsService statsService = new StatsService();
		
		
		for (int x = 0; x < statsService.getValues().length; x++) {
			
			jsonMap.put(statsService.getDateValues(x),
					statsService.getValue(x));
		}
		
		try {
			obm.writerWithDefaultPrettyPrinter().writeValue(
					new File("src/main/resources/"+ fileName), jsonMap);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(jsonMap);
	}
	
	

	/*public static void main(String[] args) {

		WriteToJSON dataBindingWrite = new WriteToJSON();
		dataBindingWrite.generateJOSN();

		ObjectMapper objectMapper = new ObjectMapper();

		Map<String, Object> linkedHashmapJSON = new LinkedHashMap<>();

		linkedHashmapJSON.put("person1",
				new Person(1, "Robert", "Lewandowski"));
		linkedHashmapJSON.put("person2", new Person(1, "Michal", "Pazdan"));
		linkedHashmapJSON.put("person3", new Person(1, "Kamil", "Grosicki"));

		
		 * mapJSON.put("key1", "lukasz"); mapJSON.put("key2", "Mariola");
		 * mapJSON.put("key3", "Sebastian"); mapJSON.put("booleanTrue", true);
		 * mapJSON.put("booleanFalse", false); mapJSON.put("StringArray", new
		 * String[]{"1", "2", "3"}); mapJSON.put("arrayObjects", new
		 * Person(2,"Mariola", "Nowak")); mapJSON.put("nestedObject", person);
		 * mapJSON.put("valueNull", null); mapJSON.put("date",
		 * LocalDateTime.now().toString());
		 

		try {
			objectMapper.writerWithDefaultPrettyPrinter().writeValue(
					new File("src/main/resources/mapJson.json"),
					linkedHashmapJSON);
		} catch (JsonGenerationException e) {

			e.printStackTrace();
		} catch (JsonMappingException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}*/

	/* #1 example of solution */


}
