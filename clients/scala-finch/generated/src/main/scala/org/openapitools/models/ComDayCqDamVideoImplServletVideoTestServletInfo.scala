package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamVideoImplServletVideoTestServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqDamVideoImplServletVideoTestServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamVideoImplServletVideoTestServletProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqDamVideoImplServletVideoTestServletInfo {
    /**
     * Creates the codec for converting ComDayCqDamVideoImplServletVideoTestServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamVideoImplServletVideoTestServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamVideoImplServletVideoTestServletInfo] = deriveEncoder
}
