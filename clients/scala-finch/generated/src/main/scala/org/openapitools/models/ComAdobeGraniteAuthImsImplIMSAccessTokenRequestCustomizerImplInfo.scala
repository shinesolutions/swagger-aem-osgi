package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties]
                )

object ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo] = deriveEncoder
}
