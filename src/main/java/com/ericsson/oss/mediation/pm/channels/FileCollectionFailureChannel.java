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
package com.ericsson.oss.mediation.pm.channels;

import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.channel.ChannelDefinition;
import com.ericsson.oss.itpf.modeling.annotation.channel.ChannelType;

/**
 * Defines a channel on which we send failure notifications for MediationTaskResult objects. Added this as a workaround as SF modelled event bus EventSender cant send a child of parent object, if/when
 * they support we can refactor this out.
 * 
 * @author etonayr
 * 
 */

@EModel(name = "FileCollectionFailureChannel", description = "Channel used by Mediation to receive task requests.")
@ChannelDefinition(channelURI = "jms:/queue/mediationPM", channelType = ChannelType.POINT_TO_POINT)
public class FileCollectionFailureChannel {
}
