package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sounak on 23-06-2024.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
