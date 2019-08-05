package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties]
                )

object ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo] = deriveEncoder
}
