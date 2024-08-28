/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.oss.mediation.pm.model;

import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.eventtype.EventAttribute;
import com.ericsson.oss.itpf.modeling.annotation.eventtype.EventTypeDefinition;
import com.ericsson.oss.mediation.core.events.MediationTaskResult;

/**
 * MediationError represents generic mediation failure not associated with any particular operation type
 * 
 * */

@EModel(name = "MediationTaskError", namespace = "global", version = "1.0.0", description = "MediationError modeled event")
@EventTypeDefinition(channelUrn = "//global/MediationTaskErrortHandler")
public class MediationTaskError extends MediationTaskResult {

    @EModelAttribute(description = "errorMessage for mediation failure")
    @EventAttribute
    private String errorMessage;

    public MediationTaskError() {
    }

    /**
     * Creates a MediationTaskError object with the necessary information defined.
     * 
     * @param jobId
     *            the job Id used to correlate the request with the response in PMS
     * @param errorMessage
     *            the description of the the error
     * 
     */
    public MediationTaskError(final String jobId, final String errorMessage) {
        super(jobId);
        this.errorMessage = errorMessage;

    }

    /**
     * @return the errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * @param errorMessage
     *            the errorMessage to set
     */
    public void setErrorMessage(final String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((errorMessage == null) ? 0 : errorMessage.hashCode());

        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MediationTaskError other = (MediationTaskError) obj;
        if (errorMessage == null) {
            if (other.errorMessage != null) {
                return false;
            }
        } else if (!errorMessage.equals(other.errorMessage)) {
            return false;
        }
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "MediationError [errorMessage=" + errorMessage + ", toString()=" + super.toString() + "]";
    }

}
