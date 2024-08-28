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

/**
 * FileCollectionFailure class that will hold information about file collection failure. It contains error message and error type, error types are predefined in FileTransferError enum
 * 
 * @see com.ericsson.nms.mediation.model.errors.util.enums.FileTransferError
 * 
 * @author edejket
 * 
 */
@EModel(name = "FileCollectionFailure", namespace = "global", version = "1.0.0", description = "FileCollectionFailure modeled event")
@EventTypeDefinition(channelUrn = "//global/MediationFailureResponseResultHandler")
public class FileCollectionFailure extends FileCollectionResult {

    @EModelAttribute(description = "errorMessage for file collection failure")
    @EventAttribute
    private String errorMessage;

    @EModelAttribute(description = "errorType description")
    @EventAttribute
    private String errorType;

    /**
     * Default constructor
     * 
     */
    public FileCollectionFailure() {
    }

    /**
     * Constructor with errorMessage and errorType
     * 
     * @param errorMessage
     * @param errorType
     */
    public FileCollectionFailure(final String errorMessage, final String errorType) {
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
     * @param errorMessage
     * @param errorType
     */
    public FileCollectionFailure(final String jobId, final String sourceFileName, final String sourceDirectory, final String destinationFileName, final String destinationDirectory,
            final String errorMessage, final String errorType) {

        super(jobId, sourceFileName, sourceDirectory, destinationFileName, destinationDirectory, false);
        this.errorMessage = errorMessage;
        this.errorType = errorType;
    }

    /**
     * Getter method for errorMessage attribute
     * 
     * @return the errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Setter method for errorMessage attribute
     * 
     * @param errorMessage
     *            the errorMessage to set
     */
    public void setErrorMessage(final String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * Getter method for errorType attribute
     * 
     * @see com.ericsson.nms.mediation.model.errors.util.enums.FileTransferError
     * 
     * @return the errorType
     */
    public String getErrorType() {
        return errorType;
    }

    /**
     * Setter method for errorType attribute
     * 
     * @param errorType
     *            the errorType to set
     */
    public void setErrorType(final String errorType) {
        this.errorType = errorType;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((errorMessage == null) ? 0 : errorMessage.hashCode());
        result = prime * result + ((errorType == null) ? 0 : errorType.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof FileCollectionFailure)) {
            return false;
        }
        final FileCollectionFailure other = (FileCollectionFailure) obj;
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
     * @see com.ericsson.oss.mediation.pm.model.FileCollectionResult#toString()
     */
    @Override
    public String toString() {
        return "FileCollectionFailure [errorMessage=" + errorMessage + ", errorType=" + errorType + ", toString()=" + super.toString() + "]";
    }
}
