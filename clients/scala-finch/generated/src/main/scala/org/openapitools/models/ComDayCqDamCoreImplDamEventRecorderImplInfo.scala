package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplDamEventRecorderImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplDamEventRecorderImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplDamEventRecorderImplProperties]
                )

object ComDayCqDamCoreImplDamEventRecorderImplInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplDamEventRecorderImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplDamEventRecorderImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplDamEventRecorderImplInfo] = deriveEncoder
}
