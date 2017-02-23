import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

import com.gmail.dm0275.model.Country;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

/**
 * Created by dmancilla on 2/23/2017.
 */
public class JsonTest {

    @Test
    public void testConvertJson() {
        Country country = new Country();
        country.setId(1);
        country.setCountryName("USA");
        country.setPopulation(500000);

        Gson gson = new Gson();
        String countryJson = gson.toJson(country);

        try {
            FileWriter fileWriter = new FileWriter("D:\\Users\\dmancilla\\Documents\\Country.json");
            fileWriter.write(countryJson);
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(countryJson);
        assertNotNull(countryJson);
    }

    @Test
    public void readFromJson() {
        try {
            JsonReader jsonReader = new JsonReader(new FileReader("D:\\Users\\dmancilla\\Documents\\Country.json"));
            Gson gson = new Gson();
            Country country = gson.fromJson(jsonReader, Country.class);
            assertEquals("USA",country.getCountryName());
            assertEquals(1,country.getId());
            assertEquals(500000,country.getPopulation());
            System.out.println(country.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
