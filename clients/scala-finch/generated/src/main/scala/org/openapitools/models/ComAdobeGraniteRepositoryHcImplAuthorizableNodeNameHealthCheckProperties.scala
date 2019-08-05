package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param hcPeriodtags 
 */
case class ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties(hcPeriodtags: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties] = deriveEncoder
}
