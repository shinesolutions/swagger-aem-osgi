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
case class ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties(disabledPeriodcipherPeriodsuites: Option[ConfigNodePropertyArray],
                enabledPeriodcipherPeriodsuites: Option[ConfigNodePropertyArray]
                )

object ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties {
    /**
     * Creates the codec for converting ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties] = deriveEncoder
}
