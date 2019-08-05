package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteCompatrouterImplRoutingConfigProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteCompatrouterImplRoutingConfigInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteCompatrouterImplRoutingConfigProperties]
                )

object ComAdobeGraniteCompatrouterImplRoutingConfigInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteCompatrouterImplRoutingConfigInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteCompatrouterImplRoutingConfigInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteCompatrouterImplRoutingConfigInfo] = deriveEncoder
}
