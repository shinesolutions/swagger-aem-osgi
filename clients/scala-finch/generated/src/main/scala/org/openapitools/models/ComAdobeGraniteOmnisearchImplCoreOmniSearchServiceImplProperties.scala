package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param omnisearchPeriodsuggestionPeriodrequiretextPeriodmin 
 * @param omnisearchPeriodsuggestionPeriodspellcheckPeriodrequire 
 */
case class ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties(omnisearchPeriodsuggestionPeriodrequiretextPeriodmin: Option[ConfigNodePropertyInteger],
                omnisearchPeriodsuggestionPeriodspellcheckPeriodrequire: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties] = deriveEncoder
}
