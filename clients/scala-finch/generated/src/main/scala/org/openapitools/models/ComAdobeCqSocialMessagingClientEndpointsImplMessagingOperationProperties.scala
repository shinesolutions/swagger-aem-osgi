package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param messagePeriodproperties 
 * @param messageBoxSizeLimit 
 * @param messageCountLimit 
 * @param notifyFailure 
 * @param failureMessageFrom 
 * @param failureTemplatePath 
 * @param maxRetries 
 * @param minWaitBetweenRetries 
 * @param countUpdatePoolSize 
 * @param inboxPeriodpath 
 * @param sentitemsPeriodpath 
 * @param supportAttachments 
 * @param supportGroupMessaging 
 * @param maxTotalRecipients 
 * @param batchSize 
 * @param maxTotalAttachmentSize 
 * @param attachmentTypeBlacklist 
 * @param allowedAttachmentTypes 
 * @param serviceSelector 
 * @param fieldWhitelist 
 */
case class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties(messagePeriodproperties: Option[ConfigNodePropertyArray],
                messageBoxSizeLimit: Option[ConfigNodePropertyInteger],
                messageCountLimit: Option[ConfigNodePropertyInteger],
                notifyFailure: Option[ConfigNodePropertyBoolean],
                failureMessageFrom: Option[ConfigNodePropertyString],
                failureTemplatePath: Option[ConfigNodePropertyString],
                maxRetries: Option[ConfigNodePropertyInteger],
                minWaitBetweenRetries: Option[ConfigNodePropertyInteger],
                countUpdatePoolSize: Option[ConfigNodePropertyInteger],
                inboxPeriodpath: Option[ConfigNodePropertyString],
                sentitemsPeriodpath: Option[ConfigNodePropertyString],
                supportAttachments: Option[ConfigNodePropertyBoolean],
                supportGroupMessaging: Option[ConfigNodePropertyBoolean],
                maxTotalRecipients: Option[ConfigNodePropertyInteger],
                batchSize: Option[ConfigNodePropertyInteger],
                maxTotalAttachmentSize: Option[ConfigNodePropertyInteger],
                attachmentTypeBlacklist: Option[ConfigNodePropertyArray],
                allowedAttachmentTypes: Option[ConfigNodePropertyArray],
                serviceSelector: Option[ConfigNodePropertyString],
                fieldWhitelist: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties] = deriveEncoder
}
