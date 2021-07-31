package com.gadomski.dennis.rgt.database.repository;

import com.gadomski.dennis.rgt.database.model.Player;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaSpecificationExecutor<Player> {
}
