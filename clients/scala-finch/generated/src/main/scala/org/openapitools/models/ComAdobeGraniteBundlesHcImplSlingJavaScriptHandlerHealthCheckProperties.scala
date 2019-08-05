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
case class ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties(hcPeriodtags: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties] = deriveEncoder
}
