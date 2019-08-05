package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteAuthImsProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComAdobeGraniteAuthImsInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteAuthImsProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComAdobeGraniteAuthImsInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthImsInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthImsInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthImsInfo] = deriveEncoder
}
