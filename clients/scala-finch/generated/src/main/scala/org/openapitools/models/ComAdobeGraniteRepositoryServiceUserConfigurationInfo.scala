package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteRepositoryServiceUserConfigurationProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteRepositoryServiceUserConfigurationInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteRepositoryServiceUserConfigurationProperties]
                )

object ComAdobeGraniteRepositoryServiceUserConfigurationInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteRepositoryServiceUserConfigurationInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteRepositoryServiceUserConfigurationInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteRepositoryServiceUserConfigurationInfo] = deriveEncoder
}
