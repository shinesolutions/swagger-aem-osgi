package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties(
    val emailName: ConfigNodePropertyString? = null,
    val emailCreatePostFromReply: ConfigNodePropertyBoolean? = null,
    val emailAddCommentIdTo: ConfigNodePropertyDropDown? = null,
    val emailSubjectMaximumLength: ConfigNodePropertyInteger? = null,
    val emailReplyToAddress: ConfigNodePropertyString? = null,
    val emailReplyToDelimiter: ConfigNodePropertyString? = null,
    val emailTrackerIdPrefixInSubject: ConfigNodePropertyString? = null,
    val emailTrackerIdPrefixInBody: ConfigNodePropertyString? = null,
    val emailAsHTML: ConfigNodePropertyBoolean? = null,
    val emailDefaultUserName: ConfigNodePropertyString? = null,
    val emailTemplatesRootPath: ConfigNodePropertyString? = null
)
