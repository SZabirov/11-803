package com.company.v2;

public class NoteUser {
    @InjectImpl
    private Notepad notepad;

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    void takeNotes(int count) {
        for (int i = 0; i < count; i++) {
            notepad.addNote("Some note");
        }
    }
}
