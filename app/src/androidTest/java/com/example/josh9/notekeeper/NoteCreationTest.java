package com.example.josh9.notekeeper;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;

@RunWith(AndroidJUnit4.class)
public class NoteCreationTest {
    @Rule
   public ActivityTestRule<NoteListActivity> mNoteListActivityActivityRule =
            new ActivityTestRule<>(NoteListActivity.class);

    @Test
    public void createNewNote(){
 //       ViewInteraction fabNewNote = onView(withId(R.id.fab));
 //       fabNewNote.perform(click());
        onView(withId(R.id.fab)).perform(click());
        onView(withId(R.id.text_note_title)).perform(typeText("Test note title"));
        onView(withId(R.id.text_note_text)).perform(typeText("This is the body of our test note"),
            closeSoftKeyboard());
    }
}