package readinglist.serivce;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import readinglist.Entity.Book;

import java.util.List;

/**
 * Created by qutf on 2017/11/17.
 */
public interface ReadingListRepository extends JpaRepository<Book,Long>{
    List<Book> findByReader(String reader);
}
