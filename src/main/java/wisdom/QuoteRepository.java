package wisdom;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

//@RepositoryRestResource(collectionResourceRel = "quotes", path = "quotes")
public interface QuoteRepository extends MongoRepository<Quote, String> {

	List<Quote> findByAuthor(@Param("author") String author);

}