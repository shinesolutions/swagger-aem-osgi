package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param offloadingPeriodtransporter 
 * @param offloadingPeriodcleanupPeriodpayload 
 */
case class ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties(offloadingPeriodtransporter: Option[ConfigNodePropertyString],
                offloadingPeriodcleanupPeriodpayload: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties] = deriveEncoder
}
