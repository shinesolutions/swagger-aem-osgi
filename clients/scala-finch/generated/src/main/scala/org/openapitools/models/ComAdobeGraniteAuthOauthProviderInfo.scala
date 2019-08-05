package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteAuthOauthProviderProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteAuthOauthProviderInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteAuthOauthProviderProperties]
                )

object ComAdobeGraniteAuthOauthProviderInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthOauthProviderInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthOauthProviderInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthOauthProviderInfo] = deriveEncoder
}
