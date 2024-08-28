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
 * Model describing composite file collection job for SGw supported nodes
 * 
 * @author esersla
 * 
 */
@EModel(name = "CompositeCoreNodeFileCollectionJob", namespace = "global", version = "1.0.0", description = "CompositeCoreNodeFileCollectionJob modeled event")
@EventTypeDefinition(channelUrn = "//global/EventBasedMediationClient")
public class CompositeCoreNodeFileCollectionJob extends CoreNodeFileCollectionJob {

    @EModelAttribute(description = "time of last login to the node")
    @EventAttribute(filterable = false)
    private Long lastLoginTime;

    public CompositeCoreNodeFileCollectionJob() {
    }

    /**
     * Constructor with nodeJobType, symlinkPath
     * 
     * @param nodeJobType
     * @param symlinkPath
     */
    public CompositeCoreNodeFileCollectionJob(final Long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;

    }

    /**
     * Constructor with nodeAddress, jobId, sourceFileName, sourceDirectory, destinationFileName, destinationDirectory, decompressionRequired
     * 
     * @param nodeAddress
     * @param jobId
     * @param sourceFileName
     * @param sourceDirectory
     * @param destinationFileName
     * @param destinationDirectory
     * @param decompressionRequired
     * @param isCreatedWithPlugin
     */
    public CompositeCoreNodeFileCollectionJob(final String nodeAddress, final String jobId, final String sourceFileName_, final String sourceDirectory_, final String destinationFileName_,
            final String destinationDirectory_, final Boolean decompressionRequired_, final Boolean isCreatedWithPlugin_) {

        super(nodeAddress, jobId, sourceFileName_, sourceDirectory_, destinationFileName_, destinationDirectory_, decompressionRequired_, isCreatedWithPlugin_);
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

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
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
        final CompositeCoreNodeFileCollectionJob other = (CompositeCoreNodeFileCollectionJob) obj;
        if (lastLoginTime == null) {
            if (other.lastLoginTime != null) {
                return false;
            }
        } else if (!lastLoginTime.equals(other.lastLoginTime)) {
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
        return "CompositeCoreNodeFileCollectionJob [sourceFileName=" + getSourceFileName() + ", sourceDirectory=" + getSourceDirectory() + ", destinationFileName=" + getDestinationFileName()
                + ", destinationDirectory=" + getDestinationDirectory() + ", decompressionRequired=" + getDecompressionRequired() + ", nodeJobType=" + getNodeJobType() + ", symlinkPath="
                + getSymlinkPath() + ", lastLoginTime=" + getLastLoginTime() + "]";
    }

}
