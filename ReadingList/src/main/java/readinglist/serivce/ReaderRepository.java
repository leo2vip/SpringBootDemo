package readinglist.serivce;

import org.springframework.data.jpa.repository.JpaRepository;
import readinglist.Entity.Reader;

/**
 * Created by qutf on 2017/11/21.
 */
public interface ReaderRepository extends JpaRepository<Reader, String> {
}
