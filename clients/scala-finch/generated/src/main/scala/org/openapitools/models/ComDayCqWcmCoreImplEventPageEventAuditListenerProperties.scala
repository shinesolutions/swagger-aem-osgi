package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param configured 
 */
case class ComDayCqWcmCoreImplEventPageEventAuditListenerProperties(configured: Option[ConfigNodePropertyString]
                )

object ComDayCqWcmCoreImplEventPageEventAuditListenerProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplEventPageEventAuditListenerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplEventPageEventAuditListenerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplEventPageEventAuditListenerProperties] = deriveEncoder
}
