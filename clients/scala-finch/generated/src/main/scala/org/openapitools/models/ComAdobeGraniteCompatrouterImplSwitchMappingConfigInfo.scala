package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties]
                )

object ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo] = deriveEncoder
}
