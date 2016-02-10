package Strategy.Java;


public class TextEditor {

    private TextFormatter formatter;

    public TextEditor(TextFormatter formatter) {
        this.formatter = formatter;
//        throw new UnsupportedOperationException();
    }

    public void publishText(String text) {
        formatter.format(text);
//        throw new UnsupportedOperationException();
    }

}

