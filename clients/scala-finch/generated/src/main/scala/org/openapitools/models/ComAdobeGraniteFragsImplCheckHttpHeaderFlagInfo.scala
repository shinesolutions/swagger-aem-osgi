package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties]
                )

object ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo] = deriveEncoder
}
