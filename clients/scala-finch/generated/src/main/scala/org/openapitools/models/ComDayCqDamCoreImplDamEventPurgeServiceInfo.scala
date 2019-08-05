package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplDamEventPurgeServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplDamEventPurgeServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplDamEventPurgeServiceProperties]
                )

object ComDayCqDamCoreImplDamEventPurgeServiceInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplDamEventPurgeServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplDamEventPurgeServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplDamEventPurgeServiceInfo] = deriveEncoder
}
