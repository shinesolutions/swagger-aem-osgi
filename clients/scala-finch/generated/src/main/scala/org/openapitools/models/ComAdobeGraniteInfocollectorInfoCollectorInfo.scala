package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteInfocollectorInfoCollectorProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteInfocollectorInfoCollectorInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteInfocollectorInfoCollectorProperties]
                )

object ComAdobeGraniteInfocollectorInfoCollectorInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteInfocollectorInfoCollectorInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteInfocollectorInfoCollectorInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteInfocollectorInfoCollectorInfo] = deriveEncoder
}
