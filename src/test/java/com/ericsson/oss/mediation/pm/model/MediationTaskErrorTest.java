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

import static org.junit.Assert.*;

import org.junit.*;

/**
 * Simple test to increase code coverage
 * 
 */
public class MediationTaskErrorTest {

    MediationTaskError mtError;
    private static final String ERROR_MESSAGE = "Test error message";

    @Before
    public void setUp() {
        this.mtError = new MediationTaskError();
        this.mtError.setErrorMessage(ERROR_MESSAGE);

    }

    @Test
    public void testGetErrorMessage() {
        Assert.assertEquals(ERROR_MESSAGE, this.mtError.getErrorMessage());
    }

    @Test
    public void testEqulasMethod() {
        final MediationTaskError other = new MediationTaskError(null,
                ERROR_MESSAGE);
        assertTrue(mtError.equals(other));
        other.setJobId("new_job_id");
        assertFalse(mtError.equals(other));

    }

    @Test
    public void testHashCodeMethod() {
        final MediationTaskError other = new MediationTaskError(null,
                ERROR_MESSAGE);
        assertEquals(mtError.hashCode(), other.hashCode());
    }

}
