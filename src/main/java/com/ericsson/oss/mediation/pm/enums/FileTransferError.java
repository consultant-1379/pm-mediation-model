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
package com.ericsson.oss.mediation.pm.enums;

/**
 * Each <code>FileTransferError</code> has an error code associated with it.
 * These are designed to map directly to PMS error codes. Therefore, do not
 * modify the values of these error codes without just cause.
 * 
 * Enum containing all possible file transfer errors:
 * 
 * <ul>
 * <li>CONNECTION_FAILED</li>
 * <li>DIRECTORY_LISTING_ERROR</li>
 * <li>WRITE_PERMISSION_REFUSED</li>
 * <li>VOLUME_FULL</li>
 * <li>COMMAND_SYNTAX_ERROR</li>
 * <li>ALREADY_EXISTS</li>
 * <li>FILE_DECOMPRESSION_ERROR</li>
 * <li>EMPTY_FILE</li>
 * <li>FILE_TRANSFER_ERROR</li>
 * <li>MAX_FILESIZE_EXCEEDED</li>
 * <li>FILE_NOT_AVAILABLE</li>
 * <li>UNKNOWN_TRANSFER_ERROR</li>
 * </ul>
 * 
 * @author edejket
 * 
 */
public enum FileTransferError {
    /**
     * Connection has failed
     */
    CONNECTION_FAILED(0),
    /**
     * Directory error
     */
    DIRECTORY_LISTING_ERROR(1),
    /**
     * Unable to write-No write permission
     */
    WRITE_PERMISSION_REFUSED(2),
    /**
     * Disk volume is full
     */
    VOLUME_FULL(3),
    /**
     * Invalid command syntax
     */
    COMMAND_SYNTAX_ERROR(4),
    /**
     * File transfer error specifying that file already exists
     */
    ALREADY_EXISTS(5),
    /**
     * Error decompressing file
     */
    FILE_DECOMPRESSION_ERROR(6),
    /**
     * Specified file is empty
     */
    EMPTY_FILE(7),
    /**
     * Some error occurred during file transfer
     */
    FILE_TRANSFER_ERROR(8),
    /**
     * Maximum file size has been exceeded
     */
    MAX_FILESIZE_EXCEEDED(9),
    /**
     * File with specified filename does not exist
     */
    FILE_NOT_AVAILABLE(10),
    /**
     * Generic file transfer error for all not covered by above
     */
    UNKNOWN_TRANSFER_ERROR(11);

    private final int errorCode;

    FileTransferError(final int errorCode) {
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
