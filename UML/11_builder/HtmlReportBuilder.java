public class HtmlReportBuilder implements ReportBuilder {
    private final StringBuilder report;

    public HtmlReportBuilder() {
        report = new StringBuilder();
        report.append("<html><body>\n");
    }

    @Override
    public void addTitle(String title) {
        report.append("<h1>").append(title).append("</h1>\n");
    }

    @Override
    public void addTable(String content) {
        report.append("<table><tr><td>").append(content).append("</td></tr></table>\n");
    }

    @Override
    public void addChart(String chartData) {
        report.append("<h2>Chart</h2><p>").append(chartData).append("</p>\n");
    }

    @Override
    public void addFooter(String footer) {
        report.append("<footer>").append(footer).append("</footer>\n");
    }

    @Override
    public void showReport() {
        report.append("</body></html>\n");
        System.out.println(report.toString());
    }
}