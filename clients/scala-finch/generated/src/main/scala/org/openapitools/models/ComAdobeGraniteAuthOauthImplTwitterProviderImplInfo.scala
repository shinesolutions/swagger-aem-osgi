package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties]
                )

object ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo] = deriveEncoder
}
