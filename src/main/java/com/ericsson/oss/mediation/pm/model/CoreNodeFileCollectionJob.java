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
 * Model describing CoreNodeFileCollectionJob used for SGw file collection job
 * 
 * @author esersla
 * 
 */
@EModel(name = "CoreNodeFileCollectionJob", namespace = "global", version = "1.0.0", description = "FileCollectionJob modeled event")
@EventTypeDefinition(channelUrn = "//global/EventBasedMediationClient")
public class CoreNodeFileCollectionJob extends FileCollectionJob {

    @EModelAttribute(description = "version of the node")
    @EventAttribute
    private String nodeVersion;

    @EModelAttribute(description = "job type name based on node type")
    @EventAttribute
    private String nodeJobType;

    @EModelAttribute(description = "directory where symlinks should be created")
    @EventAttribute
    private String symlinkPath;

    public CoreNodeFileCollectionJob() {
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
    public CoreNodeFileCollectionJob(final String nodeAddress, final String jobId, final String sourceFileName, final String sourceDirectory, final String destinationFileName,
            final String destinationDirectory, final Boolean decompressionRequired, final Boolean isCreatedWithPlugin) {

        super(nodeAddress, jobId, sourceFileName, sourceDirectory, destinationFileName, destinationDirectory, decompressionRequired, isCreatedWithPlugin);
    }

    /**
     * @return the nodeVersion
     */
    public String getNodeVersion() {
        return nodeVersion;
    }

    /**
     * @param nodeVersion
     *            the nodeVersion to set
     */
    public void setNodeVersion(final String nodeVersion) {
        this.nodeVersion = nodeVersion;
    }

    /**
     * @return the nodeJobType
     */
    public String getNodeJobType() {
        return nodeJobType;
    }

    /**
     * @param nodeJobType
     *            the nodeJobType to set
     */
    public void setNodeJobType(final String nodeJobType) {
        this.nodeJobType = nodeJobType;
    }

    /**
     * @return the symlinkPath
     */
    public String getSymlinkPath() {
        return symlinkPath;
    }

    /**
     * @param symlinkPath
     *            the symlinkPath to set
     */
    public void setSymlinkPath(final String symlinkPath) {
        this.symlinkPath = symlinkPath;
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
        result = prime * result + ((nodeJobType == null) ? 0 : nodeJobType.hashCode());
        result = prime * result + ((symlinkPath == null) ? 0 : symlinkPath.hashCode());
        result = prime * result + ((nodeVersion == null) ? 0 : nodeVersion.hashCode());
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
        final CoreNodeFileCollectionJob other = (CoreNodeFileCollectionJob) obj;
        if (nodeJobType == null) {
            if (other.nodeJobType != null) {
                return false;
            }
        } else if (!nodeJobType.equals(other.nodeJobType)) {
            return false;
        }
        if (symlinkPath == null) {
            if (other.symlinkPath != null) {
                return false;
            }
        } else if (!symlinkPath.equals(other.symlinkPath)) {
            return false;
        }
        if (nodeVersion == null) {
            if (other.nodeVersion != null) {
                return false;
            }
        } else if (!nodeVersion.equals(other.nodeVersion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CoreNodeFileCollectionJob [sourceFileName=" + getSourceFileName() + ", sourceDirectory=" + getSourceDirectory() + ", destinationFileName=" + getDestinationFileName()
                + ", destinationDirectory=" + getDestinationDirectory() + ", decompressionRequired=" + getDecompressionRequired() + ", nodeJobType=" + getNodeJobType() + ", nodeVersion="
                + getNodeVersion() + ", symlinkPath=" + getSymlinkPath() + "]";
    }

}