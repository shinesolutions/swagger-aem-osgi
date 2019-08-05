package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param maxConnections 
 * @param maxRequests 
 * @param requestTimeout 
 * @param requestRetries 
 * @param launchTimeout 
 */
case class ComAdobeOctopusNcommBootstrapProperties(maxConnections: Option[ConfigNodePropertyInteger],
                maxRequests: Option[ConfigNodePropertyInteger],
                requestTimeout: Option[ConfigNodePropertyInteger],
                requestRetries: Option[ConfigNodePropertyInteger],
                launchTimeout: Option[ConfigNodePropertyInteger]
                )

object ComAdobeOctopusNcommBootstrapProperties {
    /**
     * Creates the codec for converting ComAdobeOctopusNcommBootstrapProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeOctopusNcommBootstrapProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeOctopusNcommBootstrapProperties] = deriveEncoder
}
