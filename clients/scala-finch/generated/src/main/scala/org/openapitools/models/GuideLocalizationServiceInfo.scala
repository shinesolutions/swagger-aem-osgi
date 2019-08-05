package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.GuideLocalizationServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class GuideLocalizationServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[GuideLocalizationServiceProperties]
                )

object GuideLocalizationServiceInfo {
    /**
     * Creates the codec for converting GuideLocalizationServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[GuideLocalizationServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[GuideLocalizationServiceInfo] = deriveEncoder
}
