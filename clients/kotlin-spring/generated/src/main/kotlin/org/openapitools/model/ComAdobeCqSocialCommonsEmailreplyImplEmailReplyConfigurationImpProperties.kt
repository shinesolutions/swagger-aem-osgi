package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyBoolean
import org.openapitools.model.ConfigNodePropertyDropDown
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
 * @param emailName 
 * @param emailCreatePostFromReply 
 * @param emailAddCommentIdTo 
 * @param emailSubjectMaximumLength 
 * @param emailReplyToAddress 
 * @param emailReplyToDelimiter 
 * @param emailTrackerIdPrefixInSubject 
 * @param emailTrackerIdPrefixInBody 
 * @param emailAsHTML 
 * @param emailDefaultUserName 
 * @param emailTemplatesRootPath 
 */
data class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("email.name")
    @get:JsonProperty("email.name") val emailName: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("email.createPostFromReply")
    @get:JsonProperty("email.createPostFromReply") val emailCreatePostFromReply: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("email.addCommentIdTo")
    @get:JsonProperty("email.addCommentIdTo") val emailAddCommentIdTo: ConfigNodePropertyDropDown? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("email.subjectMaximumLength")
    @get:JsonProperty("email.subjectMaximumLength") val emailSubjectMaximumLength: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("email.replyToAddress")
    @get:JsonProperty("email.replyToAddress") val emailReplyToAddress: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("email.replyToDelimiter")
    @get:JsonProperty("email.replyToDelimiter") val emailReplyToDelimiter: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("email.trackerIdPrefixInSubject")
    @get:JsonProperty("email.trackerIdPrefixInSubject") val emailTrackerIdPrefixInSubject: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("email.trackerIdPrefixInBody")
    @get:JsonProperty("email.trackerIdPrefixInBody") val emailTrackerIdPrefixInBody: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("email.asHTML")
    @get:JsonProperty("email.asHTML") val emailAsHTML: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("email.defaultUserName")
    @get:JsonProperty("email.defaultUserName") val emailDefaultUserName: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("email.templates.rootPath")
    @get:JsonProperty("email.templates.rootPath") val emailTemplatesRootPath: ConfigNodePropertyString? = null
) {

}

