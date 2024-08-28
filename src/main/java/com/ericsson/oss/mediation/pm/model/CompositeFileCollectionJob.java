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
 * Model describing composite file collection job
 * 
 * @author esersla
 * 
 */
@EModel(name = "CompositeFileCollectionJob", namespace = "global", version = "1.0.0", description = "FileCollectionJob modeled event")
@EventTypeDefinition(channelUrn = "//global/EventBasedMediationClient")
public class CompositeFileCollectionJob extends FileCollectionJob {

    /**
     * the pluginName is fully qualified name of the plug-in class if job is of type composite file transfer otherwise the value will be null or empty
     */
    @EModelAttribute(description = "class name of composite job")
    @EventAttribute
    private String pluginName;

    /**
     * the timeZone is name of the time zone, the node is in this will be reflected in destination file name as UTC offset (+hhmm or -hhmm) like A20130625.1130+0530-1145+0530
     */
    @EModelAttribute(description = "the name of the timeZone")
    @EventAttribute
    private String timeZone;

    public CompositeFileCollectionJob() {
    }

    /**
     * Constructor with pluginName, timeZone
     * 
     * @param pluginName
     * @param timeZone
     */
    public CompositeFileCollectionJob(final String pluginName, final String timeZone) {
        this.pluginName = pluginName;
        this.timeZone = timeZone;
    }

    /**
     * Constructor with nodeAddress, jobId, sourceFileName, sourceDirectory, destinationFileName, destinationDirectory, decompressionRequired and pluginName
     * 
     * @param nodeAddress
     * @param jobId
     * @param sourceFileName
     * @param sourceDirectory
     * @param destinationFileName
     * @param destinationDirectory
     * @param decompressionRequired
     * @param isCreatedWithPlugin
     * @param pluginName
     * @param timeZone
     */
    public CompositeFileCollectionJob(final String nodeAddress, final String jobId, final String sourceFileName, final String sourceDirectory, final String destinationFileName,
            final String destinationDirectory, final Boolean decompressionRequired, final Boolean isCreatedWithPlugin, final String pluginName) {

        super(nodeAddress, jobId, sourceFileName, sourceDirectory, destinationFileName, destinationDirectory, decompressionRequired, isCreatedWithPlugin);
        this.pluginName = pluginName;
    }

    /**
     * @return the pluginName String value denoting the fully qualified name of PMS plug-in class if job is composite type
     */
    public String getPluginName() {
        return pluginName;
    }

    /**
     * @param pluginName
     *            the pluginName to set
     */
    public void setPluginName(final String pluginName) {
        this.pluginName = pluginName;
    }

    /**
     * @return the timeZone the name of the Time Zone, in which node is in. This will be used in creating the destination file name for composite file collection jobs
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * @param timeZone
     *            the timeZone to set
     */
    public void setTimeZone(final String timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof CompositeFileCollectionJob)) {
            return false;
        }
        final CompositeFileCollectionJob other = (CompositeFileCollectionJob) obj;
        if (pluginName == null) {
            if (other.pluginName != null) {
                return false;
            }
        } else if (!pluginName.equals(other.pluginName)) {
            return false;
        }
        if (timeZone == null) {
            if (other.timeZone != null) {
                return false;
            }
        } else if (!timeZone.equals(other.timeZone)) {
            return false;
        }
        return true;
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
        result = prime * result + ((pluginName == null) ? 0 : pluginName.hashCode());
        result = prime * result + ((timeZone == null) ? 0 : timeZone.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "CompositeFileCollectionJob [sourceFileName=" + getSourceFileName() + ", sourceDirectory=" + getSourceDirectory() + ", destinationFileName=" + getDestinationFileName()
                + ", destinationDirectory=" + getDestinationDirectory() + ", decompressionRequired=" + getDecompressionRequired() + ", pluginName=" + getPluginName() + ", timeZone=" + getTimeZone()
                + "]";
    }

}