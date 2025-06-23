fun main() {
    val logger = Logger()
    val reports: List<PrintableReport> = listOf(
        BasicReport("Player stats"),
        HtmlReport("<h1>Scoreboard</h1>"),
        JsonReport("{ \"score\": 1000 }")
    )

    val reportPrinter = ReportPrinter()
    reports.forEach { reportPrinter.print(it, logger) }
}

// OCP-friendly abstraction
interface PrintableReport {
    fun format(): String
}

// Concrete implementation 1
class BasicReport(private val content: String) : PrintableReport {
    override fun format(): String = content
}

// Concrete implementation 2
class HtmlReport(private val html: String) : PrintableReport {
    override fun format(): String = "HTML Format: $html"
}

// Concrete implementation 3 (additional extension)
class JsonReport(private val json: String) : PrintableReport {
    override fun format(): String = "JSON Format: $json"
}

// Logger remains unchanged
class Logger {
    fun log(message: String) {
        println("[LOG] $message")
    }
}

// ReportPrinter now depends on abstraction instead of concrete Report
class ReportPrinter {
    fun print(report: PrintableReport, logger: Logger) {
        logger.log("Printing report: ${report.format()}")
    }
}
