package com.example.Act5MiravetePerezJuan.service;

import com.example.Act5MiravetePerezJuan.model.Editorial;
import com.example.Act5MiravetePerezJuan.repository.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorialServiceImp implements EditorialService {

    @Autowired
    private EditorialRepository editorialRepository;

    @Override
    public Editorial agregarEditorial(Editorial editorial) {
        return editorialRepository.save(editorial);
    }
}
