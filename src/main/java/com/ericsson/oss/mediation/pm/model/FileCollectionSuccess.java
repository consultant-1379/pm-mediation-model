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
 * FileCollectionSuccess class that will hold information about file collection success.
 * 
 * @author etonayr
 */
@EModel(name = "FileCollectionSuccess", namespace = "global", version = "2.0.0", description = "FileCollectionSuccess modeled event")
@EventTypeDefinition(channelUrn = "//global/MediationResponseResultHandler")
public class FileCollectionSuccess extends FileCollectionResult {

    /**
     * The <code>jobStartTime</code> is a long representation of a <code>java.lang.Date</code>. The job is deemed started once the Mediation Service begins processing it, including any processing
     * which takes place before the actual transfer occurs.
     */
    @EModelAttribute(description = "job start time")
    @EventAttribute
    private long jobStartTime;
    /**
     * The <code>jobEndTime</code> is a long representation of a <code>java.lang.Date</code>. The job is deemed ended once the file has been successfully collected and stored to disk.
     */
    @EModelAttribute(description = "job end time")
    @EventAttribute
    private long jobEndTime;

    /**
     * The <code>bytesTransferred</code> is the number of bytes transferred over the wire in the file transfer.
     */
    @EModelAttribute(description = "bytes transferred")
    @EventAttribute
    private long bytesTransferred;

    /**
     * The <code>bytesStored</code> is the number of bytes stored to disk. This could be different than <code>bytesTransferred</code> in the case of compressed files collected.
     */
    @EModelAttribute(description = "bytes stored")
    @EventAttribute
    private long bytesStored;

    /**
     * Default constructor
     * 
     */
    public FileCollectionSuccess() {
    }

    /**
     * Constructor with jobStartTime, jobEndTime, bytesTransferred and bytesStored.
     * 
     * @param jobStartTime
     * @param jobEndTime
     * @param bytesTransferred
     * @param bytesStored
     */
    public FileCollectionSuccess(final long jobStartTime, final long jobEndTime, final long bytesTransferred, final long bytesStored) {
        this.jobStartTime = jobStartTime;
        this.jobEndTime = jobEndTime;
        this.bytesTransferred = bytesTransferred;
        this.bytesStored = bytesStored;
    }

    /**
     * Constructor with jobId, sourceFileName, sourceDirectory, destinationFileName, destinationDirectory, jobStartTime, jobEndTime, bytesTransferred and bytesStored
     * 
     * @param jobId
     * @param sourceFileName
     * @param sourceDirectory
     * @param destinationFileName
     * @param destinationDirectory
     * @param jobStartTime
     * @param jobEndTime
     * @param bytesTransferred
     * @param bytesStored
     */
    public FileCollectionSuccess(final String jobId, final String sourceFileName, final String sourceDirectory, final String destinationFileName, final String destinationDirectory,
            final long jobStartTime, final long jobEndTime, final long bytesTransferred, final long bytesStored) {
        super(jobId, sourceFileName, sourceDirectory, destinationFileName, destinationDirectory, false);
        this.jobStartTime = jobStartTime;
        this.jobEndTime = jobEndTime;
        this.bytesTransferred = bytesTransferred;
        this.bytesStored = bytesStored;
    }

    /**
     * Getter for jobStartTime attribute long representation of java.lang.Data
     * 
     * @return the jobStartTime
     */
    public long getJobStartTime() {
        return jobStartTime;
    }

    /**
     * Setter for the jobStartTime attribute long representation of java.lang.Data
     * 
     * @param jobStartTime
     *            the jobStartTime to set
     */
    public void setJobStartTime(final long jobStartTime) {
        this.jobStartTime = jobStartTime;
    }

    /**
     * Getter the for jobEndTime attribute long representation of java.lang.Data
     * 
     * @return the jobEndTime
     */
    public long getJobEndTime() {
        return jobEndTime;
    }

    /**
     * Setter for the jobEndTime attribute long representation of java.lang.Data
     * 
     * @param jobEndTime
     *            the jobEndTime to set
     */
    public void setJobEndTime(final long jobEndTime) {
        this.jobEndTime = jobEndTime;
    }

    /**
     * Getter for the bytesTransferred attribute
     * 
     * @return bytesTransferred number of bytes transferred
     */
    public long getBytesTransferred() {
        return bytesTransferred;
    }

    /**
     * Setter for the bytesTransferred attribute
     * 
     * @param bytesTransferred
     *            number of bytes transferred to be set
     */
    public void setBytesTransferred(final long bytesTransferred) {
        this.bytesTransferred = bytesTransferred;
    }

    /**
     * Getter for the bytesStored attribute
     * 
     * @return bytesStored number of bytes stored to disk
     */
    public long getBytesStored() {
        return bytesStored;
    }

    /**
     * Setter for the bytesStored attribute
     * 
     * @return bytesStored number of bytes stored to disk to be set
     */
    public void setBytesStored(final long bytesStored) {
        this.bytesStored = bytesStored;
    }

    @Override
    public String toString() {
        return "FileCollectionSuccess [jobStartTime=" + jobStartTime + ", jobEndTime=" + jobEndTime + ", bytesTransferred=" + bytesTransferred + ", bytesStored=" + bytesStored + ", toString()="
                + super.toString() + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + (int) (bytesStored ^ (bytesStored >>> 32));
        result = prime * result + (int) (bytesTransferred ^ (bytesTransferred >>> 32));
        result = prime * result + (int) (jobEndTime ^ (jobEndTime >>> 32));
        result = prime * result + (int) (jobStartTime ^ (jobStartTime >>> 32));
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
        if (!(obj instanceof FileCollectionSuccess)) {
            return false;
        }
        final FileCollectionSuccess other = (FileCollectionSuccess) obj;

        if (bytesStored != other.bytesStored) {
            return false;
        }
        if (bytesTransferred != other.bytesTransferred) {
            return false;
        }
        if (jobEndTime != other.jobEndTime) {
            return false;
        }
        if (jobStartTime != other.jobStartTime) {
            return false;
        }
        return true;
    }
}
