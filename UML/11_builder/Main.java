public class Main {
    public static void main(String[] args) {
        ReportBuilder htmlBuilder = new HtmlReportBuilder();
        htmlBuilder.addTitle("HTML Report");
        htmlBuilder.addTable("Data Table");
        htmlBuilder.addFooter("Confidential - Do Not Distribute");
        htmlBuilder.showReport();

        ReportBuilder pdfBuilder = new PdfReportBuilder();
        pdfBuilder.addTitle("PDF Report");
        pdfBuilder.addTable("Data Table");
        pdfBuilder.addFooter("Confidential - Do Not Distribute");
        pdfBuilder.showReport();
    }
}
