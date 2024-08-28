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
import com.ericsson.oss.itpf.modeling.annotation.eventtype.EventTypeDefinition;

@EModel(name = "SGWIndividualCollectionSuccess", namespace = "global", version = "1.0.0", description = "SGWCollectionSuccess for individual file")
@EventTypeDefinition(channelUrn = "//global/SGWIndividualSuccessResponseHandler")
public class SGWIndividualCollectionSuccess extends FileCollectionResult {

    /**
     * Default non parametrised constructor
     */
    public SGWIndividualCollectionSuccess() {
    }

    /**
     * Constructor with jobId, sourceFileName, sourceDirectory, destinationFileName, destinationDirectory
     * 
     * @param jobId
     * @param sourceFileName
     * @param sourceDirectory
     * @param destinationFileName
     * @param destinationDirectory
     */
    public SGWIndividualCollectionSuccess(final String jobId, final String sourceFileName, final String sourceDirectory, final String destinationFileName, final String destinationDirectory) {
        super(jobId, sourceFileName, sourceDirectory, destinationFileName, destinationDirectory, false);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "SGWIndividualCollectionSuccess [getSourceFileName()=" + getSourceFileName() + ", getSourceDirectory()=" + getSourceDirectory() + ", getDestinationFileName()="
                + getDestinationFileName() + ", getDestinationDirectory()=" + getDestinationDirectory() + ", getIsCreatedWithPlugin()=" + getIsCreatedWithPlugin() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + ", getJobId()=" + getJobId() + ", getClass()=" + getClass() + "]";
    }
}
