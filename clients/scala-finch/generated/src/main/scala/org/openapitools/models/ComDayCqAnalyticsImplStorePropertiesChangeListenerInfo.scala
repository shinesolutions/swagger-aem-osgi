package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties]
                )

object ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo {
    /**
     * Creates the codec for converting ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo] = deriveEncoder
}
