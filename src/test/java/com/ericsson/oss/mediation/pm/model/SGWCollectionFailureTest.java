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

import org.junit.*;

import com.ericsson.oss.mediation.pm.enums.FileTransferError;

public class SGWCollectionFailureTest {

    SGWCollectionFailure sgwFail;
    private static final String ERROR_MSG = "Custom error message";
    private static final FileTransferError TRANSF_ERROR = FileTransferError.CONNECTION_FAILED;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        sgwFail = new SGWCollectionFailure(ERROR_MSG, TRANSF_ERROR.toString());
    }

    /**
     * Test method for {@link com.ericsson.oss.mediation.pm.model.SGWCollectionFailure#getErrorMessage()}.
     */
    @Test
    public void testGetErrorMessage() {
        Assert.assertEquals(ERROR_MSG, this.sgwFail.getErrorMessage());
    }

    /**
     * Test method for {@link com.ericsson.oss.mediation.pm.model.SGWCollectionFailure#getErrorType()}.
     */
    @Test
    public void testGetErrorType() {
        Assert.assertEquals(TRANSF_ERROR.toString(), this.sgwFail.getErrorType());
    }


}
