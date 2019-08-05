package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param pseudoPeriodpatterns 
 */
case class ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties(pseudoPeriodpatterns: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties] = deriveEncoder
}
