package mate.academy.boot.bootdemo.repository;

import mate.academy.boot.bootdemo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
