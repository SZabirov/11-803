package com.company.v1;

public class Application {
    public static void main(String[] args) {
        Notepad n = new NotepadImpl();
        NoteUser noteUser = new NoteUser(n);
        noteUser.takeNotes(3);
    }
}
