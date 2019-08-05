package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param notifyPeriodonupdate 
 * @param notifyPeriodoncomplete 
 */
case class ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties(notifyPeriodonupdate: Option[ConfigNodePropertyBoolean],
                notifyPeriodoncomplete: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties {
    /**
     * Creates the codec for converting ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties] = deriveEncoder
}
