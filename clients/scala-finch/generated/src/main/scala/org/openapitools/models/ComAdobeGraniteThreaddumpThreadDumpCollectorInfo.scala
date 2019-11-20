package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteThreaddumpThreadDumpCollectorProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteThreaddumpThreadDumpCollectorInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteThreaddumpThreadDumpCollectorProperties]
                )

object ComAdobeGraniteThreaddumpThreadDumpCollectorInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteThreaddumpThreadDumpCollectorInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteThreaddumpThreadDumpCollectorInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteThreaddumpThreadDumpCollectorInfo] = deriveEncoder
}