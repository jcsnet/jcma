package jcma;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoggingBean {
// ------------------------------ FIELDS ------------------------------

    private StringBuilder log = new StringBuilder();

// -------------------------- OTHER METHODS --------------------------

    public String getLog()
    {
        return log.toString();
    }

    public void info(String message)
    {
        log.append(message).append("\n");
    }
}
