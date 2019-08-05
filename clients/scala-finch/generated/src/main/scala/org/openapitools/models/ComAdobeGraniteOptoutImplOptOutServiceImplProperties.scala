package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param optoutPeriodcookies 
 * @param optoutPeriodheaders 
 * @param optoutPeriodwhitelistPeriodcookies 
 */
case class ComAdobeGraniteOptoutImplOptOutServiceImplProperties(optoutPeriodcookies: Option[ConfigNodePropertyArray],
                optoutPeriodheaders: Option[ConfigNodePropertyArray],
                optoutPeriodwhitelistPeriodcookies: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteOptoutImplOptOutServiceImplProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteOptoutImplOptOutServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteOptoutImplOptOutServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteOptoutImplOptOutServiceImplProperties] = deriveEncoder
}
