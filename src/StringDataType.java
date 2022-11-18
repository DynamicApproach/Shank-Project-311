public class StringDataType extends InterpreterDataType {
    private String value;

    public StringDataType(String value) {
        this.value = value;
    }

    public StringDataType() {
        this.value = "";
    }

    public String toString() {
        return value;
    }

    public String toString(String input) throws Exception {
        return value;
    }

    public void fromString(String input) {
        this.value = input;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}