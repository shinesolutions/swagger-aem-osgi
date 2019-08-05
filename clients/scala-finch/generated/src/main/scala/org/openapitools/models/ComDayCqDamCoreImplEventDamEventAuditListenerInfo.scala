package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplEventDamEventAuditListenerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplEventDamEventAuditListenerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplEventDamEventAuditListenerProperties]
                )

object ComDayCqDamCoreImplEventDamEventAuditListenerInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplEventDamEventAuditListenerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplEventDamEventAuditListenerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplEventDamEventAuditListenerInfo] = deriveEncoder
}
