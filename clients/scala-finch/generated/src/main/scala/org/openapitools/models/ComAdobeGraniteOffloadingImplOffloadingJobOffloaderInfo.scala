package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo] = deriveEncoder
}
