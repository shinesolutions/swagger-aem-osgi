package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param receiverPeriodtmpfilePeriodthreshold 
 * @param receiverPeriodpackagesPeriodusePeriodinstall 
 */
case class ComDayCqReplicationImplReplicationReceiverImplProperties(receiverPeriodtmpfilePeriodthreshold: Option[ConfigNodePropertyInteger],
                receiverPeriodpackagesPeriodusePeriodinstall: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqReplicationImplReplicationReceiverImplProperties {
    /**
     * Creates the codec for converting ComDayCqReplicationImplReplicationReceiverImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqReplicationImplReplicationReceiverImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqReplicationImplReplicationReceiverImplProperties] = deriveEncoder
}
