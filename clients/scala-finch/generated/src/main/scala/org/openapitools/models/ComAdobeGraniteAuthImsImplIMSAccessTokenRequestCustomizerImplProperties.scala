package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param authPeriodimsPeriodclientPeriodsecret 
 * @param customizerPeriodtype 
 */
case class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties(authPeriodimsPeriodclientPeriodsecret: Option[ConfigNodePropertyString],
                customizerPeriodtype: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties] = deriveEncoder
}
