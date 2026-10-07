package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties(
    val translateLanguage: ConfigNodePropertyDropDown? = null,
    val translateDisplay: ConfigNodePropertyDropDown? = null,
    val translateAttribution: ConfigNodePropertyBoolean? = null,
    val translateCaching: ConfigNodePropertyDropDown? = null,
    val translateSmartRendering: ConfigNodePropertyDropDown? = null,
    val translateCachingDuration: ConfigNodePropertyString? = null,
    val translateSessionSaveInterval: ConfigNodePropertyString? = null,
    val translateSessionSaveBatchLimit: ConfigNodePropertyString? = null
)
