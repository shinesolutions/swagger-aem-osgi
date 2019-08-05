package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param importerPeriodname 
 */
case class ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties(importerPeriodname: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties] = deriveEncoder
}
