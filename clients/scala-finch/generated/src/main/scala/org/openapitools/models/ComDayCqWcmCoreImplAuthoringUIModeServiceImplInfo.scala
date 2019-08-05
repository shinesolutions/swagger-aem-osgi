package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param additionalProperties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties],
                additionalProperties: Option[String],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo] = deriveEncoder
}
