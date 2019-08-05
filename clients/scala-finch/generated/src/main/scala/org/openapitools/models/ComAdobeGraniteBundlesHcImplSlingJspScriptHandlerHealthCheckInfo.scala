package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties]
                )

object ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo] = deriveEncoder
}
