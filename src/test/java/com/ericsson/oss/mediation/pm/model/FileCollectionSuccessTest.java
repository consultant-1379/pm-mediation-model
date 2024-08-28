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
 * Simple test for code coverage, class has no logic to test
 * 
 * @author edejket
 * 
 */
public class FileCollectionSuccessTest {

    private FileCollectionSuccess fcResult;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() {
        this.fcResult = new FileCollectionSuccess();
        this.fcResult.setBytesStored(1000L);
        this.fcResult.setBytesTransferred(2000L);
        this.fcResult.setJobEndTime(3000L);
        this.fcResult.setJobStartTime(4000L);
    }

    @Test
    public void testGetBytesStored() {
        Assert.assertEquals(1000L, this.fcResult.getBytesStored());
    }

    @Test
    public void testGetBytesTransferred() {
        Assert.assertEquals(2000L, this.fcResult.getBytesTransferred());
    }

    @Test
    public void testGetJobEndTime() {
        Assert.assertEquals(3000L, this.fcResult.getJobEndTime());
    }

    @Test
    public void testGetJobStartTime() {
        Assert.assertEquals(4000L, this.fcResult.getJobStartTime());
    }

}
