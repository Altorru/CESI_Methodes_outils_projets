public class PdfReportBuilder implements ReportBuilder {
    private final StringBuilder report;

    public PdfReportBuilder() {
        report = new StringBuilder();
        report.append("PDF Report\n");
    }

    @Override
    public void addTitle(String title) {
        report.append("[PDF]Title: ").append(title).append("\n");
    }

    @Override
    public void addTable(String content) {
        report.append("[PDF]Table: ").append(content).append("\n");
    }

    @Override
    public void addChart(String chartData) {
        report.append("[PDF]Chart: ").append(chartData).append("\n");
    }

    @Override
    public void addFooter(String footer) {
        report.append("[PDF]Footer: ").append(footer).append("\n");
    }

    @Override
    public void showReport() {
        System.out.println(report.toString());
    }
}