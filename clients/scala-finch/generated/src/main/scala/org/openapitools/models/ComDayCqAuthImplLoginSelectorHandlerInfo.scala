package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqAuthImplLoginSelectorHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqAuthImplLoginSelectorHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqAuthImplLoginSelectorHandlerProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqAuthImplLoginSelectorHandlerInfo {
    /**
     * Creates the codec for converting ComDayCqAuthImplLoginSelectorHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAuthImplLoginSelectorHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAuthImplLoginSelectorHandlerInfo] = deriveEncoder
}
