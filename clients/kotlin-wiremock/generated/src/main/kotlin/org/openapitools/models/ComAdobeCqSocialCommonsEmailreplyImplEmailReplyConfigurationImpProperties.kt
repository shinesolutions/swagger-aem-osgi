@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties(
    @field:JsonProperty("email.name")
    val emailName: ConfigNodePropertyString? = null,

    @field:JsonProperty("email.createPostFromReply")
    val emailCreatePostFromReply: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("email.addCommentIdTo")
    val emailAddCommentIdTo: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("email.subjectMaximumLength")
    val emailSubjectMaximumLength: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("email.replyToAddress")
    val emailReplyToAddress: ConfigNodePropertyString? = null,

    @field:JsonProperty("email.replyToDelimiter")
    val emailReplyToDelimiter: ConfigNodePropertyString? = null,

    @field:JsonProperty("email.trackerIdPrefixInSubject")
    val emailTrackerIdPrefixInSubject: ConfigNodePropertyString? = null,

    @field:JsonProperty("email.trackerIdPrefixInBody")
    val emailTrackerIdPrefixInBody: ConfigNodePropertyString? = null,

    @field:JsonProperty("email.asHTML")
    val emailAsHTML: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("email.defaultUserName")
    val emailDefaultUserName: ConfigNodePropertyString? = null,

    @field:JsonProperty("email.templates.rootPath")
    val emailTemplatesRootPath: ConfigNodePropertyString? = null,

)
