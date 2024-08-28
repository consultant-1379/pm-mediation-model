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
 * 
 * File Collection Result
 * 
 * <p>
 * Base result class for file based mediation request jobs.
 * <p>
 * 
 * @author etonayr
 * 
 */
@EModel(name = "FileCollectionResult", namespace = "global", version = "1.0.0", description = "FileCollectionResult modeled event")
@EventTypeDefinition(channelUrn = "//global/MediationResponseResultHandler")
public class FileCollectionResult extends MediationTaskResult {

    /**
     * Name of the file that has been collected
     */
    @EModelAttribute(description = "source file name")
    @EventAttribute
    private String sourceFileName;
    /**
     * Source directory, represents location the source file was collected from.
     */
    @EModelAttribute(description = "source directory")
    @EventAttribute
    private String sourceDirectory;
    /**
     * Destination file name, the name source file was saved as in the destination directory
     */
    @EModelAttribute(description = "destination file name")
    @EventAttribute
    private String destinationFileName;
    /**
     * Destination directory, directory the source file file was transferred to.
     */
    @EModelAttribute(description = "destination directory")
    @EventAttribute
    private String destinationDirectory;

    /**
     * Parameter showing has the job been created by plugin
     */
    @EModelAttribute(description = "job created by plugin")
    @EventAttribute
    private Boolean isCreatedWithPlugin;

    /**
     * Default constructor
     * 
     */
    public FileCollectionResult() {

    }

    /**
     * Constructor with jobId, sourceFileName, sourceDirectory, destinationFileName and destinationDirectory
     * 
     * @param jobId
     * @param sourceFileName
     * @param sourceDirectory
     * @param destinationFileName
     * @param destinationDirectory
     * @param isCreatedWithPlugin
     */
    public FileCollectionResult(final String jobId, final String sourceFileName, final String sourceDirectory, final String destinationFileName, final String destinationDirectory,
            final Boolean isCreatedWithPlugin) {

        super(jobId);
        this.sourceFileName = sourceFileName;
        this.sourceDirectory = sourceDirectory;
        this.destinationFileName = destinationFileName;
        this.destinationDirectory = destinationDirectory;
        this.isCreatedWithPlugin = isCreatedWithPlugin;

    }

    /**
     * Getter for the sourceFileName attribute. Name of the file that will be collected
     * 
     * @return sourceFileName
     */
    public String getSourceFileName() {
        return sourceFileName;
    }

    /**
     * Setter for the sourceFileName attribute. Name of the file that will be collected
     * 
     * @param sourceFileName
     *            the sourceFileName to set
     */
    public void setSourceFileName(final String sourceFileName) {
        this.sourceFileName = sourceFileName;
    }

    /**
     * Getter for the source directory attribute. Source directory, represents location of the source file
     * 
     * @return the sourceDirectory
     */
    public String getSourceDirectory() {
        return sourceDirectory;
    }

    /**
     * Setter for the sourceDirectory attribute. Source directory, represents location of the source file
     * 
     * @param sourceDirectory
     *            the sourceDirectory to set
     */
    public void setSourceDirectory(final String sourceDirectory) {
        this.sourceDirectory = sourceDirectory;
    }

    /**
     * Getter for the destinationFileName attribute. Destination file name, the name source file will have in destination directory
     * 
     * @return the destinationFileName
     */
    public String getDestinationFileName() {
        return destinationFileName;
    }

    /**
     * Setter for the destinationFileName attribute. Destination file name, the name source file will have in destination directory
     * 
     * @param destinationFileName
     *            the destinationFileName to set
     */
    public void setDestinationFileName(final String destinationFileName) {
        this.destinationFileName = destinationFileName;
    }

    /**
     * Getter for the destinationDirectory attribute. Destination directory for the source file
     * 
     * @return the destinationDirectory
     */
    public String getDestinationDirectory() {
        return destinationDirectory;
    }

    /**
     * Setter for the destinationDirectory attribute. Destination directory for the source file
     * 
     * @param destinationDirectory
     *            the destinationDirectory to set
     */
    public void setDestinationDirectory(final String destinationDirectory) {
        this.destinationDirectory = destinationDirectory;
    }

    /**
     * Method returning the parameter which says whether the job been created by plugin
     * 
     * @return isCreatedWithPlugin Boolean value
     */

    public Boolean getIsCreatedWithPlugin() {
        return isCreatedWithPlugin;
    }

    /**
     * Setter for the isCreatedWithPlugin plugin
     * 
     * @param isCreatedWithPlugin
     */

    public void setIsCreatedWithPlugin(final Boolean isCreatedWithPlugin) {
        this.isCreatedWithPlugin = isCreatedWithPlugin;
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
        result = prime * result + ((destinationDirectory == null) ? 0 : destinationDirectory.hashCode());
        result = prime * result + ((destinationFileName == null) ? 0 : destinationFileName.hashCode());
        result = prime * result + ((isCreatedWithPlugin == null) ? 0 : isCreatedWithPlugin.hashCode());
        result = prime * result + ((sourceDirectory == null) ? 0 : sourceDirectory.hashCode());
        result = prime * result + ((sourceFileName == null) ? 0 : sourceFileName.hashCode());
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
        final FileCollectionResult other = (FileCollectionResult) obj;
        if (destinationDirectory == null) {
            if (other.destinationDirectory != null) {
                return false;
            }
        } else if (!destinationDirectory.equals(other.destinationDirectory)) {
            return false;
        }
        if (destinationFileName == null) {
            if (other.destinationFileName != null) {
                return false;
            }
        } else if (!destinationFileName.equals(other.destinationFileName)) {
            return false;
        }
        if (isCreatedWithPlugin == null) {
            if (other.isCreatedWithPlugin != null) {
                return false;
            }
        } else if (!isCreatedWithPlugin.equals(other.isCreatedWithPlugin)) {
            return false;
        }
        if (sourceDirectory == null) {
            if (other.sourceDirectory != null) {
                return false;
            }
        } else if (!sourceDirectory.equals(other.sourceDirectory)) {
            return false;
        }
        if (sourceFileName == null) {
            if (other.sourceFileName != null) {
                return false;
            }
        } else if (!sourceFileName.equals(other.sourceFileName)) {
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
        return "FileCollectionResult [sourceFileName=" + sourceFileName + ", sourceDirectory=" + sourceDirectory + ", destinationFileName=" + destinationFileName + ", destinationDirectory="
                + destinationDirectory + ", isCreatedWithPlugin=" + isCreatedWithPlugin + ", toString()=" + super.toString() + "]";
    }

}
