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

import org.junit.Test;

public class CompositeCoreNodeFileCollectionJobTest {

    private static final String PM_PROTOCOL = "PM";
    private static final String JOB_ID = "jobId";
    private static final String NODE_ADD = "nodeAdd";
    private static final String SRC_FILE = "srcFile";
    private static final String SRC_DIR = "srcDir";
    private static final String DEST_FILE = "destFile";
    private static final String DEST_DIR = "destDir";
    public static final String NODE_JOB_TYPE = "mgw";
    public static final String NODE_VERSION = "11B";
    public static final Long LAST_LOGIN_TIME = 1376400975661L;

    @Test
    public void testToString() {
        final String toStringMatch = "CompositeCoreNodeFileCollectionJob [sourceFileName="
                + SRC_FILE
                + ", sourceDirectory="
                + SRC_DIR
                + ", destinationFileName="
                + DEST_FILE
                + ", destinationDirectory="
                + DEST_DIR
                + ", decompressionRequired="
                + false
                + ", nodeJobType="
                + NODE_JOB_TYPE
                + ", symlinkPath="
                + null
                + ", lastLoginTime="
                + LAST_LOGIN_TIME + "]";
        ;
        final CompositeCoreNodeFileCollectionJob cfcJob = getCompositeJob();
        Assert.assertEquals(toStringMatch, cfcJob.toString());
    }

    @Test
    public void testCompositeFileCollectionJob() {
        final CompositeCoreNodeFileCollectionJob cfcJob = getCompositeJob();
        Assert.assertEquals(SRC_DIR, cfcJob.getSourceDirectory());
        Assert.assertEquals(DEST_DIR, cfcJob.getDestinationDirectory());
        Assert.assertEquals(SRC_FILE, cfcJob.getSourceFileName());
        Assert.assertEquals(DEST_FILE, cfcJob.getDestinationFileName());
        Assert.assertEquals(NODE_ADD, cfcJob.getNodeAddress());
        Assert.assertEquals(JOB_ID, cfcJob.getJobId());
        Assert.assertEquals(PM_PROTOCOL, cfcJob.getProtocolInfo());
        Assert.assertEquals(NODE_JOB_TYPE, cfcJob.getNodeJobType());
        Assert.assertEquals(NODE_VERSION, cfcJob.getNodeVersion());
        Assert.assertNull(cfcJob.getSymlinkPath());
    }

    /**
     * 
     * @return new instance of CompositeFileCollectionJob
     */
    private CompositeCoreNodeFileCollectionJob getCompositeJob() {
        final CompositeCoreNodeFileCollectionJob cfcJob = new CompositeCoreNodeFileCollectionJob(
                LAST_LOGIN_TIME);
        cfcJob.setDestinationDirectory(DEST_DIR);
        cfcJob.setDestinationFileName(DEST_FILE);
        cfcJob.setSourceDirectory(SRC_DIR);
        cfcJob.setSourceFileName(SRC_FILE);
        cfcJob.setNodeAddress(NODE_ADD);
        cfcJob.setJobId(JOB_ID);
        cfcJob.setProtocolInfo(PM_PROTOCOL);
        cfcJob.setDecompressionRequired(false);
        cfcJob.setNodeJobType(NODE_JOB_TYPE);
        cfcJob.setNodeVersion(NODE_VERSION);
        cfcJob.setSymlinkPath(null);

        return cfcJob;
    }
}
