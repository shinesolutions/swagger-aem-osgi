package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param diffPath 
 * @param serviceName 
 * @param serviceUserPeriodtarget 
 */
case class ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties(diffPath: Option[ConfigNodePropertyString],
                serviceName: Option[ConfigNodePropertyString],
                serviceUserPeriodtarget: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties] = deriveEncoder
}
