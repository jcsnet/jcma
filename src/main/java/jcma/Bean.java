package jcma;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import java.util.logging.Logger;

@ManagedBean
public class Bean {
// ------------------------------ FIELDS ------------------------------

    private static Logger LOGGER = Logger.getLogger(Bean.class.getCanonicalName());

    private boolean formVisible = true;

    @ManagedProperty("#{loggingBean}")
    private LoggingBean loggingBean;

    private String name;

// --------------------- GETTER / SETTER METHODS ---------------------

    public String getName()
    {
        final String msg = "getName:" + name;
        LOGGER.info(msg);
        loggingBean.info(msg);
        return name;
    }

    public void setName(String name)
    {
        final String msg = "setName:" + name;
        LOGGER.info(msg);
        loggingBean.info(msg);
        this.name = name;
    }

    public boolean isFormVisible()
    {
        final String msg = "isFormVisible: " + formVisible;
        LOGGER.info(msg);
        loggingBean.info(msg);
        return formVisible;
    }

    public void setFormVisible(boolean formVisible)
    {
        final String msg = "setFormVisible: " + formVisible;
        LOGGER.info(msg);
        loggingBean.info(msg);
        this.formVisible = formVisible;
    }

    public void setLoggingBean(LoggingBean loggingBean)
    {
        this.loggingBean = loggingBean;
    }

// -------------------------- OTHER METHODS --------------------------

    public void sayHi()
    {
        final String msg = "sayHi:" + name;
        LOGGER.info(msg);
        loggingBean.info(msg);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Hi " + name));
    }
}
