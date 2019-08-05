package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqMcmImplMCMConfigurationProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqMcmImplMCMConfigurationInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqMcmImplMCMConfigurationProperties]
                )

object ComDayCqMcmImplMCMConfigurationInfo {
    /**
     * Creates the codec for converting ComDayCqMcmImplMCMConfigurationInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqMcmImplMCMConfigurationInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqMcmImplMCMConfigurationInfo] = deriveEncoder
}
