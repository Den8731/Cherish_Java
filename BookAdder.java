import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class BookAdder extends JFrame{
    private ArrayList<String> books;

    public BookAdder() {

        books = new ArrayList<>();

        setTitle("Book Adder");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new BorderLayout());

        JButton addButton = new JButton("Add Book");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addBook();
            }
        });
        JTextArea bookList = new JTextArea();
        bookList.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(bookList);

        add(addButton, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }
    private void addBook() {
        String bookTitle = JOptionPane.showInputDialog("Enter the book title:");
        if (bookTitle != null && !bookTitle.isEmpty()) {
            books.add(bookTitle);
            updateBookList();
        }
    }

    private void updateBookList() {
        StringBuilder sb = new StringBuilder();
        for (String book : books) {
            sb.append(book).append("\n");
        }
        ((JTextArea) ((JScrollPane) getContentPane().getComponent(1)).getViewport().getView()).setText(sb.toString());
    }


    public static <string> void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BookAdder().setVisible(true);
            }
        });
    }

}