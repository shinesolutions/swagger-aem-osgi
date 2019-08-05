package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param forwardPeriodrequests 
 */
case class ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties(forwardPeriodrequests: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties] = deriveEncoder
}
