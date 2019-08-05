package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties]
                )

object ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfo] = deriveEncoder
}
