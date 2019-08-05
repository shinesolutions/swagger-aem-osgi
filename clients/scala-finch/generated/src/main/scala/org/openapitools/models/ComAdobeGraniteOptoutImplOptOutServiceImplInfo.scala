package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteOptoutImplOptOutServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComAdobeGraniteOptoutImplOptOutServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteOptoutImplOptOutServiceImplProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComAdobeGraniteOptoutImplOptOutServiceImplInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteOptoutImplOptOutServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteOptoutImplOptOutServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteOptoutImplOptOutServiceImplInfo] = deriveEncoder
}
