package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param name 
 * @param serviceName 
 * @param userId 
 * @param accessTokenProviderPeriodtarget 
 */
case class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties(name: Option[ConfigNodePropertyString],
                serviceName: Option[ConfigNodePropertyString],
                userId: Option[ConfigNodePropertyString],
                accessTokenProviderPeriodtarget: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties] = deriveEncoder
}
