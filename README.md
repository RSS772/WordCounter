# Word Counter

The **Word Counter** is a Java-based application designed to efficiently process text files by removing stock words and counting the occurrences of unique words. This project demonstrates the use of modular programming principles and efficient data structures for text processing tasks.

## Features
- **Stock Word Removal**: Automatically filters out commonly used words (e.g., "the," "is," "and").
- **Unique Word Count**: Counts the frequency of unique words in the given text.
- **Modular Design**: Organized into multiple classes to handle tasks such as file reading, word processing, and output generation.
- **File Handling**: Utilizes Java's `BufferedReader` and `BufferedWriter` for efficient text file processing.
- **Performance Optimization**: Implements `HashSet` for quick lookups and filtering of stock words.

## Technologies Used
- **Programming Language**: Java
- **Libraries**: Java I/O (BufferedReader, BufferedWriter), Collections (HashSet)

## How to Use
1. Clone the repository:
   ```bash
   git clone https://github.com/RSS772/WordCounter
   ```
2. Open the project in your preferred IDE (e.g., Eclipse, IntelliJ).
3. Run the main class and provide the input text file path when prompted.
4. View the output, which includes a list of unique words and their occurrences.

## Project Structure
- `StockWordManager`: Handles loading and managing stock words.
- `FileReader`: Reads and processes the input text file.
- `WordCounter`: Counts occurrences of unique words.
- `OutputGenerator`: Writes the results to an output file or displays them on the console.

## Future Enhancements
- Support for additional file formats (e.g., PDF, DOCX).
- Real-time word processing with a GUI-based interface.
- Integration with databases for persistent storage of word counts.

---

Feel free to contribute or provide feedback to enhance the project further!
