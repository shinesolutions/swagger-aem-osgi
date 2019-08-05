package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties]
                )

object ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo] = deriveEncoder
}
