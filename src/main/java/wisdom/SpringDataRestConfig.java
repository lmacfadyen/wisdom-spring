package wisdom;

import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;
//import org.springframework.http.MediaType;



/**
 * Created by larrymacfadyen on 2016-01-29.
 */
@Component
class SpringDataRestConfig {

    @Bean
    public RepositoryRestConfigurer repositoryRestConfigurer() {




        return new RepositoryRestConfigurerAdapter() {
            @Override
            public void configureRepositoryRestConfiguration(
                    RepositoryRestConfiguration config) {
                // Expose the id attribute over the REST interface
                config.exposeIdsFor(Quote.class);
                // Specify JSON instead of default HAL+JSON
                //config.setDefaultMediaType(MediaType.APPLICATION_JSON);
		 config.setDefaultPageSize(300);
            }
        };

    }

}