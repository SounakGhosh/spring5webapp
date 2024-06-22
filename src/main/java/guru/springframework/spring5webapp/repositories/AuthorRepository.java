package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sounak on 22-06-2024.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
