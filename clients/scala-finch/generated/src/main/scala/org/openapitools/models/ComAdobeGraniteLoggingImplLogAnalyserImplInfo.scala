package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteLoggingImplLogAnalyserImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteLoggingImplLogAnalyserImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteLoggingImplLogAnalyserImplProperties]
                )

object ComAdobeGraniteLoggingImplLogAnalyserImplInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteLoggingImplLogAnalyserImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteLoggingImplLogAnalyserImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteLoggingImplLogAnalyserImplInfo] = deriveEncoder
}
