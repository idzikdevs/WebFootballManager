package pl.idzikdev.webfootballmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.idzikdev.webfootballmanager.model.Player;

public interface PlayerRepository extends JpaRepository<Player,Long> {
}
