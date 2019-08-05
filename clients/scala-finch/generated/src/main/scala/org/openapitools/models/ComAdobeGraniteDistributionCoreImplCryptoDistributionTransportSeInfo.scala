package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties]
                )

object ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo] = deriveEncoder
}
