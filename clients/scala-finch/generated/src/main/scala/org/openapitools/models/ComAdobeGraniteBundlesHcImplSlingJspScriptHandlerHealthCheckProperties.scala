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
case class ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties(hcPeriodtags: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties] = deriveEncoder
}
