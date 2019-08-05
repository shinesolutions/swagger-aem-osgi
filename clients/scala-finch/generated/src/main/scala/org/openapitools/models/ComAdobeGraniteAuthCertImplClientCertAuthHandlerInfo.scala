package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties]
                )

object ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo] = deriveEncoder
}
