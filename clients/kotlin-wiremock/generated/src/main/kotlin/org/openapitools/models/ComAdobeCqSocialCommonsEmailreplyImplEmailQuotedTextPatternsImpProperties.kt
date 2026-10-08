@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties(
    @field:JsonProperty("pattern.time")
    val patternTime: ConfigNodePropertyString? = null,

    @field:JsonProperty("pattern.newline")
    val patternNewline: ConfigNodePropertyString? = null,

    @field:JsonProperty("pattern.dayOfMonth")
    val patternDayOfMonth: ConfigNodePropertyString? = null,

    @field:JsonProperty("pattern.month")
    val patternMonth: ConfigNodePropertyString? = null,

    @field:JsonProperty("pattern.year")
    val patternYear: ConfigNodePropertyString? = null,

    @field:JsonProperty("pattern.date")
    val patternDate: ConfigNodePropertyString? = null,

    @field:JsonProperty("pattern.dateTime")
    val patternDateTime: ConfigNodePropertyString? = null,

    @field:JsonProperty("pattern.email")
    val patternEmail: ConfigNodePropertyString? = null,

)
