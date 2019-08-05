package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreImplEventPageEventAuditListenerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqWcmCoreImplEventPageEventAuditListenerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreImplEventPageEventAuditListenerProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqWcmCoreImplEventPageEventAuditListenerInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplEventPageEventAuditListenerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplEventPageEventAuditListenerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplEventPageEventAuditListenerInfo] = deriveEncoder
}
