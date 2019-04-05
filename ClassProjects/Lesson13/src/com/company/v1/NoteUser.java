package com.company.v1;

public class NoteUser {
    private Notepad notepad;
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public NoteUser(Notepad notepad) {
        this.notepad = notepad;
    }

    void takeNotes(int count) {
        for (int i = 0; i < count; i++) {
            notepad.addNote("Some note");
        }
    }
}
