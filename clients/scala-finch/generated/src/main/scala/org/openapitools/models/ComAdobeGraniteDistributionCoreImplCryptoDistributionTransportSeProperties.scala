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
 * @param username 
 * @param encryptedPassword 
 */
case class ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties(name: Option[ConfigNodePropertyString],
                username: Option[ConfigNodePropertyString],
                encryptedPassword: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties] = deriveEncoder
}
