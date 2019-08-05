package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo] = deriveEncoder
}
