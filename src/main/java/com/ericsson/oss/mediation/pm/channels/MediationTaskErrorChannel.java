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
 * This class defines the channel associated with {@link com.ericsson.oss.mediation.pm.model.MediationTaskError} events. It is used for sending unrecoverable system errors that can occur in mediation
 * service. Application responsible for error handling should subscribe to this channel.
 * 
 */
@EModel(name = "MediationTaskErrorChannel", description = "Channel used by Mediation to receive task requests.")
@ChannelDefinition(channelURI = "jms:/topic/MediationTaskErrorTopic", channelType = ChannelType.PUBLISH_SUBSCRIBE)
public class MediationTaskErrorChannel {

}
