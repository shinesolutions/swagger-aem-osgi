package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param maxConnections 
 * @param maxRequests 
 * @param requestTimeout 
 * @param logDir 
 */
case class ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties(maxConnections: Option[ConfigNodePropertyString],
                maxRequests: Option[ConfigNodePropertyString],
                requestTimeout: Option[ConfigNodePropertyString],
                logDir: Option[ConfigNodePropertyString]
                )

object ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties {
    /**
     * Creates the codec for converting ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties] = deriveEncoder
}
