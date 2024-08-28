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

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FileCollectionResultTest {

    private static final String SOURCE_FILE_NAME = "sourceFileName";
    private static final String SOURCE_DIRECTORY = "sourceDirectory";
    private static final String DESTINATION_FILE_NAME = "destinationFileName";
    private static final String DESTINATION_DIRECTORY = "destinationDirectory";
    private static final String JOB_ID = "jobId";
    private static final boolean IS_CREATED_WITH_PLUGIN = false;
    private FileCollectionResult fcResult;

    @Before
    public void setup() {
        fcResult = new FileCollectionResult();
        fcResult.setJobId(JOB_ID);
        fcResult.setDestinationDirectory(DESTINATION_DIRECTORY);
        fcResult.setDestinationFileName(DESTINATION_FILE_NAME);
        fcResult.setSourceDirectory(SOURCE_DIRECTORY);
        fcResult.setSourceFileName(SOURCE_FILE_NAME);
        fcResult.setIsCreatedWithPlugin(false);
    }

    /**
     * Test method for
     * {@link com.ericsson.oss.mediation.pm.model.FileCollectionResult#getSourceFileName()}
     * .
     */
    @Test
    public void testGetSourceFileName() {
        assertEquals(SOURCE_FILE_NAME, fcResult.getSourceFileName());
    }

    /**
     * Test method for
     * {@link com.ericsson.oss.mediation.pm.model.FileCollectionResult#getSourceDirectory()}
     * .
     */
    @Test
    public void testGetSourceDirectory() {
        assertEquals(SOURCE_DIRECTORY, fcResult.getSourceDirectory());
    }

    /**
     * Test method for
     * {@link com.ericsson.oss.mediation.pm.model.FileCollectionResult#getDestinationFileName()}
     * .
     */
    @Test
    public void testGetDestinationFileName() {
        assertEquals(DESTINATION_FILE_NAME, fcResult.getDestinationFileName());
    }

    /**
     * Test method for
     * {@link com.ericsson.oss.mediation.pm.model.FileCollectionResult#getDestinationDirectory()}
     * .
     */
    @Test
    public void testGetDestinationDirectory() {
        assertEquals(DESTINATION_DIRECTORY, fcResult.getDestinationDirectory());
    }

    /**
     * Test method for
     * {@link com.ericsson.oss.mediation.pm.model.FileCollectionResult#getJobId()}
     * .
     */
    @Test
    public void testGetJobId() {
        assertEquals(JOB_ID, fcResult.getJobId());
    }

    /**
     * Test method for
     * {@link com.ericsson.oss.mediation.pm.model.FileCollectionResult#isCreatedByPlugin()}
     * .
     */
    @Test
    public void testIsCreatedWithPlugin() {
        assertEquals(IS_CREATED_WITH_PLUGIN, fcResult.getIsCreatedWithPlugin());
    }

}
