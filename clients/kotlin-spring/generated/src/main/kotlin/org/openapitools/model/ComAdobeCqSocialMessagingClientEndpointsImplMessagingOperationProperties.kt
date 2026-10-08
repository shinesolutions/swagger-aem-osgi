package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyBoolean
import org.openapitools.model.ConfigNodePropertyInteger
import org.openapitools.model.ConfigNodePropertyString
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param messageProperties 
 * @param messageBoxSizeLimit 
 * @param messageCountLimit 
 * @param notifyFailure 
 * @param failureMessageFrom 
 * @param failureTemplatePath 
 * @param maxRetries 
 * @param minWaitBetweenRetries 
 * @param countUpdatePoolSize 
 * @param inboxPath 
 * @param sentitemsPath 
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
data class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("message.properties")
    @get:JsonProperty("message.properties") val messageProperties: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("messageBoxSizeLimit")
    @get:JsonProperty("messageBoxSizeLimit") val messageBoxSizeLimit: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("messageCountLimit")
    @get:JsonProperty("messageCountLimit") val messageCountLimit: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("notifyFailure")
    @get:JsonProperty("notifyFailure") val notifyFailure: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("failureMessageFrom")
    @get:JsonProperty("failureMessageFrom") val failureMessageFrom: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("failureTemplatePath")
    @get:JsonProperty("failureTemplatePath") val failureTemplatePath: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("maxRetries")
    @get:JsonProperty("maxRetries") val maxRetries: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("minWaitBetweenRetries")
    @get:JsonProperty("minWaitBetweenRetries") val minWaitBetweenRetries: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("countUpdatePoolSize")
    @get:JsonProperty("countUpdatePoolSize") val countUpdatePoolSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("inbox.path")
    @get:JsonProperty("inbox.path") val inboxPath: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("sentitems.path")
    @get:JsonProperty("sentitems.path") val sentitemsPath: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("supportAttachments")
    @get:JsonProperty("supportAttachments") val supportAttachments: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("supportGroupMessaging")
    @get:JsonProperty("supportGroupMessaging") val supportGroupMessaging: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("maxTotalRecipients")
    @get:JsonProperty("maxTotalRecipients") val maxTotalRecipients: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("batchSize")
    @get:JsonProperty("batchSize") val batchSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("maxTotalAttachmentSize")
    @get:JsonProperty("maxTotalAttachmentSize") val maxTotalAttachmentSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("attachmentTypeBlacklist")
    @get:JsonProperty("attachmentTypeBlacklist") val attachmentTypeBlacklist: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("allowedAttachmentTypes")
    @get:JsonProperty("allowedAttachmentTypes") val allowedAttachmentTypes: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("serviceSelector")
    @get:JsonProperty("serviceSelector") val serviceSelector: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("fieldWhitelist")
    @get:JsonProperty("fieldWhitelist") val fieldWhitelist: ConfigNodePropertyArray? = null
) {

}

