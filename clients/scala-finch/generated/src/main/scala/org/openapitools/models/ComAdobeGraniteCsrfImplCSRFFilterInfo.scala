package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteCsrfImplCSRFFilterProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComAdobeGraniteCsrfImplCSRFFilterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteCsrfImplCSRFFilterProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComAdobeGraniteCsrfImplCSRFFilterInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteCsrfImplCSRFFilterInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteCsrfImplCSRFFilterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteCsrfImplCSRFFilterInfo] = deriveEncoder
}
