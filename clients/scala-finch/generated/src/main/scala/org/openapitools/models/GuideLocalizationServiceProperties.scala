package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param supportedLocales 
 * @param Localizable Properties 
 */
case class GuideLocalizationServiceProperties(supportedLocales: Option[ConfigNodePropertyArray],
                Localizable Properties: Option[ConfigNodePropertyArray]
                )

object GuideLocalizationServiceProperties {
    /**
     * Creates the codec for converting GuideLocalizationServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[GuideLocalizationServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[GuideLocalizationServiceProperties] = deriveEncoder
}
