package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteRestImplServletDefaultGETServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteRestImplServletDefaultGETServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteRestImplServletDefaultGETServletProperties]
                )

object ComAdobeGraniteRestImplServletDefaultGETServletInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteRestImplServletDefaultGETServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteRestImplServletDefaultGETServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteRestImplServletDefaultGETServletInfo] = deriveEncoder
}
