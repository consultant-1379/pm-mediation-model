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

@EModel(name = "SGWCollectionSuccess", namespace = "global", version = "1.0.0", description = "SGWCollectionSuccess modeled event")
@EventTypeDefinition(channelUrn = "//global/SGWSuccessResponseResultHandler")
public class SGWCollectionSuccess extends FileCollectionResult {

    /**
     * String made of multiple strings divided by semicolon that contain all of the jobs that are being processed by for specific node
     */
    @EModelAttribute(description = "job list to process")
    @EventAttribute
    private String jobNames;
    /**
     * Long holding last login time when connection happened to node
     */
    @EModelAttribute(description = "last login time to node")
    @EventAttribute
    private Long lastLoginTime;

    /**
     * Boolean if there is any change in decompression required parameter
     */
    @EModelAttribute(description = "is decompression required")
    @EventAttribute
    private Boolean decompression;

    /**
     * Default non parametrised constructor
     */
    public SGWCollectionSuccess() {
    }

    /**
     * Constructor with jobId, sourceFileName, sourceDirectory, destinationFileName, destinationDirectory, jobStartTime, jobEndTime, bytesTransferred and bytesStored
     * 
     * @param jobId
     * @param sourceFileName
     * @param sourceDirectory
     * @param destinationFileName
     * @param destinationDirectory
     * @param jobNames
     */
    public SGWCollectionSuccess(final String jobId, final String sourceFileName, final String sourceDirectory, final String destinationFileName, final String destinationDirectory,
            final String jobNames, final Long lastLoginTime, final Boolean decompressionRequired) {
        super(jobId, sourceFileName, sourceDirectory, destinationFileName, destinationDirectory, false);
        this.jobNames = jobNames;
        this.lastLoginTime = lastLoginTime;
        this.decompression = decompressionRequired;
    }

    /**
     * @return the jobNames
     */
    public String getJobNames() {
        return jobNames;
    }

    /**
     * @param jobNames
     *            the jobNames to set
     */
    public void setJobNames(final String jobNames) {
        this.jobNames = jobNames;
    }

    /**
     * @return the lastLoginTime
     */
    public Long getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * @param lastLoginTime
     *            the lastLoginTime to set
     */
    public void setLastLoginTime(final Long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * @return the decompression
     */
    public Boolean getDecompression() {
        return decompression;
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
        result = prime * result + ((decompression == null) ? 0 : decompression.hashCode());
        result = prime * result + ((jobNames == null) ? 0 : jobNames.hashCode());
        result = prime * result + ((lastLoginTime == null) ? 0 : lastLoginTime.hashCode());
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
        final SGWCollectionSuccess other = (SGWCollectionSuccess) obj;
        if (decompression == null) {
            if (other.decompression != null) {
                return false;
            }
        } else if (!decompression.equals(other.decompression)) {
            return false;
        }
        if (jobNames == null) {
            if (other.jobNames != null) {
                return false;
            }
        } else if (!jobNames.equals(other.jobNames)) {
            return false;
        }
        if (lastLoginTime == null) {
            if (other.lastLoginTime != null) {
                return false;
            }
        } else if (!lastLoginTime.equals(other.lastLoginTime)) {
            return false;
        }
        return true;
    }

}
