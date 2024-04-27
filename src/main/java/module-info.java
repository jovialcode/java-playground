import org.jovialcode.jdk9.ModuleService;
import org.jovialcode.jdk9.ModuleServiceImpl;

module java.playground.jdk {
    exports org.jovialcode.jdk9;
    provides ModuleService with ModuleServiceImpl;
}