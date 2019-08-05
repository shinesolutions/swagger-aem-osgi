package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param eventPeriodfilter 
 * @param enabled 
 */
case class ComDayCqDamCoreImplEventDamEventAuditListenerProperties(eventPeriodfilter: Option[ConfigNodePropertyString],
                enabled: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamCoreImplEventDamEventAuditListenerProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplEventDamEventAuditListenerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplEventDamEventAuditListenerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplEventDamEventAuditListenerProperties] = deriveEncoder
}
