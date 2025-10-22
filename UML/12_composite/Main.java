public class Main {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("File1.txt");
        FileSystemComponent file2 = new File("File2.txt");
        Directory directory = new Directory("MyDirectory");
        directory.add(file1);
        directory.add(file2);
        Directory root = new Directory("Root");
        root.add(directory);
        root.add(new File("RootFile.txt"));
        System.out.println(root.display());
    }
}
