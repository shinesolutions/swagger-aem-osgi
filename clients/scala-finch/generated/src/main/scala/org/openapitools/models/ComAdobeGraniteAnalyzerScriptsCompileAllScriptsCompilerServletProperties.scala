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
case class ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties(disabled: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties] = deriveEncoder
}
