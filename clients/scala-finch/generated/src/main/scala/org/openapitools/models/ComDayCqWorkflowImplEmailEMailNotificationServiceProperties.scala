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
 * @param fromPeriodaddress 
 * @param hostPeriodprefix 
 * @param notifyPeriodonabort 
 * @param notifyPeriodoncomplete 
 * @param notifyPeriodoncontainercomplete 
 * @param notifyPerioduseronly 
 */
case class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties(fromPeriodaddress: Option[ConfigNodePropertyString],
                hostPeriodprefix: Option[ConfigNodePropertyString],
                notifyPeriodonabort: Option[ConfigNodePropertyBoolean],
                notifyPeriodoncomplete: Option[ConfigNodePropertyBoolean],
                notifyPeriodoncontainercomplete: Option[ConfigNodePropertyBoolean],
                notifyPerioduseronly: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqWorkflowImplEmailEMailNotificationServiceProperties {
    /**
     * Creates the codec for converting ComDayCqWorkflowImplEmailEMailNotificationServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWorkflowImplEmailEMailNotificationServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWorkflowImplEmailEMailNotificationServiceProperties] = deriveEncoder
}
