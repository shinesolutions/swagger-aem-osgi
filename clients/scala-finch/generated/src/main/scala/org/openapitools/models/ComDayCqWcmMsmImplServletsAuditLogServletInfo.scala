package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmMsmImplServletsAuditLogServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmMsmImplServletsAuditLogServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmMsmImplServletsAuditLogServletProperties]
                )

object ComDayCqWcmMsmImplServletsAuditLogServletInfo {
    /**
     * Creates the codec for converting ComDayCqWcmMsmImplServletsAuditLogServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmMsmImplServletsAuditLogServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmMsmImplServletsAuditLogServletInfo] = deriveEncoder
}
