package chapter02;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import java.util.logging.Logger;

public class LoggingProducer {
    @Produces
    public Logger produceLogger(InjectionPoint point) {
        return Logger.getLogger(point.getMember().getDeclaringClass().getName());
    }
}
