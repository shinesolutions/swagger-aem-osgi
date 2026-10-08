package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties(
    val messageProperties: ConfigNodePropertyArray? = null,
    val messageBoxSizeLimit: ConfigNodePropertyInteger? = null,
    val messageCountLimit: ConfigNodePropertyInteger? = null,
    val notifyFailure: ConfigNodePropertyBoolean? = null,
    val failureMessageFrom: ConfigNodePropertyString? = null,
    val failureTemplatePath: ConfigNodePropertyString? = null,
    val maxRetries: ConfigNodePropertyInteger? = null,
    val minWaitBetweenRetries: ConfigNodePropertyInteger? = null,
    val countUpdatePoolSize: ConfigNodePropertyInteger? = null,
    val inboxPath: ConfigNodePropertyString? = null,
    val sentitemsPath: ConfigNodePropertyString? = null,
    val supportAttachments: ConfigNodePropertyBoolean? = null,
    val supportGroupMessaging: ConfigNodePropertyBoolean? = null,
    val maxTotalRecipients: ConfigNodePropertyInteger? = null,
    val batchSize: ConfigNodePropertyInteger? = null,
    val maxTotalAttachmentSize: ConfigNodePropertyInteger? = null,
    val attachmentTypeBlacklist: ConfigNodePropertyArray? = null,
    val allowedAttachmentTypes: ConfigNodePropertyArray? = null,
    val serviceSelector: ConfigNodePropertyString? = null,
    val fieldWhitelist: ConfigNodePropertyArray? = null
)
