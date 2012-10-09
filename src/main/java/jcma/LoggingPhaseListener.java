package jcma;

import javax.faces.component.UIViewRoot;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import java.util.logging.Logger;

public class LoggingPhaseListener implements PhaseListener {
// ------------------------------ FIELDS ------------------------------

    private static Logger LOGGER = Logger.getLogger(LoggingPhaseListener.class.getCanonicalName());

// ------------------------ INTERFACE METHODS ------------------------


// --------------------- Interface PhaseListener ---------------------

    public void afterPhase(PhaseEvent event)
    {
        final UIViewRoot viewRoot = event.getFacesContext().getViewRoot();
        final String viewId = viewRoot == null ? null : viewRoot.getViewId();
        final String msg = String.format("After phase: %s; ViewId: %s", event.getPhaseId(), viewId);
        LOGGER.info(msg);
        final LoggingBean loggingBean = (LoggingBean) event.getFacesContext()
            .getApplication()
            .createValueBinding("#{loggingBean}")
            .getValue(event.getFacesContext());
        loggingBean.info(msg);
    }

    public void beforePhase(PhaseEvent event)
    {
        final UIViewRoot viewRoot = event.getFacesContext().getViewRoot();
        final String viewId = viewRoot == null ? null : viewRoot.getViewId();
        final String msg = String.format("Before phase: %s; ViewId: %s", event.getPhaseId(), viewId);
        LOGGER.info(msg);
        final LoggingBean loggingBean = (LoggingBean) event.getFacesContext()
            .getApplication()
            .createValueBinding("#{loggingBean}")
            .getValue(event.getFacesContext());
        loggingBean.info(msg);
    }

    public PhaseId getPhaseId()
    {
        return PhaseId.ANY_PHASE;
    }
}
