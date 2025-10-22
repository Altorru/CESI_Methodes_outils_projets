public class File implements FileSystemComponent {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String display() {
        return display("", true);
    }

    @Override
    public String display(String prefix, boolean isLast) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        sb.append(isLast ? "└─ " : "├─ ");
        sb.append(getName());
        sb.append(System.lineSeparator());
        return sb.toString();
    }
}
