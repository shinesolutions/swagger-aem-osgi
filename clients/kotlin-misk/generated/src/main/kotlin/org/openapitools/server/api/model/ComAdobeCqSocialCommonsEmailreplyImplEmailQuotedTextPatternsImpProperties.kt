package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties(
    val patternTime: ConfigNodePropertyString? = null,
    val patternNewline: ConfigNodePropertyString? = null,
    val patternDayOfMonth: ConfigNodePropertyString? = null,
    val patternMonth: ConfigNodePropertyString? = null,
    val patternYear: ConfigNodePropertyString? = null,
    val patternDate: ConfigNodePropertyString? = null,
    val patternDateTime: ConfigNodePropertyString? = null,
    val patternEmail: ConfigNodePropertyString? = null
)
