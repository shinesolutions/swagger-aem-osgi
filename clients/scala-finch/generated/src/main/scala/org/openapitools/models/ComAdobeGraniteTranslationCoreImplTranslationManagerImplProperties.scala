package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param defaultConnectorName 
 * @param defaultCategory 
 */
case class ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties(defaultConnectorName: Option[ConfigNodePropertyString],
                defaultCategory: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties] = deriveEncoder
}
