package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties]
                )

object ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo] = deriveEncoder
}
