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

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * Simple test for code coverage, class has no logic to test other then hashcode
 * and equals method
 * 
 * @author edejket
 * 
 */
public class FileCollectionJobTest {

    private FileCollectionJob fcJob;
    private static final String SRC_DIR = "/home/test/source";
    private static final String SRC_FILENAME = "source_filename.file";
    private static final String DEST_DIR = "/home/test/destination";
    private static final String DEST_FILENAME = "destination_filename.file";
    private static final String NODE_ADDR = "some node addr";
    private static final String JOB_ID = "JobId-12222";
    private static final String PROTOCOL_INFO = "PM";
    private static final int HASH_CODE = 451654994;

    @Before
    public void setUp() {
        this.fcJob = new FileCollectionJob();
        this.fcJob.setDestinationDirectory(DEST_DIR);
        this.fcJob.setDestinationFileName(DEST_FILENAME);
        this.fcJob.setSourceDirectory(SRC_DIR);
        this.fcJob.setSourceFileName(SRC_FILENAME);
        this.fcJob.setNodeAddress(NODE_ADDR);
        this.fcJob.setJobId(JOB_ID);
        this.fcJob.setProtocolInfo(PROTOCOL_INFO);
        this.fcJob.setIsCreatedWithPlugin(false);
    }

    /**
     * Test method for
     * {@link com.ericsson.tor.mediation.core.events.FileCollectionJob#FileCollectionJob()}
     * .
     */
    @Test
    public void testFileCollectionJobConstructor() {
        Assert.assertEquals(SRC_DIR, this.fcJob.getSourceDirectory());
        Assert.assertEquals(DEST_DIR, this.fcJob.getDestinationDirectory());
        Assert.assertEquals(SRC_FILENAME, this.fcJob.getSourceFileName());
        Assert.assertEquals(DEST_FILENAME, this.fcJob.getDestinationFileName());
        Assert.assertEquals(NODE_ADDR, this.fcJob.getNodeAddress());
        Assert.assertEquals(JOB_ID, this.fcJob.getJobId());
        Assert.assertEquals(PROTOCOL_INFO, this.fcJob.getProtocolInfo());
        Assert.assertFalse(this.fcJob.getIsCreatedWithPlugin());
    }

    /**
     * Test method for
     * {@link com.ericsson.tor.mediation.core.events.FileCollectionJob#hashCode()}
     * .
     */
    @Test
    public void testHashCode() {
        Assert.assertEquals(HASH_CODE, this.fcJob.hashCode());
        this.fcJob.setDestinationDirectory(DEST_DIR + "Some more info");
        Assert.assertFalse(this.fcJob.hashCode() == HASH_CODE);
    }

    /**
     * Test method for
     * {@link com.ericsson.tor.mediation.core.events.FileCollectionJob#equals()}
     * .
     */
    @Test
    public void testEquals() {
        final FileCollectionJob fcJob1 = new FileCollectionJob();
        fcJob1.setDestinationDirectory(DEST_DIR);
        fcJob1.setDestinationFileName(DEST_FILENAME);
        fcJob1.setSourceDirectory(SRC_DIR);
        fcJob1.setSourceFileName(SRC_FILENAME);
        fcJob1.setJobId(JOB_ID);
        fcJob1.setIsCreatedWithPlugin(false);
        Assert.assertFalse(this.fcJob.equals(fcJob1));
        fcJob1.setNodeAddress(NODE_ADDR);
        Assert.assertTrue(this.fcJob.equals(fcJob1));
    }
}
