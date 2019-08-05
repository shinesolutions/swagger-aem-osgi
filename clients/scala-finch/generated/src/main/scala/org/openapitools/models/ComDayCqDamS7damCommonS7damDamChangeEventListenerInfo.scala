package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties]
                )

object ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo {
    /**
     * Creates the codec for converting ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo] = deriveEncoder
}
