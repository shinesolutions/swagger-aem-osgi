package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties]
                )

object ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo] = deriveEncoder
}