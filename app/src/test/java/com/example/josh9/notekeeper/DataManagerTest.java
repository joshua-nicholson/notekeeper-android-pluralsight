package com.example.josh9.notekeeper;

import org.junit.Test;

import static org.junit.Assert.*;

public class DataManagerTest {

    @Test
    public void createNewNote() throws Exception{
        DataManager dm = DataManager.getInstance();
        final CourseInfo course = dm.getCourse("android_async");
        final String noteTitle = "Test not title";
        final String noteText = "This is the body of my test note";

        int noteIndex = dm.createNewNote();
        NoteInfo newNote = dm.getNotes().get(noteIndex);
        newNote.setCourse(course);
        newNote.setText(noteText);
        newNote.setTitle(noteTitle);

        NoteInfo compareNote = dm.getNotes().get(noteIndex);
        assertEquals(course, compareNote.getCourse());
        assertEquals(noteText, compareNote.getText() );
        assertEquals(noteTitle, compareNote.getTitle());

    }
}