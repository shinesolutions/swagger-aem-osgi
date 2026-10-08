package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties(
    val syncTranslationStateSchedulingFormat: ConfigNodePropertyString? = null,
    val schedulingRepeatTranslationSchedulingFormat: ConfigNodePropertyString? = null,
    val syncTranslationStateLockTimeoutInMinutes: ConfigNodePropertyString? = null,
    val exportFormat: ConfigNodePropertyDropDown? = null
)
