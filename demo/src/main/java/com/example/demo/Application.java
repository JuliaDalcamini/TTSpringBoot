@EnableJpaRepositories("com.baeldung.persistence.repo") 
@EntityScan("com.baeldung.persistence.model")
@SpringBootApplication 
public class Application {
   ...
}