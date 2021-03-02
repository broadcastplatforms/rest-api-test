import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StationApiTest {

    public static final String URL = "https://my-json-server.typicode.com/broadcastplatforms/rest-api-test";

    @BeforeEach
    void setUp() {
        RestAssured.baseURI = URL;
    }

    @DisplayName("Get all stations and verify size of response")
    @Test()
    void testGetStations() {
        // create a test which gets all stations by calling the /stations endpoint
    }

    @DisplayName("Get the station with id 1")
    @Test()
    void testGetStation() {
        // create a test which gets the station with id 1
    }

    @DisplayName("Update the name of a station")
    @Test()
    void testUpdateStation() {
        // create a test which updates the name of Capital FM (ID 1) to Capital London
    }
}
