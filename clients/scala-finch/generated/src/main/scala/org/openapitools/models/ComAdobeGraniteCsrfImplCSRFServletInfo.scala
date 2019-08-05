package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteCsrfImplCSRFServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteCsrfImplCSRFServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteCsrfImplCSRFServletProperties]
                )

object ComAdobeGraniteCsrfImplCSRFServletInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteCsrfImplCSRFServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteCsrfImplCSRFServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteCsrfImplCSRFServletInfo] = deriveEncoder
}
