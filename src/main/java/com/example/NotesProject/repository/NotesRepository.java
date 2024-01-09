package com.example.NotesProject.repository;

import com.example.NotesProject.entity.Notes;
import com.example.NotesProject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NotesRepository extends JpaRepository<Notes,Integer> {
     public List<Notes> findByUser(User user);


}
