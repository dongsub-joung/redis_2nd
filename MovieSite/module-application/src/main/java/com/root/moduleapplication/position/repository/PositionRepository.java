package com.root.moduleapplication.position.repository;

import com.root.moduledomain.position.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, Long> {
}
