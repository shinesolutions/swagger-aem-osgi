package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param disabled 
 */
case class ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties(disabled: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties] = deriveEncoder
}
