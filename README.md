# Task-4-java-notes-app
## Objective
Create a simple text-based note-takingapp using java file I/O
## Features
- Add new notes
- View all saved notes
- Data is persisted using FileWriter & BufferedReader
## Concepts used
- File I/O
- Exception handling with try-catch
- CLI interaction using Scanner
## Explanation
FileWriter -> to write to files
FileReader, BufferedReader -> to read files
IOException, FileNotFoundException -> for error handling
Scanner -> to take input from the user
FILE_NAME= the name of the file where notes are saved
Scanner sc = used for reading user input from the console
A loop that keeps showing a menu until the user chooses option 3(Exit)
Option 1 -> adds a new note 
Asks the user to type a note and saves it in a String.
FileWriter(FILE_NAME,true) opens the file in append mode(adds to the end).
writer.write adds the note to the file with a newline
try-with-resources auto-closes the file.
If something goes wrong, it catches the error.
Option 2 -> shows all notes
Opens the note.txt file for reading.
Users BufferedReader to read one line at a time
readLine() reads each note
Prints each note with a - in front
If the file doesn't exist yet, it shows a message
If some other file error happens, it prints the error message
Option 3 -> exits the app
## key concepts
- File Writing - FileWriter in addNote()
- File Reading - BufferedReader in viewNotes()
- Exception handling - try-catch blocks for file operations
- Looping menu - do-while in main()
- User input - Scanner reads input from console

