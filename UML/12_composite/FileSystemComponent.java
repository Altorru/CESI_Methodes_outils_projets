public interface FileSystemComponent {
    String getName();

    /**
     * Default display prints the component as a tree starting at this node.
     */
    default String display() {
        return display("", true);
    }

    /**
     * Recursive display helper. Implementations should return a string containing
     * the line for this node (including the connector using the given prefix)
     * plus the representation of any children.
     *
     * @param prefix prefix to prepend before the connector
     * @param isLast whether this node is the last child of its parent
     */
    String display(String prefix, boolean isLast);
}
