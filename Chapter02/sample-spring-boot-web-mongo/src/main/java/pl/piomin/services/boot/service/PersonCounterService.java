package pl.piomin.services.boot.service;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Metrics;
import org.springframework.stereotype.Service;

@Service
public class PersonCounterService {

    // Spring Boot 1.x
    /*
	private final CounterService counterService;
	
    @Autowired
    public PersonCounterService(CounterService counterService) {
        this.counterService = counterService;
    }
     */

    private Counter add = Metrics.counter("services.person.add");
    private Counter del = Metrics.counter("services.person.deleted");

    public void countNewPersons() {
        add.increment();
    }

    public void countDeletedPersons() {
        del.increment();
    }

}
