package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties]
                )

object ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo {
    /**
     * Creates the codec for converting ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo] = deriveEncoder
}
