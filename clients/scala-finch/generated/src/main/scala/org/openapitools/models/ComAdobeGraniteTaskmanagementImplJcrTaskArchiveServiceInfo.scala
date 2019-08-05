package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties]
                )

object ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo] = deriveEncoder
}
