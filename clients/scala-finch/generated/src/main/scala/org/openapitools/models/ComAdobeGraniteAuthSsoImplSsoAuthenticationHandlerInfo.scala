package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties]
                )

object ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo] = deriveEncoder
}
