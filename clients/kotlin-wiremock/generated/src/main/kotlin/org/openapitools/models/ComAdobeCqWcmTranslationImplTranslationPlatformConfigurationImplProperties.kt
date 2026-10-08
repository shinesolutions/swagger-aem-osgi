@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties(
    @field:JsonProperty("syncTranslationState.schedulingFormat")
    val syncTranslationStateSchedulingFormat: ConfigNodePropertyString? = null,

    @field:JsonProperty("schedulingRepeatTranslation.schedulingFormat")
    val schedulingRepeatTranslationSchedulingFormat: ConfigNodePropertyString? = null,

    @field:JsonProperty("syncTranslationState.lockTimeoutInMinutes")
    val syncTranslationStateLockTimeoutInMinutes: ConfigNodePropertyString? = null,

    @field:JsonProperty("export.format")
    val exportFormat: ConfigNodePropertyDropDown? = null,

)
