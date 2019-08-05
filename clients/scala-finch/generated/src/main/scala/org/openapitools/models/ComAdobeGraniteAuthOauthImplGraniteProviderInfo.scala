package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteAuthOauthImplGraniteProviderProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteAuthOauthImplGraniteProviderInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteAuthOauthImplGraniteProviderProperties]
                )

object ComAdobeGraniteAuthOauthImplGraniteProviderInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthOauthImplGraniteProviderInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthOauthImplGraniteProviderInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthOauthImplGraniteProviderInfo] = deriveEncoder
}
