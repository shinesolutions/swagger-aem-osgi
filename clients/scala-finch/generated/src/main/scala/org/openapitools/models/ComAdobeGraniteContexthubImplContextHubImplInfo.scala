package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteContexthubImplContextHubImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteContexthubImplContextHubImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteContexthubImplContextHubImplProperties]
                )

object ComAdobeGraniteContexthubImplContextHubImplInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteContexthubImplContextHubImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteContexthubImplContextHubImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteContexthubImplContextHubImplInfo] = deriveEncoder
}
