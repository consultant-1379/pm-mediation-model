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

@EModel(name = "SGWCollectionFailure", namespace = "global", version = "1.0.0", description = "SGWCollectionFailure modeled event")
@EventTypeDefinition(channelUrn = "//global/SGWFailureResponseResultHandler")
public class SGWCollectionFailure extends FileCollectionResult {

    @EModelAttribute(description = "errorMessage for sgw collection failure")
    @EventAttribute
    private String errorMessage;

    @EModelAttribute(description = "errorType description")
    @EventAttribute
    private String errorType;

    /**
     * Default non parametrised constructor
     */
    public SGWCollectionFailure() {
    }

    /**
     * Constructor with errorMessage and errorType
     * 
     * @param errorMessage
     * @param errorType
     */
    public SGWCollectionFailure(final String errorMessage, final String errorType) {
        super();
        this.errorMessage = errorMessage;
        this.errorType = errorType;
    }

    /**
     * Constructor with jobId, sourceFileName, sourceDirectory, destinationFileName, destinationDirectory, errorMessage and errorType
     * 
     * @param jobId
     * @param sourceFileName
     * @param sourceDirectory
     * @param destinationFileName
     * @param destinationDirectory
     * @param isCreatedWithPlugin
     * @param errorMessage
     * @param errorType
     */
    public SGWCollectionFailure(final String jobId, final String sourceFileName, final String sourceDirectory, final String destinationFileName, final String destinationDirectory,
            final String errorMessage, final String errorType) {
        super(jobId, sourceFileName, sourceDirectory, destinationFileName, destinationDirectory, false);
        this.errorMessage = errorMessage;
        this.errorType = errorType;
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

    /**
     * @return the errorType
     */
    public String getErrorType() {
        return errorType;
    }

    /**
     * @param errorType
     *            the errorType to set
     */
    public void setErrorType(final String errorType) {
        this.errorType = errorType;
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
        result = prime * result + ((errorType == null) ? 0 : errorType.hashCode());
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
        final SGWCollectionFailure other = (SGWCollectionFailure) obj;
        if (errorMessage == null) {
            if (other.errorMessage != null) {
                return false;
            }
        } else if (!errorMessage.equals(other.errorMessage)) {
            return false;
        }
        if (errorType == null) {
            if (other.errorType != null) {
                return false;
            }
        } else if (!errorType.equals(other.errorType)) {
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
        return "SGWCollectionFailure [errorMessage=" + errorMessage + ", errorType=" + errorType + "]";
    }

}
