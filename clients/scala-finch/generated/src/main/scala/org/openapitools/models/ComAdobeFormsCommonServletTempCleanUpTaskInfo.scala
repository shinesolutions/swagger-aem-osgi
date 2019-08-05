package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeFormsCommonServletTempCleanUpTaskProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeFormsCommonServletTempCleanUpTaskInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeFormsCommonServletTempCleanUpTaskProperties]
                )

object ComAdobeFormsCommonServletTempCleanUpTaskInfo {
    /**
     * Creates the codec for converting ComAdobeFormsCommonServletTempCleanUpTaskInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeFormsCommonServletTempCleanUpTaskInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeFormsCommonServletTempCleanUpTaskInfo] = deriveEncoder
}
