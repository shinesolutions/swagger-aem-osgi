package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param offloadingPeriodagentmanagerPeriodenabled 
 */
case class ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties(offloadingPeriodagentmanagerPeriodenabled: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties] = deriveEncoder
}
