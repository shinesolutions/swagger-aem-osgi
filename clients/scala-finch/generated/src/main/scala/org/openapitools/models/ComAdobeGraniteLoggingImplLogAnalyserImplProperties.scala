package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param messagesPeriodqueuePeriodsize 
 * @param loggerPeriodconfig 
 * @param messagesPeriodsize 
 */
case class ComAdobeGraniteLoggingImplLogAnalyserImplProperties(messagesPeriodqueuePeriodsize: Option[ConfigNodePropertyInteger],
                loggerPeriodconfig: Option[ConfigNodePropertyArray],
                messagesPeriodsize: Option[ConfigNodePropertyInteger]
                )

object ComAdobeGraniteLoggingImplLogAnalyserImplProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteLoggingImplLogAnalyserImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteLoggingImplLogAnalyserImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteLoggingImplLogAnalyserImplProperties] = deriveEncoder
}
