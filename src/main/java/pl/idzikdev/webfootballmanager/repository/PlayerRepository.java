package pl.idzikdev.webfootballmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.annotation.Async;
import pl.idzikdev.webfootballmanager.model.Player;

import java.util.Optional;

public interface PlayerRepository extends JpaRepository<Player,Long> {
    String REPORT_BY_ISBN="select * from players where hash=?1";
    @Async
    @Query(value = REPORT_BY_ISBN,nativeQuery = true)
    Optional<Player> findByHash(String hash);
}
