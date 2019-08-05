package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteAcpPlatformPlatformServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteAcpPlatformPlatformServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteAcpPlatformPlatformServletProperties]
                )

object ComAdobeGraniteAcpPlatformPlatformServletInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteAcpPlatformPlatformServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAcpPlatformPlatformServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAcpPlatformPlatformServletInfo] = deriveEncoder
}
