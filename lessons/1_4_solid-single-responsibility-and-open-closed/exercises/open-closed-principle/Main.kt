fun main() {
    // TODO: Extend this without modifying existing logic.
    // Goal: Apply the Open/Closed Principle (OCP)

    // Step 1: Identify the parts of the code that might need to change (e.g., report formats).
    // Step 2: Define an abstraction for reports so we can support different types.
    // Step 3: Ensure ReportPrinter uses the abstraction rather than concrete types.
    // Step 4: Demonstrate extensibility by adding new report types without modifying ReportPrinter.

    val logger = Logger()
    val basicReport = Report("Player stats")
    val reportPrinter = ReportPrinter()

    reportPrinter.print(basicReport, logger)
}

class Report(val content: String)

class Logger {
    fun log(message: String) {
        println("[LOG] $message")
    }
}

class ReportPrinter {
    fun print(report: Report, logger: Logger) {
        logger.log("Printing report: ${report.content}")
    }
}
