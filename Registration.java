@FunctionalInterface
public interface Registration {

    boolean regex(String regexp, String expr) throws RegexMismatchException;
}
