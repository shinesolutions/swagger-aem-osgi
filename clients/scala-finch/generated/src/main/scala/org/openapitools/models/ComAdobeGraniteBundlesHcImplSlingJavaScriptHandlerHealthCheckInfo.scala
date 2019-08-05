package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties]
                )

object ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo] = deriveEncoder
}
