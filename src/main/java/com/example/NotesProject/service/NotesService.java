package com.example.NotesProject.service;

import com.example.NotesProject.entity.Notes;
import com.example.NotesProject.entity.User;

import java.util.List;

public interface NotesService {
    public Notes saveNotes(Notes notes);

    public Notes getNotesById(int id);

    public List<Notes> getNotesByUser(User user);

    public Notes updateNotes(Notes notes);

    public Boolean deleteNotes(int id);

}
