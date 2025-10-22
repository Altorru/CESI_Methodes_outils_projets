public interface ReportBuilder {
    void addTitle(String title);
    void addTable(String content);
    void addChart(String chartData);
    void addFooter(String footer);
    void showReport();
}