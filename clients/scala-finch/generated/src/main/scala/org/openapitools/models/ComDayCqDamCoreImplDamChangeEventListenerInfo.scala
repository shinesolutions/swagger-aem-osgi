package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplDamChangeEventListenerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplDamChangeEventListenerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplDamChangeEventListenerProperties]
                )

object ComDayCqDamCoreImplDamChangeEventListenerInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplDamChangeEventListenerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplDamChangeEventListenerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplDamChangeEventListenerInfo] = deriveEncoder
}
