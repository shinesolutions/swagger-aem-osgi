package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param disabledPeriodcipherPeriodsuites 
 * @param enabledPeriodcipherPeriodsuites 
 */
case class ComDayCqReplicationImplTransportHttpProperties(disabledPeriodcipherPeriodsuites: Option[ConfigNodePropertyArray],
                enabledPeriodcipherPeriodsuites: Option[ConfigNodePropertyArray]
                )

object ComDayCqReplicationImplTransportHttpProperties {
    /**
     * Creates the codec for converting ComDayCqReplicationImplTransportHttpProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqReplicationImplTransportHttpProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqReplicationImplTransportHttpProperties] = deriveEncoder
}
