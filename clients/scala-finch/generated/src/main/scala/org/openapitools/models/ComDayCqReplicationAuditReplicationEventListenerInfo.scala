package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqReplicationAuditReplicationEventListenerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqReplicationAuditReplicationEventListenerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqReplicationAuditReplicationEventListenerProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqReplicationAuditReplicationEventListenerInfo {
    /**
     * Creates the codec for converting ComDayCqReplicationAuditReplicationEventListenerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqReplicationAuditReplicationEventListenerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqReplicationAuditReplicationEventListenerInfo] = deriveEncoder
}
