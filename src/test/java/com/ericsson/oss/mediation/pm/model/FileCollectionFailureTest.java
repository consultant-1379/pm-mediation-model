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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

import com.ericsson.oss.mediation.pm.enums.FileTransferError;

/**
 * Simple test to get bit more code coverage, no usefull logic to test here
 * 
 * @author edejket
 * 
 */
public class FileCollectionFailureTest {

    private FileCollectionFailure fcFailure;
    private static final String ERROR_MSG = "Custom error message";
    private static final FileTransferError TRANSF_ERROR = FileTransferError.CONNECTION_FAILED;

    @Before
    public void setUp() {
        this.fcFailure = new FileCollectionFailure();
        this.fcFailure.setErrorMessage(ERROR_MSG);
        this.fcFailure.setErrorType(TRANSF_ERROR.toString());
    }

    @Test
    public void testGetErrorMessage() {
        Assert.assertEquals(ERROR_MSG, this.fcFailure.getErrorMessage());
    }

    @Test
    public void testGetErrorType() {
        Assert.assertEquals(TRANSF_ERROR.toString(),
                this.fcFailure.getErrorType());
    }

    @Test
    public void testEquality() {
        final FileCollectionFailure other = new FileCollectionFailure(
                ERROR_MSG, TRANSF_ERROR.toString());
        assertTrue(fcFailure.equals(other));
        other.setJobId("jobId");
        assertFalse(fcFailure.equals(other));
    }

}
