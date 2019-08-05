package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param payloadPeriodmovePeriodwhitePeriodlist 
 * @param payloadPeriodmovePeriodhandlePeriodfromPeriodworkflowPeriodprocess 
 */
case class ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties(payloadPeriodmovePeriodwhitePeriodlist: Option[ConfigNodePropertyArray],
                payloadPeriodmovePeriodhandlePeriodfromPeriodworkflowPeriodprocess: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties] = deriveEncoder
}
