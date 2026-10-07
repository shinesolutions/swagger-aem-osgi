@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties(
    @field:JsonProperty("message.properties")
    val messageProperties: ConfigNodePropertyArray? = null,

    @field:JsonProperty("messageBoxSizeLimit")
    val messageBoxSizeLimit: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("messageCountLimit")
    val messageCountLimit: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("notifyFailure")
    val notifyFailure: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("failureMessageFrom")
    val failureMessageFrom: ConfigNodePropertyString? = null,

    @field:JsonProperty("failureTemplatePath")
    val failureTemplatePath: ConfigNodePropertyString? = null,

    @field:JsonProperty("maxRetries")
    val maxRetries: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("minWaitBetweenRetries")
    val minWaitBetweenRetries: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("countUpdatePoolSize")
    val countUpdatePoolSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("inbox.path")
    val inboxPath: ConfigNodePropertyString? = null,

    @field:JsonProperty("sentitems.path")
    val sentitemsPath: ConfigNodePropertyString? = null,

    @field:JsonProperty("supportAttachments")
    val supportAttachments: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("supportGroupMessaging")
    val supportGroupMessaging: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("maxTotalRecipients")
    val maxTotalRecipients: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("batchSize")
    val batchSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("maxTotalAttachmentSize")
    val maxTotalAttachmentSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("attachmentTypeBlacklist")
    val attachmentTypeBlacklist: ConfigNodePropertyArray? = null,

    @field:JsonProperty("allowedAttachmentTypes")
    val allowedAttachmentTypes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("serviceSelector")
    val serviceSelector: ConfigNodePropertyString? = null,

    @field:JsonProperty("fieldWhitelist")
    val fieldWhitelist: ConfigNodePropertyArray? = null,

)
