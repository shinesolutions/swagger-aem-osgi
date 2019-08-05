package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteFragsImplRandomFeatureProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteFragsImplRandomFeatureInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteFragsImplRandomFeatureProperties]
                )

object ComAdobeGraniteFragsImplRandomFeatureInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteFragsImplRandomFeatureInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteFragsImplRandomFeatureInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteFragsImplRandomFeatureInfo] = deriveEncoder
}
