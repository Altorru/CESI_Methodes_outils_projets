import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private final String name;
    private final List<FileSystemComponent> childrens = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        childrens.add(component);
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
        // current node line
        sb.append(prefix);
        sb.append(isLast ? "└─ " : "├─ ");
        sb.append(getName());
        sb.append(System.lineSeparator());

        // prepare prefix for children
        String childPrefix = prefix + (isLast ? "   " : "│  ");

        for (int i = 0; i < childrens.size(); i++) {
            FileSystemComponent child = childrens.get(i);
            boolean childIsLast = (i == childrens.size() - 1);
            sb.append(child.display(childPrefix, childIsLast));
        }

        return sb.toString();
    }
}
