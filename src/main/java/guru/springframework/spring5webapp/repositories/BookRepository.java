package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sounak on 22-06-2024.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
