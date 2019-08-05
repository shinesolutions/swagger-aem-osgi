package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo] = deriveEncoder
}
