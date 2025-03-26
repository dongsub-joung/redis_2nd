package com.root.moduleapplication.position.service;

import com.root.moduleapplication.position.repository.PositionRepository;
import com.root.moduledomain.position.Position;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PositionService {
    private final PositionRepository positionRepository;

    @Transactional
    public List<Position> findAll() {
        return positionRepository.findAll();
    }

    @Transactional
    public Position save(Position position) {
        return positionRepository.save(position);
    }

    @Transactional
    public Position findById(Long id) {
        return positionRepository.findById(id).orElse(null);
    }

    @Transactional
    public void delete(Position position) {
        positionRepository.delete(position);
    }
}

