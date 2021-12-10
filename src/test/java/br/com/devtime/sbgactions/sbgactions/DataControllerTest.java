package br.com.devtime.sbgactions.sbgactions;

import br.com.devtime.sbgactions.sbgactions.rest.DataController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;


@SpringBootTest
class DataControllerTest {

    @Autowired
    DataController dataController;

    @Test
    void health() {
        Assertions.assertEquals( "HEALTH CHECK OK!", dataController.healthCheck());
    }

    @Test
    void version() {
        Assertions.assertEquals( "The actual version is 1.0.0", dataController.version());
    }

    @Test
    void nationsLength() {
        Integer nationsLength = dataController.getRandomNations().size();
        Assertions.assertEquals(10, nationsLength);
    }

    @Test
    void currenciesLength() {
        Integer currenciesLength = dataController.getRandomCurrencies().size();
        Assertions.assertEquals(20, currenciesLength);
    }

}