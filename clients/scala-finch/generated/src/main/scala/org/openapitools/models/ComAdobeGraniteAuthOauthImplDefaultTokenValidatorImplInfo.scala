package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties]
                )

object ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo] = deriveEncoder
}
