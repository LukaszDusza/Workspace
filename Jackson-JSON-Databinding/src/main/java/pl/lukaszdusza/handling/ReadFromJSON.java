package pl.lukaszdusza.handling;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ReadFromJSON {

	public static void main(String[] args) {

		ObjectMapper objectMapper = new ObjectMapper();

		ClassLoader classLoader = ReadFromJSON.class.getClassLoader();

		try {

			Map<String, Object> mapJSON = objectMapper.readValue(
					new File(classLoader.getResource("mapJson.json").getFile()),
					new TypeReference<Map<String, Object>>() {

					});
			
			System.out.println(mapJSON);
			
			
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
