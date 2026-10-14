public class LogLevels {
    
    public static String message(String logLine) {
        int indexFirstBlankSpace = logLine.indexOf(" ");
        String rawMessage = logLine.substring(indexFirstBlankSpace);
        return rawMessage.trim();
    }

    public static String logLevel(String logLine) {
        int beginIndex = logLine.indexOf("[");
        int endIndex = logLine.indexOf("]");
        String upperMessage = logLine.substring(beginIndex + 1, endIndex);
        return upperMessage.toLowerCase();
    }

    public static String reformat(String logLine) {
        String message = LogLevels.message(logLine);
        String logLevel = LogLevels.logLevel(logLine);
        return message + " " + "(" + logLevel + ")";
    }
}
