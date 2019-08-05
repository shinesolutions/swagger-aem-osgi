package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties]
                )

object ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo] = deriveEncoder
}
