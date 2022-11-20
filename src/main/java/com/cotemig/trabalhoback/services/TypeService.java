package com.cotemig.trabalhoback.services;

import com.cotemig.trabalhoback.models.Type;
import com.cotemig.trabalhoback.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TypeService {
    @Autowired
    private TypeRepository typeRepository;

    public Type save (Type type) {
        Type newType = typeRepository.save(type);
        return newType;
    }

    public List<Type> getAll () {
        List<Type> types = typeRepository.findAll();
        return types;
    }

    public Optional<Type> getById (long typeId) {
        Optional<Type> type = typeRepository.findById(typeId);
        return type;
    }
}
