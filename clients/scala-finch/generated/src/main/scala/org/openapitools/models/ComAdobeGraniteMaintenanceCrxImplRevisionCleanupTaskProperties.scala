package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param fullPeriodgcPerioddays 
 */
case class ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties(fullPeriodgcPerioddays: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties] = deriveEncoder
}
